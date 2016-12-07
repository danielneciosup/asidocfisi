package pe.edu.sistemas.asidoc.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.sistemas.asidoc.core.dao.DAOImpl;
import pe.edu.sistemas.asidoc.dao.UsuarioDao;
import pe.edu.sistemas.asidoc.dao.dominio.Usuario;
import pe.edu.sistemas.asidoc.bo.PersonalBO;
import pe.edu.sistemas.asidoc.bo.RolBO;
import pe.edu.sistemas.asisdoc.core.util.BaseDAO;
import pe.edu.sistemas.asisdoc.core.util.Conexion;

@Repository( "usuarioDao" )
@Transactional
public class UsuarioDaoImpl extends DAOImpl< Usuario, Integer > implements UsuarioDao
{
	public Usuario obtenerUsuario(Integer idUsuario) throws Exception
	{
		return super.obtenerEntidadPorId( Usuario.class, idUsuario );
	}

	@Override
	public Integer autenticarUsuario(String nomUsuario, String nomContrasenia) 
	{
		Integer pertenece = 0;
		
		Connection connection = null;
		
		CallableStatement statement = null;
		
		ResultSet resultSet = null;		
		
		try 
		{
			connection = Conexion.obtenerConexion();
			statement = connection.prepareCall( "{ ? = call dbasidoc.fn_autenticar_usuario(?,?) }" );
			statement.setString( 2, nomUsuario );
			statement.setString( 3, nomContrasenia );
			statement.registerOutParameter( 1, Types.INTEGER );
			statement.execute();
			
			pertenece = statement.getInt( 1 );
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			BaseDAO.cerrarResultSet(resultSet);
			BaseDAO.cerrarCallable(statement);
			BaseDAO.cerrarConexion(connection);			
		}			
		
		return pertenece;
	}

	@Override
	public List<RolBO> obtenerRolesPorUsuarioId(Integer idUsuario) 
	{
		List<RolBO> rolesBO = new ArrayList<RolBO>();
		
		Connection connection = null;
		
		PreparedStatement statement = null;
		
		ResultSet resultSet = null;	
		
		try 
		{
			connection = Conexion.obtenerConexion();
			statement = connection.prepareStatement( "SELECT O.ID_ROL,O.NOM_ROL " + 
											         "FROM dbasidoc.USUARIO U " +
											         "INNER JOIN dbasidoc.USUARIO_ROL UR ON U.ID_USUARIO = UR.ID_USUARIO " +
											         "INNER JOIN dbasidoc.ROL O ON UR.ID_ROL = O.ID_ROL " +
											         "WHERE U.ID_USUARIO = ?;" );			
			statement.setInt( 1, idUsuario );
			
			
			resultSet = statement.executeQuery();
			
			RolBO rolBO;
			
			if( resultSet != null )
			{				
				while ( resultSet.next() ) 
				{	
					rolBO = new RolBO( resultSet.getInt( 1 ) , resultSet.getString( 2 ) );
					rolesBO.add( rolBO );
					System.out.println( "Rol " + rolBO.getNomRol() );
				}
			}			
		}
		catch ( SQLException e ) 
		{
			e.printStackTrace();
		}
		finally
		{
			BaseDAO.cerrarResultSet( resultSet );
			BaseDAO.cerrarStatement( statement );
			BaseDAO.cerrarConexion( connection );
		}			
		
		return rolesBO;
	}

	@Override
	public PersonalBO obtenerDatosPersonalesPorIdUsuario( Integer idUsuario ) 
	{
		PersonalBO personalBO = null;
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		
		try 
		{
			connection = Conexion.obtenerConexion();
			statement = connection.prepareCall( "SELECT p.* " +   
											    "FROM dbasidoc.personal p, dbasidoc.usuario  u " +
											    "WHERE p.id_personal = u.id_personal " +
											    "AND u.id_usuario = ?;" );			
			statement.setInt( 1, idUsuario );
			statement.execute();
			
			result = statement.executeQuery();
			
			if( result.next() )
			{
				personalBO = new PersonalBO( result.getInt( 1 ), result.getString( 2 ), result.getString( 3 ), result.getString( 4 ) );
				System.out.println( personalBO.getCorreo() );
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			BaseDAO.cerrarResultSet( result );
			BaseDAO.cerrarStatement( statement );
			BaseDAO.cerrarConexion( connection );
		}
		
		return personalBO;
	}	
}

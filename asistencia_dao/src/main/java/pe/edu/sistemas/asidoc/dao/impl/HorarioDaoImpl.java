package pe.edu.sistemas.asidoc.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.sistemas.asidoc.bo.HorarioBO;
import pe.edu.sistemas.asidoc.dao.HorarioDao;
import pe.edu.sistemas.asisdoc.core.util.BaseDAO;
import pe.edu.sistemas.asisdoc.core.util.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 03/12/2016.
 */
@Repository( "horarioDao" )
@Transactional
public class HorarioDaoImpl implements HorarioDao
{
    @Override
    public List<HorarioBO> listarHorarios()
    {
        return listarHorariosConFiltro( "", "", "", "", "" );
    }

    @Override
    public List<HorarioBO> listarHorariosConFiltro( String nomCurso, String nomDia, String nomDoc, String nomApePat, String nomApeMat )
    {
        List<HorarioBO> horarioBOs = new ArrayList<>();

        Connection connection = null;

        PreparedStatement function = null;

        ResultSet resultados = null;

        try
        {
            connection = Conexion.obtenerConexion();
            function = connection.prepareStatement( "SELECT * FROM dbasidoc.fn_listar_horarios( ?, ?, ?, ?, ? )" );
            function.setString( 1, "" );
            function.setString( 2, "" );
            function.setString( 3, "" );
            function.setString( 4, "" );
            function.setString( 5, "" );

            resultados = function.executeQuery();

            HorarioBO horarioBO;

            if ( resultados != null )
            {
                while ( resultados.next() )
                {
                    horarioBO = new HorarioBO();
                    horarioBO.setNomCurso( resultados.getString( 1 ) );
                    horarioBO.setNomDia( resultados.getString( 2 ) );
                    horarioBO.setNomDocente( resultados.getString( 3 ) );
                    horarioBO.setHoInicio( resultados.getString( 4 ) );
                    horarioBO.setHoFin( resultados.getString( 5 ) );
                    horarioBO.setNomGrupo( resultados.getString( 6 ) );
                    horarioBO.setNomTipoClase( resultados.getString( 7 ) );

                    horarioBOs.add( horarioBO );
                    System.out.println( horarioBO.toString() );
                }
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            BaseDAO.cerrarResultSet( resultados );
            BaseDAO.cerrarStatement( function );
            BaseDAO.cerrarConexion( connection );
        }

        return horarioBOs;
    }
}

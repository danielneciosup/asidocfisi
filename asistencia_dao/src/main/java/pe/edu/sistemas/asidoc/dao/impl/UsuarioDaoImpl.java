package pe.edu.sistemas.asidoc.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.sistemas.asidoc.core.dao.DAOImpl;
import pe.edu.sistemas.asidoc.dao.UsuarioDao;
import pe.edu.sistemas.asidoc.dao.dominio.Usuario;

@Repository( "usuarioDao" )
@Transactional
public class UsuarioDaoImpl extends DAOImpl< Usuario, Integer > implements UsuarioDao  
{
	public Usuario obtenerUsuario(Integer idUsuario) throws Exception 
	{
		return super.obtenerEntidadPorId( Usuario.class, idUsuario );
	}	
}

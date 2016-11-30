package pe.edu.sistemas.asidoc.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sistemas.asidoc.bo.UsuarioBO;
import pe.edu.sistemas.asidoc.dao.UsuarioDao;
import pe.edu.sistemas.asidoc.servicio.UsuarioService;
import pe.edu.sistemas.asidoc.servicio.transformer.UsuarioTransformerToBO;

@Service( "usuarioService" )
public class UsuarioServiceImpl implements UsuarioService
{
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Autowired
	private UsuarioTransformerToBO usuarioTransformerToBO; 
	
	public UsuarioBO obtenerUsuario( Integer idUsuario ) throws Exception 
	{
		return usuarioTransformerToBO.transformer( usuarioDao.obtenerUsuario( idUsuario ) );
	}

	@Override
	public Integer autenticarUsuario(String nomUsuario, String contrasenia) throws Exception
	{
		// TODO Auto-generated method stub
		Integer pertenece = 0;
		
		pertenece = usuarioDao.autenticarUsuario(nomUsuario, contrasenia);
		
		System.out.println( pertenece );
		
		return pertenece;
	}
}

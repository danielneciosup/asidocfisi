package pe.edu.sistemas.asidoc.servicio;

import pe.edu.sistemas.asidoc.bo.UsuarioBO;

public interface UsuarioService 
{
	public Integer autenticarUsuario( String nomUsuario, String contrasenia ) throws Exception;	
	public UsuarioBO obtenerUsuario( Integer idUsuario ) throws Exception;
}

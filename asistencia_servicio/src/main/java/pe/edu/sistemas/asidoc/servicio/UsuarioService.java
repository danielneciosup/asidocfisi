package pe.edu.sistemas.asidoc.servicio;

import pe.edu.sistemas.asidoc.bo.UsuarioBO;

public interface UsuarioService 
{
	public UsuarioBO obtenerUsuario( Integer idUsuario ) throws Exception;
}

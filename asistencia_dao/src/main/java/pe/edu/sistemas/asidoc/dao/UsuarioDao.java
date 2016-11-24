package pe.edu.sistemas.asidoc.dao;

import pe.edu.sistemas.asidoc.dao.dominio.Usuario;

public interface UsuarioDao 
{
	public Usuario obtenerUsuario( Integer idUsuario ) throws Exception;
}

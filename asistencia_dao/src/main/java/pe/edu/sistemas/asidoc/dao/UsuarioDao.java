package pe.edu.sistemas.asidoc.dao;

import pe.edu.sistemas.asidoc.dao.dominio.Usuario;

public interface UsuarioDao 
{
	/**
	 * Método que Obtiene los datos de usuario por su id.
	 * 
	 * @param idUsuario que identifica el usuario.
	 * @return la entidad usuario de la base de datos.
	 * @throws Exception
	 */
	public Usuario obtenerUsuario( Integer idUsuario ) throws Exception;
	
	/**
	 * Verifica si el usuario y la contraseña ingresados existen en la base de 
	 * datos.
	 * 
	 * @param nomUsuario el nickname del usuario.
	 * @param nomContrasenia es la contreseña del usuario.
	 * @return 1 si exite en la base de datos; sino null.
	 */
	public Integer autenticarUsuario( String nomUsuario, String nomContrasenia );
}

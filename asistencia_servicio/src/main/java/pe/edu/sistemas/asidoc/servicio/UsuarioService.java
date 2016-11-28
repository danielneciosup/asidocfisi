package pe.edu.sistemas.asidoc.servicio;

import pe.edu.sistemas.asidoc.bo.UsuarioBO;

public interface UsuarioService 
{
	/**
	 * Verifica la existencia del usuario en la base de datos.
	 * @param nomUsuario el nickname del usuario.
	 * @param contrasenia la contraseña del docente.
	 * @return 1 si el usuario existe en la base de datos, sino null.
	 * @throws Exception
	 */
	public Integer autenticarUsuario( String nomUsuario, String contrasenia ) throws Exception;
	
	/**
	 * Obtiene los datos del usuario de la base de datos.
	 * @param idUsuario idetificador del usuario.
	 * @return la entidad correspondiente al identificador del usuario.
	 * @throws Exception
	 */
	public UsuarioBO obtenerUsuario( Integer idUsuario ) throws Exception;
}

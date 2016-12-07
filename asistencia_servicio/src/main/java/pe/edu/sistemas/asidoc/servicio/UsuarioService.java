package pe.edu.sistemas.asidoc.servicio;

import java.util.List;

import pe.edu.sistemas.asidoc.bo.UsuarioBO;
import pe.edu.sistemas.asidoc.bo.PersonalBO;
import pe.edu.sistemas.asidoc.bo.RolBO;

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
	public UsuarioBO obtenerUsuario(Integer idUsuario ) throws Exception;
	
	/**
	 * Obtiene los roles del usuario.
	 * @param idUsuario es el identificador del usuario.
	 * @return una lista que contiene los roles del usuario.
	 * @throws Exception excepciones sql.
	 */
	public List<RolBO > obtenerRolesPorIdUsuario( Integer idUsuario ) throws Exception;
	
	/**
	 * Obtiene los datos personales de un usuario.
	 * @param idUsuario es el identificador del usuario.
	 * @return un objeto con los datos personales del usuario.
	 * @throws Exception son las excepciones sql.
	 */
	public PersonalBO obtenerDatosPersonalesPorIdUsuario( Integer idUsuario ) throws Exception;
}

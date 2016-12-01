package pe.edu.sistemas.asidoc.dao;

import java.util.List;

import pe.edu.sistemas.asidoc.bo.PersonalBO;
import pe.edu.sistemas.asidoc.bo.RolBO;
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
	
	/**
	 * Obtiene los distintos roles que tiene un usuario identificado por {idUsuario}
	 * @param idUsuario es el identificador del usuario
	 * @return una lista de los roles que tiene el usuario.
	 */
	public List<RolBO> obtenerRolesPorUsuarioId( Integer idUsuario );
	
	public PersonalBO obtenerDatosPersonalesPorIdUsuario( Integer idUsuario );
}

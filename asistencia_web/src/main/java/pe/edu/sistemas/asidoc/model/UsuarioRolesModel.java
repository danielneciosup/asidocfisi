package pe.edu.sistemas.asidoc.model;

import java.util.List;

import org.springframework.stereotype.Component;

import pe.edu.sistemas.asidoc.bo.PersonalBO;
import pe.edu.sistemas.asidoc.bo.RolBO;

@Component( "usuarioRolesModel" )
public class UsuarioRolesModel 
{
	private List<RolBO> roles;
	private PersonalBO personal;
	
	public List<RolBO> getRoles() 
	{
		return roles;
	}
	
	public void setRoles(List<RolBO> roles) 
	{
		this.roles = roles;
	}
	
	public PersonalBO getPersonal() 
	{
		return personal;
	}
	
	public void setPersonal(PersonalBO personal) 
	{
		this.personal = personal;
	}	
}

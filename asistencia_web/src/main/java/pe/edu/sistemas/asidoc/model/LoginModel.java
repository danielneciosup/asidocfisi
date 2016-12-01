package pe.edu.sistemas.asidoc.model;

import org.springframework.stereotype.Component;

@Component( "loginModel" )
public class LoginModel 
{
	private String usuario;
	private String clave;	
	
	public LoginModel() 
	{
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}	
}

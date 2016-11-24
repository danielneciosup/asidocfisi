package pe.edu.sistemas.asidoc.model;

import org.springframework.stereotype.Component;

@Component( "loginModel" )
public class LoginModel 
{
	private String usuario;
	private String clave;
	private String rol;
	
	public LoginModel() 
	{
		// TODO Auto-generated constructor stub
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

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}

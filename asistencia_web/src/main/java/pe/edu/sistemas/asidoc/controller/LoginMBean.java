package pe.edu.sistemas.asidoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.sistemas.asidoc.model.LoginModel;
import pe.edu.sistemas.asidoc.servicio.UsuarioService;
import pe.edu.sistemas.asidoc.util.Enlaces;

@Controller
public class LoginMBean
{
	@Autowired
	private LoginModel loginModel;
	
	@Autowired
	private UsuarioService usuarioService;
		
	@RequestMapping( value = "/" )
	public String inicio()
	{
		return Enlaces.INICIO;
	}
	
	@RequestMapping( value = "/roles" )
	public String roles()
	{
		return Enlaces.ROLES;
	}
}

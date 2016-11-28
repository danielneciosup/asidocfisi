package pe.edu.sistemas.asidoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String roles() throws Exception
	{		
		int pertenece = usuarioService.autenticarUsuario( loginModel.getUsuario(), loginModel.getClave() );
				
		return Enlaces.ROLES;
	}
	
	// Login form with error
   @RequestMapping("/login_error")
   public String loginError(Model model) 
   {
      model.addAttribute("loginError", true);
      return Enlaces.INICIO;
   }   
}

package pe.edu.sistemas.asidoc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String inicio(Model model)
	{
		model.addAttribute( "loginModel", loginModel );
		model.addAttribute("message", "");
		return Enlaces.INICIO;
	}

	@RequestMapping( value = "/roles" , method = RequestMethod.POST )
	public String roles( @ModelAttribute LoginModel loginModel, Model model )
	{		
		int pertenece = 0;
		try 
		{
			pertenece = usuarioService.autenticarUsuario( loginModel.getUsuario(), loginModel.getClave() );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage() );
		}

		model.addAttribute( "loginModel", loginModel );
		model.addAttribute( "message", "Credenciales incorrectas" );
		
		if( pertenece != 0 )
			return Enlaces.ROLES;
		else 
			return Enlaces.INICIO;
	}
	
   @RequestMapping("/login_error")
   public String loginError(Model model) 
   {
      model.addAttribute("loginError", true);
      return Enlaces.INICIO;
   }   
}

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
		
	//@RequestMapping( value = "/" )
	@RequestMapping( value = "/" )
	public String inicio(Model model)
	{
		model.addAttribute("loginModel",loginModel);
		model.addAttribute("message","Normal");
		return Enlaces.INICIO;
	}
	
	/*@RequestMapping( value = "/" , method = RequestMethod.GET )
	public String rolesForm(Model model){
		LoginModel loginModel = new LoginModel();
		model.addAttribute("loginModel", loginModel);
		return Enlaces.INICIO;
	}*/
	
	//@RequestMapping( value = "/roles" )
	@RequestMapping( value = "/roles" , method = RequestMethod.POST )
	//public String roles(@ModelAttribute LoginModel loginModel, BindingResult bindingResult, MultipartHttpServletRequest request)
	public String roles(@ModelAttribute LoginModel loginModel, Model model)
	{		
		int pertenece = 0;
		try 
		{
			pertenece = usuarioService.autenticarUsuario( loginModel.getUsuario(), loginModel.getClave() );
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage() );
		}
		
		//System.out.println( loginModel.getUsuario() );
		//System.out.println( loginModel.getClave() );
		//System.out.println( pertenece );
		
		model.addAttribute("loginModel",loginModel);
		model.addAttribute("message","Credenciales incorrectas");
		if( pertenece == 1 )
			return Enlaces.ROLES;
		else 
			return Enlaces.INICIO;
	}
	
	// Login form with error
   @RequestMapping("/login_error")
   public String loginError(Model model) 
   {
      model.addAttribute("loginError", true);
      return Enlaces.INICIO;
   }   
   
   
   /*public ResponseEntity<String> login()
   {
	   
	   
	   
	   return new ResponseEntity<String>(HttpStatus.OK);
	   return new ResponseEntity<String>(HttpStatus.FORBIDDEN);
   }*/
}

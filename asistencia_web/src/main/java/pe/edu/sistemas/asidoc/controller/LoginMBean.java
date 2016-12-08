package pe.edu.sistemas.asidoc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.edu.sistemas.asidoc.bo.PersonalBO;
import pe.edu.sistemas.asidoc.bo.RolBO;
import pe.edu.sistemas.asidoc.model.LoginModel;
import pe.edu.sistemas.asidoc.servicio.UsuarioService;
import pe.edu.sistemas.asidoc.util.Enlaces;

@Controller
public class LoginMBean
{
	@Autowired
	private LoginModel loginModel;

	private List<RolBO> roles;
	
	private PersonalBO personal;
		
	@Autowired
	private UsuarioService usuarioService;
		
	@RequestMapping( value = "/" )
	public String inicio( Model model)
	{		
		model.addAttribute( "loginModel", loginModel );
		model.addAttribute("message", "");
		return Enlaces.INICIO;
	}

	@RequestMapping( value = "/roles" , method = RequestMethod.POST )
	public String roles( @ModelAttribute LoginModel loginModel, Model model, HttpServletRequest request )
	{		
		int idUsuario = 0;
		try 
		{
			idUsuario = usuarioService.autenticarUsuario( loginModel.getUsuario(), loginModel.getClave() );
		} 
		catch ( Exception e )
		{
			e.printStackTrace();
			System.out.println(e.getMessage() );
		}

		model.addAttribute( "loginModel", loginModel );
		model.addAttribute( "message", "Credenciales incorrectas" );
		
		if( idUsuario != 0 )
		{
			try 
			{
				roles = usuarioService.obtenerRolesPorIdUsuario( idUsuario );
				personal = usuarioService.obtenerDatosPersonalesPorIdUsuario( idUsuario );
				model.addAttribute( "roles", roles );
				model.addAttribute( "personal", personal );
				request.getSession().setAttribute( "nombre", personal.getNombre() );
				request.getSession().setAttribute( "apellido", personal.getApellido() );
				request.getSession().setAttribute( "isLogout", 0 );
				
			} 
			catch ( Exception e )
			{
				e.printStackTrace();
			}
			
			return Enlaces.ROLES;
		}
		else 
			return Enlaces.INICIO;
	}
	
   @RequestMapping("/login_error")
   public String loginError( Model model  )  
   {
      model.addAttribute("loginError", true);
      return Enlaces.INICIO;
   }
   
   @RequestMapping("/logout")
   public String logout(HttpServletRequest request)
   {
      request.getSession().setAttribute("isLogout",1);
      return "redirect:/";
   }
}
							
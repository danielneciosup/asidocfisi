package pe.edu.sistemas.asidoc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.edu.sistemas.asidoc.util.Enlaces;

@Controller
public class RolesMBean
{
	
	
	@RequestMapping( value = "/administracion" , method= RequestMethod.GET )
	public String administracion(Model model, HttpServletRequest request)
	{		
		try
		{
			Integer isLogout = Integer.parseInt(request.getSession().getAttribute("isLogout").toString());
			if( isLogout != null && isLogout == 1 )
			{
				return "redirect:/";
			}
		}
		catch(Exception ex)
		{
			return "redirect:/";
		}
		
		return Enlaces.ADMINISTRACION;
	}
}

package pe.edu.sistemas.asidoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.edu.sistemas.asidoc.bo.DocenteBO;
import pe.edu.sistemas.asidoc.servicio.DocenteService;

@Controller
public class DocenteMBean 
{
	@Autowired
	private DocenteService docenteService;	
	
	private DocenteBO docente;
	
	@RequestMapping( value = "/mostrar/{id}", method = RequestMethod.GET )
	public String leerDocentePorId( @PathVariable( "id" ) Integer id, Model model )
	{
		try 
		{
			docente = docenteService.obtenerDocentePorId( id );
			System.out.println(docente.getNumDni());
			model.addAttribute( "docente", docente );
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return "ver_docente";
	}
}

package pe.edu.sistemas.asidoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class AdministracionMBean 
{
	@RequestMapping( value = "/docente", method = RequestMethod.GET )
	public String crudDocentes()
	{			
		return "docente";
	}
	
	@RequestMapping( value = "/horarios", method = RequestMethod.GET )
	public String crudHorarios()
	{			
		return "horarios";
	}
}

package pe.edu.sistemas.asidoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdministracionMBean 
{
	@RequestMapping( value = "/docente", method = RequestMethod.GET )
	public String crudDocentes()
	{
		return "docente";
	}
	
	@RequestMapping( value = "/modificarDocente", method = RequestMethod.GET )
	public String modificarDocente()
	{
		return "modificar_docente";
	}
	
	@RequestMapping( value = "/cursos", method = RequestMethod.GET )
	public String crudCursos()
	{
		return "cursos";
	}
	
	@RequestMapping( value = "/horarios", method = RequestMethod.GET )
	public String crudHorarios()
	{			
		return "horarios";
	}
}

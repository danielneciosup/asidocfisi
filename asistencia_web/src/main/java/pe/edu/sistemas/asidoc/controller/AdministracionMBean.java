package pe.edu.sistemas.asidoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.edu.sistemas.asidoc.bo.DocenteBO;
import pe.edu.sistemas.asidoc.servicio.DocenteService;

import java.util.List;

@Controller
public class AdministracionMBean 
{
	@Autowired
	private DocenteService docenteService;

	private List<DocenteBO> docentes;

	@RequestMapping( value = "/docente", method = RequestMethod.GET )
	public String crudDocentes( Model docentesModel)
	{
		try
		{
			docentes = docenteService.listarDocentes();

			docentesModel.addAttribute( "docentes", docentes );
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

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

	@RequestMapping( value = "/asistencias", method = RequestMethod.GET )
	public String controlAsistencias()
	{
		return "generar_reportes";
	}
}
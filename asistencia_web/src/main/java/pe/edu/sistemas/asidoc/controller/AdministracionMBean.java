package pe.edu.sistemas.asidoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.edu.sistemas.asidoc.bo.CursoBO;
import pe.edu.sistemas.asidoc.bo.DocenteBO;
import pe.edu.sistemas.asidoc.bo.HorarioBO;
import pe.edu.sistemas.asidoc.servicio.CursoService;
import pe.edu.sistemas.asidoc.servicio.DocenteService;
import pe.edu.sistemas.asidoc.servicio.transformer.HorarioService;

import java.util.List;

@Controller
public class AdministracionMBean 
{
	@Autowired
	private DocenteService docenteService;

	@Autowired
	private CursoService cursoService;

	@Autowired
	private HorarioService horarioService;

	private List<DocenteBO> docentes;
	private List<CursoBO> cursos;
	private List<HorarioBO> horarios;

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
	public String crudCursos( Model cursosModel )
	{
		try
		{
			cursos = cursoService.listarCursos();

			cursosModel.addAttribute( "cursos", cursos );
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return "cursos";
	}
	
	@RequestMapping( value = "/horarios", method = RequestMethod.GET )
	public String crudHorarios( Model horariosModel )
	{
		horarios = horarioService.listarHorarios();

		horariosModel.addAttribute( "horarios", horarios );

		return "horarios";
	}

	@RequestMapping( value = "/asistencias", method = RequestMethod.GET )
	public String controlAsistencias()
	{
		return "generar_reportes";
	}
}
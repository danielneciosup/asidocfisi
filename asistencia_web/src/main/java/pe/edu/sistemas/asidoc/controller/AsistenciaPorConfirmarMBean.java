package pe.edu.sistemas.asidoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Daniel on 05/12/2016.
 */
@Controller
public class AsistenciaPorConfirmarMBean
{
    @RequestMapping( value = "/confirmar-asistencia", method = RequestMethod.GET )
    public String listarAsistenciasPorConfirmar()
    {
        return "confirmar_asistencia";
    }
}

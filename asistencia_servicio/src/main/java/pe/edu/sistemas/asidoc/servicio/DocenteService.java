package pe.edu.sistemas.asidoc.servicio;

import pe.edu.sistemas.asidoc.bo.DocenteBO;

import java.util.List;

/**
 * Created by Daniel on 02/12/2016.
 */
public interface DocenteService
{
    /**
     * Servicio que lista todos los docentes registrados en la Base de Datos.
     * @return un objeto de la clase {@link List} con objetos de la clase {@link DocenteBO}
     */
    public List< DocenteBO > listarDocentes() throws Exception;
}

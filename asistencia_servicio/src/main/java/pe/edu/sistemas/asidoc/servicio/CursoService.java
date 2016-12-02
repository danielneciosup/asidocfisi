package pe.edu.sistemas.asidoc.servicio;

import pe.edu.sistemas.asidoc.bo.CursoBO;

import java.util.List;

/**
 * Created by Daniel on 02/12/2016.
 */

public interface CursoService
{
    /**
     * Servicio que lista todos los cursos que existen en la Base de Datos.
     *
     * @return una lista de objetos de la clase {@link CursoBO}
     * @throws Exception debida a un posible error de conexión con el servidor de Base de Datos.
     */
    public List<CursoBO> listarCursos() throws Exception;
}

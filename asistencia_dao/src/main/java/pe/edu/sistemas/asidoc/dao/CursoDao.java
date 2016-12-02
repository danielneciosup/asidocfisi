package pe.edu.sistemas.asidoc.dao;

import pe.edu.sistemas.asidoc.dao.dominio.Curso;

import java.util.List;

/**
 * Created by Daniel on 02/12/2016.
 */
public interface CursoDao
{
    /**
     * Método que retorna todos los objetos de la tabla Curso
     * mapeada por la entidad {@link Curso}
     * @return una lista de objetos de la clase {@link Curso}
     */
    public List<Curso> listarCursos() throws Exception;
}

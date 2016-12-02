package pe.edu.sistemas.asidoc.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.sistemas.asidoc.core.dao.DAOImpl;
import pe.edu.sistemas.asidoc.dao.CursoDao;
import pe.edu.sistemas.asidoc.dao.dominio.Curso;

import java.util.List;

/**
 * Created by Daniel on 02/12/2016.
 */
@Repository( "cursoDao" )
@Transactional
public class CursoDaoImpl extends DAOImpl<Curso, Integer> implements CursoDao
{
    @Override
    public List<Curso> listarCursos() throws Exception
    {
        return super.listarTodos( Curso.class );
    }
}

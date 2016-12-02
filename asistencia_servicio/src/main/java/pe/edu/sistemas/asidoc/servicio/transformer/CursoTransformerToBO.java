package pe.edu.sistemas.asidoc.servicio.transformer;

import org.springframework.stereotype.Component;
import pe.edu.sistemas.asidoc.bo.CursoBO;
import pe.edu.sistemas.asidoc.core.transformer.Transformer;
import pe.edu.sistemas.asidoc.dao.dominio.Curso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 02/12/2016.
 */
@Component( "cursoTransformerToBO" )
public class CursoTransformerToBO implements Transformer<Curso, CursoBO>
{
    @Override
    public CursoBO transformer( Curso curso )
    {
        CursoBO cursoBO = null;

        if( curso != null )
        {
            cursoBO = new CursoBO();
            cursoBO.setIdCurso( curso.getIdCurso() );
            cursoBO.setCoCurso( curso.getCoCurso() );
            cursoBO.setNomCurso( curso.getNomCurso() );
            cursoBO.setNuCreditos( curso.getNuCreditos() );
        }

        return cursoBO;
    }

    @Override
    public List<CursoBO> transformer( List<Curso> cursos )
    {
        List<CursoBO> cursosBO = new ArrayList<>();

        for ( Curso curso : cursos )
        {
            cursosBO.add( transformer( curso ) );
        }

        return cursosBO;
    }
}

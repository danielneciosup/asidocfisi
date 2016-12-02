package pe.edu.sistemas.asidoc.servicio.transformer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pe.edu.sistemas.asidoc.bo.DocenteBO;
import pe.edu.sistemas.asidoc.core.transformer.Transformer;
import pe.edu.sistemas.asidoc.dao.dominio.Docente;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 02/12/2016.
 */
@Component( "docenteTransformerToBO" )
@Scope( "singleton" )
public class DocenteTransformerToBO implements Transformer< Docente, DocenteBO >
{
    @Override
    public DocenteBO transformer(Docente docente)
    {
        DocenteBO docenteBO = null;

        if ( docente != null )
        {
            docenteBO = new DocenteBO();
            docenteBO.setIdDocente( docente.getIdDocente() );
            docenteBO.setCodDocente( docente.getCodDocente() );
            docenteBO.setNomDocente( docente.getNomDocente() );
            docenteBO.setApePaterno( docente.getApePaterno() );
            docenteBO.setApeMaterno( docente.getApeMaterno() );
            docenteBO.setFeNacimiento( docente.getFeNacimiento() );
            docenteBO.setEmail( docente.getEmail() );
        }

        return docenteBO;
    }

    @Override
    public List<DocenteBO> transformer( List<Docente> docentes )
    {
        List<DocenteBO> docentesBO = new ArrayList<>();

        for ( Docente docente: docentes )
        {
            docentesBO.add( transformer( docente ) );
        }

        return docentesBO;
    }
}

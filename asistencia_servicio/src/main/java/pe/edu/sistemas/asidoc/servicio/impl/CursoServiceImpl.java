package pe.edu.sistemas.asidoc.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.sistemas.asidoc.dao.CursoDao;
import pe.edu.sistemas.asidoc.servicio.transformer.CursoTransformerToBO;
import pe.edu.sistemas.asidoc.bo.CursoBO;
import pe.edu.sistemas.asidoc.servicio.CursoService;

import java.util.List;

/**
 * Created by Daniel on 02/12/2016.
 */
@Service( "cursoService" )
public class CursoServiceImpl implements CursoService
{
    @Autowired
    private CursoDao cursoDao;

    @Autowired
    private CursoTransformerToBO transformerToBO;

    @Override
    public List<CursoBO> listarCursos() throws Exception
    {
        return transformerToBO.transformer( cursoDao.listarCursos() );
    }
}

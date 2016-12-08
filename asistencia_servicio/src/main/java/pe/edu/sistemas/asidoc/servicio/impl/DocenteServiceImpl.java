package pe.edu.sistemas.asidoc.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sistemas.asidoc.servicio.DocenteService;
import pe.edu.sistemas.asidoc.bo.DocenteBO;
import pe.edu.sistemas.asidoc.dao.DocenteDao;
import pe.edu.sistemas.asidoc.dao.dominio.Docente;
import pe.edu.sistemas.asidoc.servicio.transformer.DocenteTransformerToBO;

import java.util.List;

/**
 * Created by Daniel on 02/12/2016.
 */
@Service( "docenteService" )
public class DocenteServiceImpl implements DocenteService
{
    @Autowired
    private DocenteDao docenteDao;

    @Autowired
    DocenteTransformerToBO docenteTransformerToBO;

    @Override
    public List<DocenteBO> listarDocentes() throws Exception
    {
        List<Docente> docentes = docenteDao.listarDocentes();

        return docenteTransformerToBO.transformer( docentes );
    }

	@Override
	public DocenteBO obtenerDocentePorId(Integer docenteId) throws Exception 
	{
		Docente docente = docenteDao.obtenerDocentePorId( docenteId );		
		
		return docenteTransformerToBO.transformer( docente );
	}
}

package pe.edu.sistemas.asidoc.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.sistemas.asidoc.dao.dominio.Docente;
import pe.edu.sistemas.asidoc.core.dao.DAOImpl;
import pe.edu.sistemas.asidoc.dao.DocenteDao;

import java.util.List;

/**
 * Created by Daniel on 02/12/2016.
 */
@Repository( "docenteDao" )
@Transactional
public class DocenteDaoImpl extends DAOImpl<Docente, Integer > implements DocenteDao
{
	@Override
	public Docente obtenerDocentePorId( Integer docenteId ) throws Exception
	{
		return super.obtenerEntidadPorId( Docente.class, docenteId );
	}
	
    @Override
    public List<Docente> listarDocentes() throws Exception
    {
    	System.out.println( "Docentes obtenidos" );
    	
        return super.listarTodos( Docente.class );        
    }
}

package pe.edu.sistemas.asidoc.dao;

import pe.edu.sistemas.asidoc.dao.dominio.Docente;

import java.util.List;

/**
 * Created by Daniel on 02/12/2016.
 */
public interface DocenteDao
{
    public List<Docente> listarDocentes() throws Exception;
}

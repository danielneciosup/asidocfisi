package pe.edu.sistemas.asidoc.dao;

import pe.edu.sistemas.asidoc.bo.HorarioBO;

import java.util.List;

/**
 * Created by Daniel on 03/12/2016.
 */
public interface HorarioDao
{
    public List<HorarioBO> listarHorarios();

    public List<HorarioBO> listarHorariosConFiltro(String nomCurso, String nomDia, String nomDoc, String nomApePat, String nomApeMat );
}

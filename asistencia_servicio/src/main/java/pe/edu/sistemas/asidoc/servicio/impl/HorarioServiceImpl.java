package pe.edu.sistemas.asidoc.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.sistemas.asidoc.bo.HorarioBO;
import pe.edu.sistemas.asidoc.dao.HorarioDao;
import pe.edu.sistemas.asidoc.servicio.transformer.HorarioService;

import java.util.List;

/**
 * Created by Daniel on 03/12/2016.
 */
@Service( "horariosService" )
public class HorarioServiceImpl implements HorarioService
{
    @Autowired
    private HorarioDao horarioDao;

    @Override
    public List<HorarioBO> listarHorarios()
    {
        List<HorarioBO> horarioBOs = horarioDao.listarHorarios();
        return horarioBOs;
    }
}

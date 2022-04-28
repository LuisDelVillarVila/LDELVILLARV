package LDELVILLARVILA.LDELVILLARVILA.Service.impl;

import LDELVILLARVILA.LDELVILLARVILA.Dao.IEstudianteDao;
import LDELVILLARVILA.LDELVILLARVILA.Entity.Estudiante;
import LDELVILLARVILA.LDELVILLARVILA.Service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;


    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {return this.estudianteDao.buscarEstudiante(codigo);}
}

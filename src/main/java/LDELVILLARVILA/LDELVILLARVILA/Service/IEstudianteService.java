package LDELVILLARVILA.LDELVILLARVILA.Service;

import LDELVILLARVILA.LDELVILLARVILA.Entity.Estudiante;

public interface IEstudianteService {
    // listar estudiante

   // List<Estudiante> listaEstudiante();


    // buscar estudiante por su codigo
    Estudiante obtenerEstudianteByCodigo(String codigo);
}

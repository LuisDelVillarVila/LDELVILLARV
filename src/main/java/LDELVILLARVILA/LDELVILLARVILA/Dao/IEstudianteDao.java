package LDELVILLARVILA.LDELVILLARVILA.Dao;

import LDELVILLARVILA.LDELVILLARVILA.Entity.Estudiante;
import LDELVILLARVILA.LDELVILLARVILA.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao  extends JpaRepository<Persona,Long> {
    @Query("SELECT p FROM Estudiante p WHERE p.codigo= ?1")
    Estudiante buscarEstudiante(String codigo);

}

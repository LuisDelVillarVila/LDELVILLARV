package LDELVILLARVILA.LDELVILLARVILA.Dao;

import LDELVILLARVILA.LDELVILLARVILA.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDireccionDao extends JpaRepository<Persona,Long> {
}

package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.model.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer>{

}

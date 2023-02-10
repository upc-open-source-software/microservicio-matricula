package microserviciomatricula.repositorio;

import microserviciomatricula.entidades.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatriculaRepositorio extends JpaRepository<Matricula, Long> {
}

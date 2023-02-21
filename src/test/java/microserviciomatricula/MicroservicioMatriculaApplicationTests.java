package microserviciomatricula;

import microserviciomatricula.entidades.Matricula;
import microserviciomatricula.negocio.IMatriculaNegocio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;


@SpringBootTest
class MicroservicioMatriculaApplicationTests {

	@Autowired
	private IMatriculaNegocio matriculaNegocio;
	@Test
	void contextLoads() {
	}
	@Test
	void testRegistrar() {
		Matricula matricula = new Matricula();
		matricula.setId_alumno(1L);
		matricula.setId_asignatura(1L);
		matricula.setMonto_pagar(220.20);
		matricula.setEstado("Habilitado");
		matricula.setFecha_creacion(Date.valueOf("2022-02-20"));
		matriculaNegocio.registrar(matricula);
	}

}

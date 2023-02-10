package microserviciomatricula;

import microserviciomatricula.entidades.Matricula;
import microserviciomatricula.negocio.IMatriculaNegocio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MicroservicioMatriculaApplicationTests {

	@Autowired
	private IMatriculaNegocio matriculaNegocio;
	@Test
	void contextLoads() {
	}
	@Test
	void testRegistrar(){
		Matricula matricula = new Matricula();

	}

}

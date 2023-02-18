package microserviciomatricula;

import microserviciomatricula.entidades.Matricula;
import microserviciomatricula.negocio.IMatriculaNegocio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class MicroservicioMatriculaApplicationTests {

	@Autowired
	private IMatriculaNegocio matriculaNegocio;
	@Test
	void contextLoads() {
	}
	@Test
	void testRegistrar() throws ParseException {
		Matricula matricula = new Matricula();
		matricula.setId_alumno(1L);
		matricula.setId_asignatura(1L);
		matricula.setMonto_pagar(220.20);
		matricula.setEstado("Habilitado");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String dateString = "20-02-2023";
		Date date = formatter.parse(dateString);
		matricula.setFecha_creacion(date);

		matriculaNegocio.registrar(matricula);

	}

}

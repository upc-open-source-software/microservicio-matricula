package microserviciomatricula;

import microserviciomatricula.entidades.Matricula;
import microserviciomatricula.negocio.IMatriculaNegocio;
import microserviciomatricula.repositorio.IMatriculaRepositorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.sql.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@SpringBootTest

public class pruebas_unitarias {
    @Autowired
    private IMatriculaNegocio matriculaNegocio;
    @MockBean
    private IMatriculaRepositorio matriculaRepositorio;
    @Test
    void contextLoads(){

    }
    @Test
    void testRegistro() {
        when(matriculaRepositorio.findAll()).thenReturn(
                Stream.of(
                        new Matricula(1L, 1L,1L, "2022-02-02", 120.20, "Habilitado"),
                        new Matricula(2L, 2L,2L, "2022-02-02", 120.20, "Habilitado"),
                        new Matricula(3L, 3L,2L, "2022-02-02", 120.20, "Habilitado"),
                        new Matricula(4L, 4L,3L, "2022-02-02", 120.20, "Habilitado")).collect(Collectors.toList()));


        Assertions.assertEquals(4, matriculaNegocio.listado().size());
    }
}

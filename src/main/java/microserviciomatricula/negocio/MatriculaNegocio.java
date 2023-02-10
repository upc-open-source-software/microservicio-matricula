package microserviciomatricula.negocio;


import microserviciomatricula.entidades.Matricula;
import microserviciomatricula.repositorio.IMatriculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaNegocio implements IMatriculaNegocio {

    @Autowired
    IMatriculaRepositorio iMatriculaRepositorio;
    @Override
    public Matricula registrar(Matricula matricula){
        return iMatriculaRepositorio.save(matricula);
    }

    @Override
    public List<Matricula> listado() {
        return iMatriculaRepositorio.findAll();
    }


}

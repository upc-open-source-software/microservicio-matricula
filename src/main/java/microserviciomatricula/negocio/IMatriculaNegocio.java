package microserviciomatricula.negocio;

import microserviciomatricula.entidades.Matricula;

import java.util.List;
public interface IMatriculaNegocio {

    public Matricula registrar(Matricula matricula);

    public List<Matricula> listado();

}

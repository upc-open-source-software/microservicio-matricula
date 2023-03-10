package microserviciomatricula.rest;

import microserviciomatricula.entidades.Matricula;
import microserviciomatricula.negocio.IMatriculaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST}, allowedHeaders = "*")
public class apirest {
    @Autowired
    private IMatriculaNegocio matriculaNegocio;

    @GetMapping("/matriculas")
    public List<Matricula> lista(){
        return matriculaNegocio.listado();
    }
    @PostMapping("/matricula")
    public Matricula registrar(@RequestBody Matricula matricula){
        return matriculaNegocio.registrar(matricula);
    }
}

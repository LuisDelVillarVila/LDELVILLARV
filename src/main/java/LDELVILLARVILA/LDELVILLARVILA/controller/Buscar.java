package LDELVILLARVILA.LDELVILLARVILA.controller;
import LDELVILLARVILA.LDELVILLARVILA.Entity.Estudiante;
import LDELVILLARVILA.LDELVILLARVILA.Entity.Persona;
import LDELVILLARVILA.LDELVILLARVILA.Service.IDireccionService;
import LDELVILLARVILA.LDELVILLARVILA.Service.IEstudianteService;
import LDELVILLARVILA.LDELVILLARVILA.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")
public class Buscar {

    @Autowired
    private IPersonaService personaService;
    private IEstudianteService estudianteService;
    private IDireccionService direccionService;

    @GetMapping("/listaPersona")

    public List<Persona> listaPersona(){
        return this.personaService.listaPersonas();

    }
    @GetMapping("/buscarEstudiante")

    public Estudiante buscarEstudiante(@RequestParam("codigo") String codigo){
        return (Estudiante) this.estudianteService.obtenerEstudianteByCodigo(codigo);

    }

}

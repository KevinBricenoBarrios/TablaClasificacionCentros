package com.example.tablaclasificacioncentros.Controlers;

import com.example.tablaclasificacioncentros.Models.ClasificacionDeCentros;
import com.example.tablaclasificacioncentros.Service.ClasificacionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClasificacionRestControlers {

    @Autowired
    ClasificacionImpl clasificacionService;

    @GetMapping("/lista")
    public List<ClasificacionDeCentros> listaClasificacionCentros() {
        List<ClasificacionDeCentros> listaMostrar = clasificacionService.listaClasificacion();
        return listaMostrar;

    }

    //Buscar por id
    @GetMapping("/estudiante/{id}")//localhost:8080/api/estudiante/borrar/2
    public ClasificacionDeCentros clasificacionPorId(@PathVariable Long id) {
        ClasificacionDeCentros clasificaionMostrar = clasificacionService.buscarClasificacionPorId(id);
        return clasificaionMostrar;
    }

}

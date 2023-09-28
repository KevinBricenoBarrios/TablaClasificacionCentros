package com.example.tablaclasificacioncentros.Service;

import com.example.tablaclasificacioncentros.Models.ClasificacionDeCentros;
import com.example.tablaclasificacioncentros.Repositories.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasificacionImpl implements ClasificacionService{

    @Autowired
    ClasificacionRepository
            clasificacionRepository;

    @Override
    public List<ClasificacionDeCentros> listaClasificacion(){
        return null;
    }

    @Override
    public List<ClasificacionDeCentros> listaDeclasificacion() {
        return null;
    }

    @Override
    public ClasificacionDeCentros buscarClasificacionPorId(Long id){
        return null;
    }
//    @Override
//    public ClasificacionDeCentros guardarClasificacion(ClasificacionDeCentros clasificacionnuevo){
//        return null;
//    }

//    @Override
//    public void borrarClasificacion(Long id){
//
//    }
//    @Override
//    public ClasificacionDeCentros editarClasificacionPorId(Long id, ClasificacionDeCentros clasificacionActualizado){
//        return null;
//    }
//    @Override
//    public List<ClasificacionDeCentros> listaDeClasificacion(){
//        return clasificacionRepository.findAll();
//    }
}

package com.example.tablaclasificacioncentros.Service;

import com.example.tablaclasificacioncentros.Models.ClasificacionDeCentros;

import java.util.List;

public interface ClasificacionService {


    List<ClasificacionDeCentros> listaClasificacion();

    List<ClasificacionDeCentros> listaDeclasificacion();

    ClasificacionDeCentros buscarClasificacionPorId(Long id);

//    ClasificacionDeCentros guardarClasificacion(ClasificacionDeCentros clasificacionNuevo);
//
//    void borrarClasificacion(Long id);
//
//    ClasificacionDeCentros editarClasificacionPorId(Long id, ClasificacionDeCentros clasificacionActualizado);

}

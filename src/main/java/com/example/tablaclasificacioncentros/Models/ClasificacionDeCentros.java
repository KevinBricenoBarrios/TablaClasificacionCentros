package com.example.tablaclasificacioncentros.Models;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(name = "Clasificacion")
public class ClasificacionDeCentros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long clasificacionid;

    @Column(name = "tipoDeCentro")
    @NotNull
    private String clasificacionTipoCentro;

    public ClasificacionDeCentros() {
    }

    public ClasificacionDeCentros(Long clasificacionid, @NotNull String clasificacionTipoCentro) {
        this.clasificacionid = clasificacionid;
        this.clasificacionTipoCentro = clasificacionTipoCentro;
    }

    public Long getClasificacionid() {
        return clasificacionid;
    }

    public void setClasificacionid(Long clasificacionid) {
        this.clasificacionid = clasificacionid;
    }

    public String getClasificacionTipoCentro() {
        return clasificacionTipoCentro;
    }

    public void setClasificacionTipoCentro(String clasificacionTipoCentro) {
        this.clasificacionTipoCentro = clasificacionTipoCentro;
    }
}

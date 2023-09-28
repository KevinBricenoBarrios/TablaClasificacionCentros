package com.example.tablaclasificacioncentros.Repositories;

import com.example.tablaclasificacioncentros.Models.ClasificacionDeCentros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionRepository extends JpaRepository<ClasificacionDeCentros, Long> {
}

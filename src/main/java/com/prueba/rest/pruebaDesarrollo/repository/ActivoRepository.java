package com.prueba.rest.pruebaDesarrollo.repository;

import com.prueba.rest.pruebaDesarrollo.entity.Activo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ActivoRepository extends JpaRepository<Activo, Integer> {

    //List<Activo> findBySerialAndTipoContainingAndFechaCompraBetween(String serial, String tipo, Date fechaCompra);
}

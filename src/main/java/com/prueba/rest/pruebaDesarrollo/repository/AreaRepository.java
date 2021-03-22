package com.prueba.rest.pruebaDesarrollo.repository;

import com.prueba.rest.pruebaDesarrollo.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {
}

package com.prueba.rest.pruebaDesarrollo.repository;

import com.prueba.rest.pruebaDesarrollo.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRespository extends JpaRepository<Persona,Integer> {

}

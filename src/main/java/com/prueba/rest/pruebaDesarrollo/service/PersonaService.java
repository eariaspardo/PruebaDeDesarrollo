package com.prueba.rest.pruebaDesarrollo.service;

import com.prueba.rest.pruebaDesarrollo.entity.Persona;
import com.prueba.rest.pruebaDesarrollo.repository.PersonaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonaService {

    @Autowired
    PersonaRespository personaRespository;

    public List<Persona> listar(){
        return personaRespository.findAll();
    }

    public Persona findByid(Integer id){
        return personaRespository.findById(id).orElse(null);
    }

}

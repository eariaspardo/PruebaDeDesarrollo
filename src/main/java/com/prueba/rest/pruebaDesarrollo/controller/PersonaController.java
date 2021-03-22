package com.prueba.rest.pruebaDesarrollo.controller;

import com.prueba.rest.pruebaDesarrollo.entity.Area;
import com.prueba.rest.pruebaDesarrollo.entity.Persona;
import com.prueba.rest.pruebaDesarrollo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/")
    public ResponseEntity<List<Area>> listar(){
        List<Persona> findAll = personaService.listar();
        return new ResponseEntity(findAll, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Area> findById(@PathVariable("id") Integer id){
        Persona response = personaService.findByid(id);
        if(response == null){
            return new ResponseEntity("no existe el area", HttpStatus.OK);
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

}

package com.prueba.rest.pruebaDesarrollo.controller;

import com.prueba.rest.pruebaDesarrollo.entity.Activo;
import com.prueba.rest.pruebaDesarrollo.entity.Area;
import com.prueba.rest.pruebaDesarrollo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/area")
@CrossOrigin(origins = "*")
public class AreaController {

    @Autowired
    AreaService areaService;

    @GetMapping("/")
    public ResponseEntity<List<Area>> listar(){
        List<Area> findAll = areaService.list();
        return new ResponseEntity(findAll, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Area> findById(@PathVariable("id") Integer id){
        Area response = areaService.findById(id);
        if(response == null){
            return new ResponseEntity("no existe el area", HttpStatus.OK);
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

}

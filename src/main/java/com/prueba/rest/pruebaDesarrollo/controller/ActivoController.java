package com.prueba.rest.pruebaDesarrollo.controller;

import com.prueba.rest.pruebaDesarrollo.dto.ActivoDTO;
import com.prueba.rest.pruebaDesarrollo.entity.Activo;
import com.prueba.rest.pruebaDesarrollo.service.ActivoService;
import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/activo")
@CrossOrigin(origins = "*")
public class ActivoController {

    @Autowired
    ActivoService activoService;

    @GetMapping("/")
    public ResponseEntity<List<Activo>> listar(){
        List<Activo> findAll = activoService.list();
        return new ResponseEntity(findAll, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Activo> findById(@PathVariable("id") Integer id){
        Activo response = activoService.findById(id);
        if(response == null){
            return new ResponseEntity("no existe el activo", HttpStatus.OK);
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping("/{serial}/{tipo}/{fechaCompra}")
    public ResponseEntity<List<Activo>> filtro(@PathVariable("serial") String serial,
                                         @PathVariable("tipo") String tipo,
                                         @PathVariable("fechaCompra") Date fechaCompra){
        List<Activo> response = activoService.filtro(serial, tipo, fechaCompra);
        if(response.isEmpty()){
            return new ResponseEntity("no arrojo resultados", HttpStatus.OK);
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> Delete(@PathVariable("id") Integer id){
        activoService.delete(id);
        return new ResponseEntity("Activo Eliminado", HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Activo> save(@RequestBody ActivoDTO activoDTO){
        return new ResponseEntity(activoService.save(activoDTO), HttpStatus.OK);
    }


}

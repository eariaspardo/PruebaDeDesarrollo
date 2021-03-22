package com.prueba.rest.pruebaDesarrollo.service;


import com.prueba.rest.pruebaDesarrollo.dto.ActivoDTO;
import com.prueba.rest.pruebaDesarrollo.entity.Activo;
import com.prueba.rest.pruebaDesarrollo.mapper.ActivoMapper;
import com.prueba.rest.pruebaDesarrollo.repository.ActivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ActivoService {

    @Autowired
    ActivoRepository activoRepository;

    public List<Activo> list(){
        return activoRepository.findAll();
    }

    public Activo findById(Integer id){
        return activoRepository.findById(id).orElse(null);
    }

    public Optional<Activo> getOne(Integer id){
        return activoRepository.findById(id);
    }

    public Activo save(ActivoDTO activoDTO){
        Activo activo = ActivoMapper.INSTANCE.activoToActivoDTO(activoDTO);
        return activoRepository.save(activo);
    }

    public void delete (Integer id){
        activoRepository.deleteById(id);
    }

    public List<Activo> filtro(String serial, String tipo, Date fechaCompra ){
        //return activoRepository.findBySerialAndTipoContainingAndFechaCompraBetween(serial, tipo,fechaCompra);
        return null;
    }
}

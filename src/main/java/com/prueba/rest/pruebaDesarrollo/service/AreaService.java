package com.prueba.rest.pruebaDesarrollo.service;

import com.prueba.rest.pruebaDesarrollo.entity.Area;
import com.prueba.rest.pruebaDesarrollo.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AreaService {

    @Autowired
    AreaRepository areaRepository;

    public List<Area> list(){
        return areaRepository.findAll();
    }

    public Area findById(Integer id){
        return areaRepository.findById(id).orElse(null);
    }
}

package com.prueba.rest.pruebaDesarrollo.mapper;

import com.prueba.rest.pruebaDesarrollo.dto.ActivoDTO;
import com.prueba.rest.pruebaDesarrollo.entity.Activo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ActivoMapper {

    ActivoMapper INSTANCE = Mappers.getMapper(ActivoMapper.class);

    ActivoDTO activoDTOToActivoDTO (Activo activo);

    Activo activoToActivoDTO(ActivoDTO activoDTO);

}

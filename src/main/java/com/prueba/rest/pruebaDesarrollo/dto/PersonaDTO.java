package com.prueba.rest.pruebaDesarrollo.dto;

public class PersonaDTO {

    private Integer id;

    private String nombre;

    private String apellido;

    private AreaDTO areaId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public AreaDTO getAreaId() {
        return areaId;
    }

    public void setAreaId(AreaDTO areaId) {
        this.areaId = areaId;
    }
}

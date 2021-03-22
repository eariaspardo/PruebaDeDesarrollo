package com.prueba.rest.pruebaDesarrollo.dto;

public class AreaDTO {

    private Integer id;

    private String area;

    private CiudadDTO ciudadId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public CiudadDTO getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(CiudadDTO ciudadId) {
        this.ciudadId = ciudadId;
    }
}

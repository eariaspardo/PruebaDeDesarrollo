package com.prueba.rest.pruebaDesarrollo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "activo")
public class Activo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "serial")
    private String serial;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "numerointerno")
    private Integer numeroInterno;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "alto")
    private Double alto;

    @Column(name = "largo")
    private Double largo;

    @Column(name = "ancho")
    private Double ancho;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "fechacompra")
    private Date fechaCompra;

    @Column(name = "fechabaja")
    private Date fechaBaja;

    @Column(name = "estadoactual")
    private String estadoActual;

    @Column(name = "color")
    private String color;

    @OneToOne
    @JoinColumn(name = "areaid", updatable = false, nullable = false)
    private Area areaId;

    @OneToOne
    @JoinColumn(name = "personaid", updatable = false, nullable = false)
    private Persona personaId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroInterno() {
        return numeroInterno;
    }

    public void setNumeroInterno(Integer numeroInterno) {
        this.numeroInterno = numeroInterno;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Area getAreaId() {
        return areaId;
    }

    public void setAreaId(Area areaId) {
        this.areaId = areaId;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }
}

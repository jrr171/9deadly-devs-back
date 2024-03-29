package com.hackathon.bbvAforo.dto;

public class Oficina {
    private int id;
    private String nombre;
    private String direccion;
    private int idEstado;
    private int idProvincia;
    private int idPais;
    private int aforoTotal;
    private int aforoActual;

    public Oficina() {
    }

    public Oficina(int id, String nombre, String direccion, int idEstado, int idProvincia, int idPais, int aforoTotal, int aforoActual) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.idEstado = idEstado;
        this.idProvincia = idProvincia;
        this.idPais = idPais;
        this.aforoTotal = aforoTotal;
        this.aforoActual = aforoActual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getAforoTotal() {
        return aforoTotal;
    }

    public void setAforoTotal(int aforoTotal) {
        this.aforoTotal = aforoTotal;
    }

    public int getAforoActual() {
        return aforoActual;
    }

    public void setAforoActual(int aforoActual) {
        this.aforoActual = aforoActual;
    }
}

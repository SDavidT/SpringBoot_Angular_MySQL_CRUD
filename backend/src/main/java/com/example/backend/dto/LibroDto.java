package com.example.backend.dto;

import java.sql.Date;


public class LibroDto {
   
    private String nombre;
    private String descripcion;
    private String autor;
    private Date fecha;
    private int ejemplares;
   
    private Float precio;


    public LibroDto() {
    }

    public LibroDto( String nombre, String descripcion, String autor, Date fecha, int ejemplares,float precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.fecha=fecha;
        this.ejemplares=ejemplares;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}

package com.demo.modelo;

import java.time.LocalDateTime;

public class Fruta {
	private int id;
	private String tipo;
        private int cantidad;
        private float precio;
        private LocalDateTime fechadecreacion;
        private LocalDateTime fechadeactualizacion;

    public Fruta() {
    }

    public Fruta(int id, String tipo, int cantidad, float precio, LocalDateTime fechadecreacion, LocalDateTime fechadeactualizacion) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechadecreacion = fechadecreacion;
        this.fechadeactualizacion = fechadeactualizacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public LocalDateTime getFechadecreacion() {
        return fechadecreacion;
    }

    public void setFechadecreacion(LocalDateTime fechadecreacion) {
        this.fechadecreacion = fechadecreacion;
    }

    public LocalDateTime getFechadeactualizacion() {
        return fechadeactualizacion;
    }

    public void setFechadeactualizacion(LocalDateTime fechadeactualizacion) {
        this.fechadeactualizacion = fechadeactualizacion;
    }
    

}

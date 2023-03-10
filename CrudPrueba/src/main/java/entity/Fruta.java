package entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Fruta")

public class Fruta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    
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

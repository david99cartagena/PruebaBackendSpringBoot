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
@Table(name = "Pedido")

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    
    private int id;
    private float valortotal;
    private int cantidad;
    private float precio;
    private LocalDateTime fechadecreacion;
    private LocalDateTime fechadeactualizacion;
    private String listadefrutas;

    public Pedido() {
    }

    public Pedido(int id, float valortotal, int cantidad, float precio, LocalDateTime fechadecreacion, LocalDateTime fechadeactualizacion, String listadefrutas) {
        this.id = id;
        this.valortotal = valortotal;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechadecreacion = fechadecreacion;
        this.fechadeactualizacion = fechadeactualizacion;
        this.listadefrutas = listadefrutas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
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

    public String getListadefrutas() {
        return listadefrutas;
    }

    public void setListadefrutas(String listadefrutas) {
        this.listadefrutas = listadefrutas;
    }
    
}

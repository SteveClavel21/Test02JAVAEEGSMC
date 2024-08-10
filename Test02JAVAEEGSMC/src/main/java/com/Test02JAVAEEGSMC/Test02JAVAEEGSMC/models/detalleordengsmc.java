package com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class detalleordengsmc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "orden_id")
    private ordengsmc ordengsmc;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private productogsmc productogsmc;

    private int cantidadgsmc;

    private double preciogsmc;

    public detalleordengsmc() {
    }

    public detalleordengsmc(Long id, com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.ordengsmc ordengsmc, com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.productogsmc productogsmc, int cantidadgsmc, double preciogsmc) {
        this.id = id;
        this.ordengsmc = ordengsmc;
        this.productogsmc = productogsmc;
        this.cantidadgsmc = cantidadgsmc;
        this.preciogsmc = preciogsmc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.ordengsmc getOrdengsmc() {
        return ordengsmc;
    }

    public void setOrdengsmc(com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.ordengsmc ordengsmc) {
        this.ordengsmc = ordengsmc;
    }

    public com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.productogsmc getProductogsmc() {
        return productogsmc;
    }

    public void setProductogsmc(com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.productogsmc productogsmc) {
        this.productogsmc = productogsmc;
    }

    public int getCantidadgsmc() {
        return cantidadgsmc;
    }

    public void setCantidadgsmc(int cantidadgsmc) {
        this.cantidadgsmc = cantidadgsmc;
    }

    public double getPreciogsmc() {
        return preciogsmc;
    }

    public void setPreciogsmc(double preciogsmc) {
        this.preciogsmc = preciogsmc;
    }
}

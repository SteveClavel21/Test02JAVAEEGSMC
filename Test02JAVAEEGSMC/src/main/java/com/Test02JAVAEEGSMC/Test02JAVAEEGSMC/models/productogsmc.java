package com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class productogsmc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombregsmc;


    public productogsmc() {
    }

    public productogsmc(Long id, String nombregsmc) {
        this.id = id;
        this.nombregsmc = nombregsmc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombregsmc() {
        return nombregsmc;
    }

    public void setNombregsmc(String nombregsmc) {
        this.nombregsmc = nombregsmc;
    }
}

package com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ordengsmc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechagsmc;

    public ordengsmc() {
    }

    public ordengsmc(Long id, LocalDate fechagsmc) {
        this.id = id;
        this.fechagsmc = fechagsmc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechagsmc() {
        return fechagsmc;
    }

    public void setFechagsmc(LocalDate fechagsmc) {
        this.fechagsmc = fechagsmc;
    }
}

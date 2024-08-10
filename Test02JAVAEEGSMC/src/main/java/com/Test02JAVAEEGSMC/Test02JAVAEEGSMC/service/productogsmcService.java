package com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.service;

import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.productogsmc;
import  com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.repository.productogsmcRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productogsmcService {
    @Autowired
    private productogsmcRepository productogsmcRepository;

    public List<productogsmc> listarTodas() {
        return productogsmcRepository.findAll();
    }

    public productogsmc guardar(productogsmc productogsmc) {
        return productogsmcRepository.save(productogsmc);
    }

    public productogsmc obtenerPorId(Long id) {
        return productogsmcRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        productogsmcRepository.deleteById(id);
    }

}

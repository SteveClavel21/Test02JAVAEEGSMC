package com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.service;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.ordengsmc;
import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.repository.ordengsmcRepository;

@Service
public class ordengsmcService {
    @Autowired
    private ordengsmcRepository ordengsmcRepository;

    public List<ordengsmc> listarTodas() {
        return ordengsmcRepository.findAll();
    }

    public ordengsmc guardar(ordengsmc ordengsmc) {
        return ordengsmcRepository.save(ordengsmc);
    }

    public ordengsmc obtenerPorId(Long id) {
        return ordengsmcRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        ordengsmcRepository.deleteById(id);
    }

}

package com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.service;
import java.util.List;


import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.detalleordengsmc;
import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.repository.detalleordengsmcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class detalleordengsmcService {
    @Autowired
    private detalleordengsmcRepository detalleordengsmcRepository;

    public List<detalleordengsmc> listarTodas() {
        return detalleordengsmcRepository.findAll();
    }

    public detalleordengsmc guardar(detalleordengsmc detalleordengsmc) {
        return detalleordengsmcRepository.save(detalleordengsmc);
    }

    public detalleordengsmc obtenerPorId(Long id) {
        return detalleordengsmcRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        detalleordengsmcRepository.deleteById(id);
    }

}

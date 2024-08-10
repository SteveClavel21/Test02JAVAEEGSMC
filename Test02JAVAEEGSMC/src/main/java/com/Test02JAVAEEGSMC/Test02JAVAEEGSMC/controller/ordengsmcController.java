package com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.ordengsmc;
import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.service.ordengsmcService;



@Controller
@RequestMapping("orden")
public class ordengsmcController {

    @Autowired
    private ordengsmcService ordengsmcService;

    @GetMapping
    public String listarOrden(Model model) {
        model.addAttribute("orden", ordengsmcService.listarTodas());
        return "orden/orden-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaOrden(Model model) {
        model.addAttribute("orden", new ordengsmc());
        return "orden/orden-form";
    }

    @PostMapping
    public String guardarProducto(ordengsmc ordengsmc) {
        ordengsmcService.guardar(ordengsmc);
        return "redirect:/orden";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarOrden(@PathVariable Long id, Model model) {
        model.addAttribute("orden", ordengsmcService.obtenerPorId(id));
        return "orden/orden-form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarOrden(@PathVariable Long id) {
        ordengsmcService.eliminar(id);
        return "redirect:/orden";
    }
}

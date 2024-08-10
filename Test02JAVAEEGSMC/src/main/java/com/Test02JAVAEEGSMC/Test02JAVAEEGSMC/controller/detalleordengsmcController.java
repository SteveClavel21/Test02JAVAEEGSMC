package com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.detalleordengsmc;
import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.service.detalleordengsmcService;
import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.service.ordengsmcService;
import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.service.productogsmcService;



@Controller
@RequestMapping("detalles")
public class detalleordengsmcController {

    @Autowired
    private detalleordengsmcService detalleordengsmcService;

    @Autowired
    private ordengsmcService ordengsmcService;

    @Autowired
    private productogsmcService productogsmcService;

    @GetMapping
    public String listarDetalles(Model model){
        model.addAttribute("detalles", detalleordengsmcService.listarTodos());
        return "detalle/detalle-list";
    }

    @GetMapping("nuevo")
    public String ShowNewDetail(Model model) {
        model.addAttribute("detalle", new detalleordengsmc());
        model.addAttribute("ordenes", ordengsmcService.listarTodas());
        model.addAttribute("productos", productogsmcService.listarTodas());
        return "detalle/detalle-form";
    }

    @PostMapping
    public String SaveDetails(detalleordengsmc detalleordengsmc) {
        detalleordengsmcService.guardar(detalleordengsmc);
        return "redirect:/detalles";
    }

    @GetMapping("editar/{id}")
    public String EditDetail(@PathVariable Long id, Model model) {
        model.addAttribute("detalle", detalleordengsmcService.obtenerPorId(id));
        model.addAttribute("ordenes", ordengsmcService.listarTodas());
        model.addAttribute("productos", productogsmcService.listarTodas());
        return "detalle/detalle-form";
    }

    @GetMapping("eliminar/{id}")
    public String DeleteDetalis(@PathVariable Long id) {
        detalleordengsmcService.eliminar(id);
        return "redirect:/detalles";
    }
}

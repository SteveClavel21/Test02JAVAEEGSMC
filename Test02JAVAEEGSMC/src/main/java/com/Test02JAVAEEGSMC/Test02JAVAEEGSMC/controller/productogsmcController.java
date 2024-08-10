package com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.models.productogsmc;
import com.Test02JAVAEEGSMC.Test02JAVAEEGSMC.service.productogsmcService;

@Controller
@RequestMapping("producto")
public class productogsmcController {

    @Autowired
    private productogsmcService productogsmcService;

    @GetMapping
    public String listarProducto(Model model) {
        model.addAttribute("productos", productogsmcService.listarTodas());
        return "producto/producto-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoProducto(Model model) {
        model.addAttribute("producto", new productogsmc());
        return "producto/producto-form";
    }

    @PostMapping
    public String guardarProducto(productogsmc productogsmc) {
        productogsmcService.guardar(productogsmc);
        return "redirect:/producto";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarProducto(@PathVariable Long id, Model model) {
        model.addAttribute("producto", productogsmcService.obtenerPorId(id));
        return "producto/producto-form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productogsmcService.eliminar(id);
        return "redirect:/producto";
    }
}

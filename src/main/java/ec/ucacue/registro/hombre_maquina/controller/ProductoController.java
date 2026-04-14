package ec.ucacue.registro.hombre_maquina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.ucacue.registro.hombre_maquina.models.Producto;
import ec.ucacue.registro.hombre_maquina.services.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/nuevo")
    public String getMethodName(Model model) {
        model.addAttribute("producto", new Producto());
        model.addAttribute("titulo", "Nuevo Producto");

        return "productos/nuevo";
    }

    @PostMapping("/guardar")
    public String guardar(Producto producto) {
        productoService.guardar(producto);
        return "redirect:/productos";
    }

    @GetMapping
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoService.listarProducto());
        return "productos/index";
    }

}

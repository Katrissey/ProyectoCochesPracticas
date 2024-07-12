package com.concensionario.cursospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.concensionario.cursospring.entity.Venta;
import com.concensionario.cursospring.service.VentaService;

@Controller
@RequestMapping("/ventaController")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    //public ResponseEntity<Venta> crearVenta(){

   // }
    
}

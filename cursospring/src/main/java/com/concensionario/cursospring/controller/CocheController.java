package com.concensionario.cursospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import com.concensionario.cursospring.entity.Coche;
import com.concensionario.cursospring.service.CocheService;

/*@RestController
@RequestMapping("/coches")
public class CocheController {

    @PostMapping
    public ResponseEntity<String> crearCoche(@Valid @RequestBody Coche coche) {
        // Aquí puedes agregar lógica para guardar el coche en la base de datos
        return new ResponseEntity<>("Coche creado con éxito", HttpStatus.CREATED);
    } */

@RestController
@RequestMapping("/cochesController")
public class CocheController {

    @Autowired
    private CocheService cocheServis;

    @PostMapping
    public ResponseEntity<Coche> crearCoche(@Valid @RequestBody Coche coche) {
        // Aquí puedes agregar lógica para guardar el coche en la base de datos
        return new ResponseEntity<>("Coche creado con éxito", HttpStatus.CREATED);
    } 
    
    
}
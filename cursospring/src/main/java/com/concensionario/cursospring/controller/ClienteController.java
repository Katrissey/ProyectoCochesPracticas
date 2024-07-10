package com.concensionario.cursospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.concensionario.cursospring.entity.Cliente;
import com.concensionario.cursospring.service.ClienteService;

@Controller
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    //public ResponseEntity<Cliente> crearCliente(){

   // }

}

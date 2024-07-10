package com.concensionario.cursospring.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.concensionario.cursospring.entity.Cliente;
import com.concensionario.cursospring.repository.ClienteRepository;

@Service
public class ClienteService {

    private ClienteRepository clienteRep;

    public Optional<Cliente> findById (Long id) {

        Optional<Cliente> cliente =clienteRep.findById(id);
        return cliente;
    }
    
}

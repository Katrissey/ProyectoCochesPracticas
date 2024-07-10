package com.concensionario.cursospring.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concensionario.cursospring.entity.Cliente;
import com.concensionario.cursospring.entity.Coche;
import com.concensionario.cursospring.entity.Venta;



public interface VentaRepository extends JpaRepository <Venta, Long>{

    public Venta findByCoche(Optional<Coche> coche);
    public Venta findByCliente(Optional<Cliente> cliente);
    

    
    
}

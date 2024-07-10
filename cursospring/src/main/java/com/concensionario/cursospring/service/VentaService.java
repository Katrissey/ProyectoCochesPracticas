package com.concensionario.cursospring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concensionario.cursospring.entity.Venta;
import com.concensionario.cursospring.repository.VentaRepository;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRep;

    public List<Venta> listaVentas() {

        return ventaRep.findAll();
    }

    public void crearVenta(Venta venta) {
        Venta creada = ventaRep.save(venta);
    }

}

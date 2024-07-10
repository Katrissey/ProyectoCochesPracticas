package com.concensionario.cursospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concensionario.cursospring.entity.Coche;
import com.concensionario.cursospring.repository.CocheRepository;
@Service
public class CocheService {
    @Autowired
    private CocheRepository cocheRep;

    public List<Coche> listsPorMarca (String marca){
        List<Coche> coches=cocheRep.findByMarca(marca);
        return coches;
    }

    public Coche crearCoche (Coche coche){

        String combis = combustiblecoche.getCombustu();
        


        return cocheRep.save(coche);
    }

    
    
}

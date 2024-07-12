package com.concensionario.cursospring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.concensionario.cursospring.entity.Coche;

@Repository
public interface CocheRepository extends JpaRepository <Coche, Long> {

    public List<Coche> findByMarca(String marca);
    
    
    
}

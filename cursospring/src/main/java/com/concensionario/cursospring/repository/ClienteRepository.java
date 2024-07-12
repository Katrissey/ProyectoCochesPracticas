package com.concensionario.cursospring.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.concensionario.cursospring.entity.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Optional<Cliente> findById(Long id);
    

}

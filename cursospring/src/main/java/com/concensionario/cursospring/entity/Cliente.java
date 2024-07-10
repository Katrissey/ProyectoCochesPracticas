package com.concensionario.cursospring.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "TB_CLIENTE")
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 
    @Column(name = "NOMBRE", nullable = false) 
    private String nombre;   
    @Column(name = "DNI", unique = true, nullable = false) 
    private String dni; 
    @Column(name = "NUMERO_COMPRA") 
    private int numeroCompras;


public Cliente (){}

public Cliente(String nombre, String dni, int numeroCompras) {
    this.nombre = nombre;
    this.dni = dni;
    this.numeroCompras = numeroCompras;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getDni() {
    return dni;
}

public void setDni(String dni) {
    this.dni = dni;
}

public int getNumeroCompras() {
    return numeroCompras;
}

public void setNumeroCompras(int numeroCompras) {
    this.numeroCompras = numeroCompras;
}



}

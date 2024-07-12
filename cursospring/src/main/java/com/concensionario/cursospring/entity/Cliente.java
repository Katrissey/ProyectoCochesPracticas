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
    @Column(name = "DNI", nullable = false, unique = true)
    @NotNull (message = "El DNI no puede ser nulo")
    @Pattern(regexp = "^[0-9]{8}[ABCDEFGHJKLMNPRSTVWXYZ]{1}$", message = "El DNI ha de tener 8 valores numéricos y, a continuación, 1 alfabético en mayúsculas (excluyendo vocales I, O y U, y la consonante Ñ)")
    private String dni; 
    @Column(name = "NUMERO_COMPRA") 
    private int numeroCompras;

//Constructor vacío, necesario para los java beans
public Cliente (){}

//Constructor con todos los atributos salvo el id
public Cliente(String nombre, String dni, int numeroCompras) {
    this.nombre = nombre;
    this.dni = dni;
    this.numeroCompras = numeroCompras;
}


//Constructor con todos los atributos
public Cliente(Long id, String nombre, String dni, int numeroCompras) {
    this.id = id;
    this.nombre = nombre;
    this.dni = dni;
    this.numeroCompras = numeroCompras;
}

//Getters y Setters
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

//To String
@Override
public String toString() {
    return "Cliente [id=" + id + ", nombre=" + nombre + ", dni=" + dni + ", numeroCompras=" + numeroCompras + "]";
}


}

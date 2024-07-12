package com.concensionario.cursospring.entity;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_COCHE")
public class Coche implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "MARCA")
    private String marca;
    @Column (name = "MODELO")
    private String modelo;
    @Column (name = "COLOR")
    private String color;
    @Column (name = "NUMERO_SERIE", nullable = false, unique = true)
    private String numeroSerie;
    @Column (name = "MATRICULA", nullable = false, unique = true)
    @NotNull (message = "La matrícula no puede ser nula")
    @Pattern(regexp = "^[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}$", message = "La matrícula ha de tener 4 valores numéricos y 3 alfabéticos en mayúsculas (excluyendo vocales, Ñ y Q)")
    private String matricula;
    @Column(name = "ETIQUETA", nullable = false)
    @NotNull(message = "La etiqueta no puede ser nula")
    @Pattern(regexp = "^(0|ECO|C|B|A)$", message = "La etiqueta debe ser uno de los siguientes valores: 0, ECO, C, B, A")
    private String etiqueta;
    @Column (name = "PRECIO")
    private double precio;
    @Column (name = "EXPOSICION")
    private boolean exposicion;
    @Column (name = "COMBUSTIBLE", nullable = false)
    @NotNull(message = "El combustible no puede ser nulo")
    @Pattern(regexp = "^(ELECTRICO|HIBRIDO|DIESEL|GASOLINA)$", message = "El tipo de combustible debe ser uno de los siguientes valores: ELECTRICO, HIBRIDO, DIESEL|, GASOLINA")
    private String combustible;

    // Constructor vacío, necesario para los java beans
    public Coche() {}

    
    // Constructor completo con id
    public Coche(Long id, String marca, String modelo, String color, String numeroSerie, String matricula,
            String etiqueta, double precio, boolean exposicion, String combustible) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroSerie = numeroSerie;
        this.matricula = matricula;
        this.etiqueta = etiqueta;
        this.precio = precio;
        this.exposicion = exposicion;
        this.combustible = combustible;
    }


    // Constructor con todos los atributos salvo la id
    public Coche(String marca, String modelo, String color, String numeroSerie, String matricula, String etiqueta,
                 double precio, boolean exposicion, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroSerie = numeroSerie;
        this.matricula = matricula;
        this.etiqueta = etiqueta;
        this.precio = precio;
        this.exposicion = exposicion;
        this.combustible = combustible;
    }

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isExposicion() {
        return exposicion;
    }

    public void setExposicion(boolean exposicion) {
        this.exposicion = exposicion;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getEtiqueta() {
        return etiqueta;
    }


    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }


    public String getCombustible() {
        return combustible;
    }


    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    //To String
    @Override
    public String toString() {
        return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numeroSerie="
                + numeroSerie + ", matricula=" + matricula + ", etiqueta=" + etiqueta + ", precio=" + precio
                + ", exposicion=" + exposicion + ", combustible=" + combustible + "]";
    }


    
}


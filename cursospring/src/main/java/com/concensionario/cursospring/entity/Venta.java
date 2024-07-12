package com.concensionario.cursospring.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity 
@Table(name = "TB_VENTAS") 
public class Venta implements Serializable { 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 
 
    @ManyToOne  
    @JoinColumn(name = "CLIENTE_ID") 
    private Cliente cliente; 
 
    @OneToOne 
    @JoinColumn(name = "COCHE_ID", unique = true) 
    private Coche coche; 
 
    @Column(name = "FECHA_VENTA", nullable = false) 
    @Temporal(TemporalType.TIMESTAMP) 
    private LocalDateTime fechaVenta; 
 
    // Constructor vacío, necesario para las java beans
    public Venta() {} 
 
    // Constructor con todos los atributos salvo el id 
    public Venta(Cliente cliente, Coche coche) { 
        this.cliente = cliente; 
        this.coche = coche; 
        this.fechaVenta = LocalDateTime.now(); 
    }
    
    //Constructor con todos los atributos
    public Venta(Long id, Cliente cliente, Coche coche, LocalDateTime fechaVenta) {
        this.id = id;
        this.cliente = cliente;
        this.coche = coche;
        this.fechaVenta = fechaVenta;
    }

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    //To String
    @Override
    public String toString() {
        return "Venta [id=" + id + ", cliente=" + cliente + ", coche=" + coche + ", fechaVenta=" + fechaVenta + "]";
    }

    
}

package com.example.Store.modelos;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fechaYHora", nullable = false, length = 40)
    private LocalDateTime FechaYHora;

    public Pedido() {
    }

    public Pedido(Integer id, LocalDateTime fechaYHora) {
        this.id = id;
        FechaYHora = fechaYHora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFechaYHora() {
        return FechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        FechaYHora = fechaYHora;
    }
}

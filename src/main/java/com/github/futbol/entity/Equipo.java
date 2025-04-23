package com.github.futbol.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "equipo", uniqueConstraints = {

        // No se permiten equipos con el mismo nombre y categoria.
        @UniqueConstraint(columnNames = { "nombre_equipo", "categoria_equipo" }) })

public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipo")
    private Long id;

    @Column(name = "nombre_equipo", nullable = false)
    private String nombre;

    @Column(name = "categoria_equipo", nullable = false)
    private String categoria;


    @JsonBackReference
    @OneToMany( //
            mappedBy = "equipo", //
            cascade = CascadeType.ALL, //
            orphanRemoval = true //
    )
    private Set<Jugador> jugadores = new HashSet<>();


    public Equipo() {
    }

    public Equipo(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;

    }

    /*----------------------------------------------------------------------------*/

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

}

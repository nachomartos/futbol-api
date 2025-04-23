package com.github.futbol.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "jugador", uniqueConstraints = {

        // No se permiten jugadores duplicados con el mismo nombre y la misma nacionalidad
        // para un mismo equipo.
        @UniqueConstraint(columnNames = { "id_jugador", "nacionalidad", "posicion" }) })

public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jugador")
    private Long id;

    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;

    @Column(name = "nacionalidad", length = 60, nullable = false)
    private String nacionalidad;

    private String posicion;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(//
            name = "id_equipo", //
            nullable = false //
    )
    private Equipo equipo;

    /*----------------------------------------------------------------------------*/

    /**
     * Constructor por default, necesario para JPA. Si no esta, obtendriamos una
     * JpaSystemException
     */
    public Jugador() {
    }

    public Jugador(String nombre, String nacionalidad, String posicion, Equipo equipo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.equipo = equipo;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

}

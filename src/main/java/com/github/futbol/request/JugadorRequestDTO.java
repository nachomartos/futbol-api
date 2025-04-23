package com.github.futbol.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class JugadorRequestDTO {

	@NotEmpty(message = "El nombre no debe ser vacio o nulo")
	private String nombre;

	@NotEmpty(message = "La nacionalidad no debe ser vacio o nulo")
	private String nacionalidad;

	@NotEmpty
	@Size(min = 5, message = "La posicion del jugador debe tener al menos 5 caracteres")
	private String posicion;

	public JugadorRequestDTO(@NotEmpty(message = "El nombre no debe ser vacio o nulo") String nombre,
			@NotEmpty(message = "La nacionalidad no debe ser vacio o nulo") String nacionalidad,
			@NotEmpty @Size(min = 5, message = "La posicion del jugador debe tener al menos 5 caracteres") String posicion) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.posicion = posicion;
	}

	public JugadorRequestDTO() {

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

}

package com.github.futbol.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class EquipoRequestDTO {

	@NotEmpty
	@Size(min = 3, message = "El nombre del equipo debe tener al menos 3 caracteres")
	private String nombre;

	@NotEmpty
	@Size(min = 5, message = "La categoria del equipo debe tener al menos 5 caracteres")
	private String categoria;

	/*----------------------------------------------------------------------------*/

	public EquipoRequestDTO() {
	}

	/*----------------------------------------------------------------------------*/

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

}

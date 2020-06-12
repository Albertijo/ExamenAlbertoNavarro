package com.sanvalero.model;

import java.time.LocalDateTime;

public class cliente extends usuario {
	
	private String nombreUsusario;
	private LocalDateTime fechaAlta;
	
	public cliente(String nombreUsusario, LocalDateTime fechaAlta) {
		super(nombreUsusario, nombreUsusario, nombreUsusario, nombreUsusario, nombreUsusario);
		this.nombreUsusario = nombreUsusario;
		this.fechaAlta = fechaAlta;
	}

	public String getNombreUsusario() {
		return nombreUsusario;
	}

	public void setNombreUsusario(String nombreUsusario) {
		this.nombreUsusario = nombreUsusario;
	}

	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
}

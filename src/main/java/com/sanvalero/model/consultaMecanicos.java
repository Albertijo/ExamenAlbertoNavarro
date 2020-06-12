package com.sanvalero.model;

public class consultaMecanicos {

	private String nombreBici;
	private String ubicacion;
	private String estadoReparacion;
	
	public consultaMecanicos(String nombreBici, String ubicacion, String estadoReparacion) {
		super();
		this.nombreBici = nombreBici;
		this.ubicacion = ubicacion;
		this.estadoReparacion = estadoReparacion;
	}

	public String getNombreBici() {
		return nombreBici;
	}

	public void setNombreBici(String nombreBici) {
		this.nombreBici = nombreBici;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getEstadoReparacion() {
		return estadoReparacion;
	}

	public void setEstadoReparacion(String estadoReparacion) {
		this.estadoReparacion = estadoReparacion;
	}
	
	
}

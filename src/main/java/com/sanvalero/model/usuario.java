package com.sanvalero.model;

public class usuario {
	private String nombreUsuario;
	private String contrase�a;
	private String email;
	private String Dni;
	private String direccion;
	
	public usuario(String nombreUsuario, String contrase�a, String email, String dni, String direccion) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrase�a = contrase�a;
		this.email = email;
		Dni = dni;
		this.direccion = direccion;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}

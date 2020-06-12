package com.sanvalero.model;


import java.time.LocalDate;

public class mecanico extends usuario {

		private String nombreMecanico;
		private String categoriaProfesional;
		private LocalDate fechaAlta;
		
		public mecanico(String nombreMecanico, String categoriaProfesional, LocalDate fechaAlta) {
			super(categoriaProfesional, categoriaProfesional, categoriaProfesional, categoriaProfesional, categoriaProfesional);
			this.nombreMecanico = nombreMecanico;
			this.categoriaProfesional = categoriaProfesional;
			this.fechaAlta = fechaAlta;
		}

		public String getNombreMecanico() {
			return nombreMecanico;
		}

		public void setNombreMecanico(String nombreMecanico) {
			this.nombreMecanico = nombreMecanico;
		}

		public String getCategoriaProfesional() {
			return categoriaProfesional;
		}

		public void setCategoriaProfesional(String categoriaProfesional) {
			this.categoriaProfesional = categoriaProfesional;
		}

		public LocalDate getFechaAlta() {
			return fechaAlta;
		}

		public void setFechaAlta(LocalDate fechaAlta) {
			this.fechaAlta = fechaAlta;
		}
		
		
}

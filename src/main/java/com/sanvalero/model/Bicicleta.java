package com.sanvalero.model;

public class Bicicleta extends terminal{

		private String nombreBici;
		private String estado;
		private String ubicacion;
		
		public Bicicleta(String nombreBici, String estado, String ubicacion) {
			super(ubicacion, ubicacion, ubicacion);
			this.nombreBici = nombreBici;
			this.estado = estado;
			this.ubicacion = ubicacion;
		}

		public String getNombreBici() {
			return nombreBici;
		}

		public void setNombreBici(String nombreBici) {
			this.nombreBici = nombreBici;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getUbicacion() {
			return ubicacion;
		}

		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}
		
}

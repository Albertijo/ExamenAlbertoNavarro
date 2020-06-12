package com.sanvalero.model;

public class Averia extends Bicicleta {

		private String nombreBici;
		private String nombreAveria;
		private String estadoReparacion;
		private String ubicacion;
		
		public Averia(String nombreBici, String nombreAveria, String estadoReparacion, String ubicacion) {
			super(ubicacion, ubicacion, ubicacion);
			this.nombreBici = nombreBici;
			this.nombreAveria = nombreAveria;
			this.estadoReparacion = estadoReparacion;
			this.ubicacion = ubicacion;
		}

		public String getNombreBici() {
			return nombreBici;
		}

		public void setNombreBici(String nombreBici) {
			this.nombreBici = nombreBici;
		}

		public String getNombreAveria() {
			return nombreAveria;
		}

		public void setNombreAveria(String nombreAveria) {
			this.nombreAveria = nombreAveria;
		}

		public String getEstadoReparacion() {
			return estadoReparacion;
		}

		public void setEstadoReparacion(String estadoReparacion) {
			this.estadoReparacion = estadoReparacion;
		}

		public String getUbicacion() {
			return ubicacion;
		}

		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}
		
}

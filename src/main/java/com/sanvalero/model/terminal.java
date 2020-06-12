package com.sanvalero.model;

public class terminal {

		private String nombreTerminal;
		private String ubicacion;
		private String stock;
		
		public terminal(String nombreTerminal, String ubicacion, String stock) {
			super();
			this.nombreTerminal = nombreTerminal;
			this.ubicacion = ubicacion;
			this.stock = stock;
		}

		public String getNombreTerminal() {
			return nombreTerminal;
		}

		public void setNombreTerminal(String nombreTerminal) {
			this.nombreTerminal = nombreTerminal;
		}

		public String getUbicacion() {
			return ubicacion;
		}

		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}

		public String getStock() {
			return stock;
		}

		public void setStock(String stock) {
			this.stock = stock;
		}
		
}

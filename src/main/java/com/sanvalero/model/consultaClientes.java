package com.sanvalero.model;

public class consultaClientes {

		private String nombreTerminal;
		private int stock;
		
		public consultaClientes(String nombreTerminal, int stock) {
			super();
			this.nombreTerminal = nombreTerminal;
			this.stock = stock;
		}

		public String getNombreTerminal() {
			return nombreTerminal;
		}

		public void setNombreTerminal(String nombreTerminal) {
			this.nombreTerminal = nombreTerminal;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}
		
		
}

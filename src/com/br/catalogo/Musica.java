package com.br.catalogo;

public class Musica extends Item{

		private String cantor;
		private String banda;
		private String genero;

		public Musica(String nome, String categoria, String cantor, String banda, String genero) {
			super(nome, categoria);
			this.cantor = cantor;
			this.banda = banda;
			this.genero = genero;
		}

		public String getCantor() {
			return cantor;
		}

		public void setCantor(String cantor) {
			this.cantor = cantor;
		}

		public String getBanda() {
			return banda;
		}

		public void setBanda(String banda) {
			this.banda = banda;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String toString() {
			String modelo = "";
			modelo += "Nome: "      + super.getNome()      + "\n";
			modelo += "Categoria: " + super.getCategoria() + "\n";
			modelo += "Cantor: "    + this.getCantor()     + "\n";
			modelo += "Banda: "     + this.getBanda()      + "\n";
			modelo += "Genero: "    + this.getGenero()     + "\n";

			return modelo;
		}
}

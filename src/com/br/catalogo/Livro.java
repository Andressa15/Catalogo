package com.br.catalogo;

public class Livro extends Item{

	private String autor;
	private int paginas;

	public Livro(String nome, String categoria, String autor, int paginas) {
		super(nome, categoria);
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int paginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String toString() {
		String modelo = "";
		modelo += "Nome: "      + super.getNome()      + "\n";
		modelo += "Categoria: " + super.getCategoria() + "\n";
		modelo += "Autor: "     + this.getAutor()      + "\n";
		modelo += "Paginas: "   + this.paginas         + "\n";

		return modelo;
	}
}

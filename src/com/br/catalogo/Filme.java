package com.br.catalogo;

import java.util.List;

public class Filme extends Item{
	
	private String genero;
	private int duracao;
	private List<String> atores;

	public Filme(String nome, String categoria, String genero, int duracao, List<String> atores) {
		super(nome, categoria);
		this.genero = genero;
		this.duracao = duracao;
		this.atores = atores;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public List<String> getAtores() {
		return atores;
	}

	public void setAtores(List<String> atores) {
		this.atores = atores;
	}

	public String toString() {
		String modelo = "";
		modelo += "Nome: " + super.getNome()      + "\n";
		modelo += "Categoria: " + super.getCategoria() + "\n";
		modelo += "Genero: " + this.getGenero()     + "\n";
		modelo += "Duração: " + this.getDuracao()    + "\n";
		modelo += "Lista de atores: "  + this.atores          + "\n";

		return modelo;
	}
}

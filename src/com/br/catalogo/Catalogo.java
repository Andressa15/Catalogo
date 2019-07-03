package com.br.catalogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int repetir = 1;
		while (repetir == 1) {
			System.out.println("Catalogo");
			System.out.print("Escolha 1 para adicionar filme, ");
			System.out.print("Escolha 2 para adicionar livro, ");
			System.out.print("Escolha 3 para adicionar Música. ");
			int escolha = entrada.nextInt();

			if (escolha <2) {
				System.out.println("Qual o nome do filme?");
				String nome = entrada.next();

				System.out.println("Qual a categoria ?");
				String categoria = entrada.next();

				System.out.println("Qual o genero?");
				String genero = entrada.next();

				System.out.println("Qual a duração?");
				int duracao = entrada.nextInt();

				List<String> listaDeAtores = new ArrayList<String>();
				System.out.println("Digite o novo nome:");
				String novo = entrada.next();
				listaDeAtores.add(novo);

				Filme filmes = new Filme(nome, categoria, genero, duracao, listaDeAtores);
				System.out.println(filmes);
			}
			if (escolha > 1) {
				System.out.println("Qual o nome do livro?");
				String nome = entrada.next();

				System.out.println("Qual a categoria?");
				String categoria = entrada.next();

				System.out.println("Qual o autor?");
				String autor = entrada.next();

				System.out.println("Quantas paginas?");
				int paginas = entrada.nextInt();
				Livro livros = new Livro(nome, categoria, autor, paginas);
				System.out.println(livros);

			} else {
				System.out.println("Qual o nome da musica?");
				String nomeM = entrada.next();

				System.out.println("Qual a categoria ?");
				String categoriaM = entrada.next();

				System.out.println("Qual o cantor?");
				String cantor = entrada.next();

				System.out.println("Qual a banda?");
				String banda = entrada.next();

				System.out.println("Qual o genero?");
				String generoM = entrada.next();

				Musica musicas = new Musica(nomeM, categoriaM, cantor, banda, generoM);
				System.out.println(musicas);
			}
		}
	}
}
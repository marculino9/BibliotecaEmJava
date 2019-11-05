package com.fcv.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

///////////////FAZENDO UMA LISTA DA CLASSE LIVROS/////////////////////////
	List<Livros> livros = new ArrayList<>();

	public Biblioteca() {
	}

///////////// METODO ADICIONAR LIVROS////////////
	public void adicionarLivros(String nomeLivro, String editora, String autor) {
		for (Livros l : this.livros) {
			if (l.getNomeLivro().equals(nomeLivro)) {
				System.out.println("Nao e possivel adicionar um livro repetido.\n");
				return;
			}
		}
		Livros livro = new Livros(nomeLivro, editora, autor);
		livros.add(livro);
		System.out.println("Livro Cadastrado com sucesso! \n");
	}

	public void adicionarLivros(Livros livro) {
		livros.add(livro);
	}

///////////////MÉTODO PARA ALUGAR LIVRO DA BIBLIOTECA ////////////////////////////
	public void alugarLivro(String nomeLivro) {
		for (Livros a : this.livros) {
			if (a.getNomeLivro().equals(nomeLivro) && !a.Alugado) {
				a.Alugado = true;
				System.out.println("Livro " + a.getNomeLivro() + " alugado com sucesso! \n");
				return;
			} else {
				System.out.println("Livro nao encontrado ou ja esta alugado.  \n");
			}
		}
	}

////////////////METODO PARA REMOVER LIVRO DA BIBLIOTECA, USANDO O METODO REMOVER //////////////////////////
	public void removerLivro(String nomeLivro) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getNomeLivro().equals(nomeLivro)) {
				livros.remove(i);
				System.out.println("Livro removido. \n");
			} else {
				System.out.println("Livro nao encontrado ou encontra-se alugado. \n");
			}
		}
	}

//////////////////METODO "REMOVER"/////////////////////////
	public void removerLivro(Livros livro) {
		livros.remove(livro);
	}

//////////METODO PARA DEVOLVER LIVROS A BIBLIOTECA ////////////////////////////
	public void devolverLivro(String nomeLivro) {
		for (Livros a : livros) {
			if (a.getNomeLivro().equals(nomeLivro) && a.Alugado) {
				a.Alugado = false;
				System.out.println("Livro devolvido. \n");
			} else {
				System.out.println("Livro nao encontrado \n");
			}
		}
	}

//////////METODO PARA APRESENTAR TODOS OS LIVROS DO SISTEMA/////////////
	public void apresentarLivro() {
		for (Livros a : livros) {
			System.out.println(a);
		}
	}
}

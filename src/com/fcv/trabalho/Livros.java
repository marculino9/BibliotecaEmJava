package com.fcv.trabalho;

public class Livros {
	private String nomeLivro;
	private String editora;
	private String autor;
	boolean Alugado;

	public Livros(String nomeLivro, String editora, String autor) {
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.editora = editora;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
///////////// METODO PARA IMPRIMIR OS LIVROS DA LISTA////////////////
	@Override
	public String toString() {
		return "Nome: " + nomeLivro + " Autor: " + autor + " Editora: " + editora;
	}


}

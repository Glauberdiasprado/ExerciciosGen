package br.com.generation.ExercicioCollections;

public class Estoque {

	
		/*
		 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.

		 */
		
	private String nome;
	private double preco;
	private int quantidade;
	
		public Estoque( String nome, double preco, int quantidade) {
			this.preco = preco;
			this.quantidade = quantidade;
			this.nome = nome;
		}
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getquantidade() {
		return quantidade;
	}
	
	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	

	@Override
	public String toString() {
		return "Estoque ------> \n nome: " + nome + " | Quantidade de Roupas: " + quantidade + "| Preço: " + preco;
	
	}
}
		
		
		
		

	



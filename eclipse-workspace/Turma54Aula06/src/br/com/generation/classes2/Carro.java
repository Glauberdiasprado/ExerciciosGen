package br.com.generation.classes2;

public class Carro {

	//Atributos
	String cor;
	String modelo;
	String ano;
	boolean legalizado;
	int velocidade;
	
	//metodos
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
	
}



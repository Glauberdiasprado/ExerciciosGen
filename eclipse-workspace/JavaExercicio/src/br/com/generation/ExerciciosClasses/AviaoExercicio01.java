package br.com.generation.ExerciciosClasses;

public class AviaoExercicio01 {
		
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

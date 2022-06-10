package br.com.generation.classes2;

public class TestaCarro {

	public static void main(String[] args) {
		//Estanciar um objeto...
		Carro x1 = new Carro();
		//[Classe --> objet o--> new Construtor]
		
		x1.modelo = "BMW x1";
		x1.cor = "Azul";
		x1.ano = (String) "2021";
		x1.legalizado = true;
		x1.velocidade = 10;
		
		System.out.println("Modelo: " + x1.modelo);
		System.out.println("Cor: " + x1.cor);
		System.out.println("Ano: " + x1.ano);
		System.out.println("Legalizado: " + x1.legalizado);
		
		x1.acelerar(100);
		System.out.println("Velocidade: " + x1.velocidade);
		
		x1.freiar(40);
		System.out.println("Nova velocidade: " + x1.velocidade);
		
	}

}

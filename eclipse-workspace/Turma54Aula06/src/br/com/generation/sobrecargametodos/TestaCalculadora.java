package br.com.generation.sobrecargametodos;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		//somando dois inteiros...
		System.out.println(calc.soma(15, 110));
		
		
		//somar dois valores fracionarios...
		System.out.println(calc.soma(110.0, 115.8));
		
		System.out.println(calc.soma(8.5, 9));
	}

}

package br.comgeneration.aula02;

import java.util.Scanner;

public class ExemploVariavel04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		

		double a, b, soma, subtracao, multicação, divisão;
				
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		soma = a + b;
		
		System.out.println("O resultado somado e: " + soma);
		
		subtracao = a - b;
		
		System.out.println("O resultado subtraido e: " + subtracao);
		
		multicação = a * b;
		
		System.out.println("O resultado multiplicação e: " + multicação);
		
		divisão = a / b;
		
		System.out.println("O resultado divido e: "+ divisão);
		
	}

}
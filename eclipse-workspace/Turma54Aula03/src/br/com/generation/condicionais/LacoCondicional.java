package br.com.generation.condicionais;

import java.util.Scanner;

public class LacoCondicional {
	
	//LAÇOS CONDICIONAIS
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a 1 nota do aluno: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a 2 nota do aluno: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 9.0) {
			System.out.println("O aluno esta aprovado com milagre, sua nota foi: " +media );
		}
		else if (media >= 6.0 && media < 9.0) {
			System.out.println("Aprovado " + media);
		}
		else if (media >= 3.0 && media < 6.0) {
			System.out.println("Recuperação " + "Média: " + media);
		}
		
		else {
			System.out.println("O aluno esta reprovado, sua nota foi: " +media);
		}

	}

}
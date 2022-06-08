package br.generation.lacosrepeticao;

import java.util.Scanner;

public class ExercicioWhile01 {

	public static void main(String[] args) {
		/*
		 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
		 */

		
		int idade = 0, menos21 = 0, mais50 = 0;
		Scanner in = new Scanner(System.in);
		
		while(idade != -99) {//condiçao de repetição
			System.out.println("Informe idade: ");
			idade = in.nextInt();// recebe idade do usuario
			//pessoas com menos de 21 anos
			if(idade < 21 && idade > 0) {
				menos21++;
			}
			//pessoas com mais de 50 anos
			if(idade > 50) {
				mais50++;
			}
		}
		
		System.out.println("Total pessoas com menos de 21 anos: "+ menos21);
		System.out.println("Total pessoas com mias  de 50 anos: "+ mais50);
	}

}

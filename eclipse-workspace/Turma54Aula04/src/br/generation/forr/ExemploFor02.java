package br.generation.forr;

import java.util.Scanner;

public class ExemploFor02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10;
		int i, soma;
		
		for(i = 0, soma = 0; i <= n; i++) {
			System.out.println("Soma: " + soma + " + " + i);
			soma = soma + i;
			System.out.println("= " + soma);
		}

	}

}

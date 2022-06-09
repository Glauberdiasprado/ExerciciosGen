package br.com.generation.matriz;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaração da Matriz
		
	double[][] notaAlunos = new double [2][4];
	
	System.out.println("---> Notas dos Alunos <---");
	
	//add valores na Matriz
	for(int l = 0; l < notaAlunos.length; l++) {
		for(int c = 0; c < notaAlunos[l].length; c++) {
			System.out.printf("Digite as notas na posição da Matriz: %d %d ", l, c);
			notaAlunos[l][c] = entrada.nextDouble();
		}
		System.out.println();
	}
	
	System.out.println("---> Visualizando as Notas dos Alunos <---");
	//Mostrando os valores da Matriz
	for(int l = 0; l < notaAlunos.length; l++) {
		for(int c = 0; c < notaAlunos[l].length; c++) {
			System.out.printf(notaAlunos[l][c] + " | ");
	}
		System.out.println();
	  }
   }
}

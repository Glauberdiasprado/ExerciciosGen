package br.com.generation.vetor;

public class ArrayVetor {

	public static void main(String[] args) {
		
		int[] arrayvetor = new int[10];
		
		arrayvetor[5] = 653;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("indice do vetor: " + i + "--> " + arrayvetor[i]);
		}

	}

}

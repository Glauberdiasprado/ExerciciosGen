package br.com.generation.exceptions;

public class Exception {

	public static void main(String[] args) {
		
		int[] vetor = new int[4];
		
		try {
		vetor[4] = 10;	
		System.out.println(vetor[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepiton em averigução.....");
		}
		
	}

}

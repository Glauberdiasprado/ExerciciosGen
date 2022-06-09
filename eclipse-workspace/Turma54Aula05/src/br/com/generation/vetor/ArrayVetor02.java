package br.com.generation.vetor;

public class ArrayVetor02 {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[31];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 29.3;
		temperaturas[2] = 27.8;
		
		
		
		System.out.println("O valor da temperaturas do dia 04: " + temperaturas[3]);
		
		System.out.println("O tamanho do vetor de temperaturas: " + temperaturas.length);
		
		System.out.println("Valores do meu vetor de temperaturas: ");
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura: " + i + "° é: " + temperaturas[i]);
		}
	}

}
 
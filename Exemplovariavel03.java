package br.comgeneration.aula02;

import java.util.Scanner;

public class Exemplovariavel03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double galoes = 10.0, litros, x;
		
		litros = galoes * 3.7854;
		
		System.out.println(galoes + "Quantidadegalões USA são: ");
		x = leia.nextDouble();
		
		System.out.println("Corresponde á: " + litros + "litros");
	}

}

package br.com.generation.metodos;

import java.util.Scanner;

public class TesteMetodos {

	static int numero3 = 500, numero4, multiplicacao; //--> variaveis globais
	
	
	public static void main(String[] args) {
		
		System.out.println(numero3);
		scanner();
		
		
		metodo01();
		System.out.println("Olá Sou o método Principal!");
		metodo03();
		metodo04();
		
		TestaMetodoFora.metodo05();
		
		metodo06(numero3, numero4);
		
	}
	
	public static void scanner() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor da variavel numero3: ");
		numero3 = entrada.nextInt();
		System.out.println("Digite o valor da variavel numero4: ");
		numero4 = entrada.nextInt();
	}
	
	public static void metodo01() {
		System.out.println("Olá Sou o método01!");
		metodo02();
	}
	
	public static void metodo02() {
		//No metodo as variaveis declaradas funcionam apenas dentro dele.
		double numero1 = 10, numero2 = 30, soma; //--> variaveis locais.
		soma = numero1 + numero2;
		System.out.println("Soma realizada no método02: " + soma);
	}
	
	public static void metodo03() {
		multiplicacao = numero3 * numero4;
	}
	
	public static void metodo04() {
		System.out.println("Metodo 04 está mostrando o calculo que foi feito no metodo 03: " + multiplicacao);
	}
	
	public static void metodo06(int num5, int num6) {
		int subtracao = num5 - num6;
		System.out.println("A subtração no método 06: " + subtracao);
	}
	

}
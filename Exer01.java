package br.comgeneration.aula02;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		//*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
		
		int   dia, dias,  mes, meses, ano, idade, total;
		
		dia = 1;
		
		mes = 30;
		
		ano = 365;
		
		dias = 9;
		
		meses = 6;
		
		idade = 22;
		
		
		
		
		total = dia * dias + mes * meses + ano * idade;
		System.out.println("Dia de nascimento: " + dias);
		System.out.println("Dia do Mes: " + meses);
		System.out.println("Total de Dias " + total);
		
		
		
		
	}

}

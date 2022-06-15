package br.generation.aula01;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class teste {


public static void main(String[] args) throws InterruptedException {
	
	 JOptionPane.showMessageDialog(null,"-----> Sejam Bem vindes a pagina Back End <-----");

	System.out.println();	
	System.out.println("Como o próprio nome sugere, vem da ideia daquilo que tem por trás de uma aplicação. Pode ficar meio abstrato num primeiro momento, mas pense que para conseguir usar o Facebook no dia a dia, os dados (as informações) do seu perfil, amigos e publicações precisam estar salvos em algum lugar e serem processados a partir dele, sendo este lugar um banco de dados.");
	System.out.println();
	System.out.println("É comum pessoas desenvolvedoras Back End trabalharem com ferramentas de linha de comando, sites (deixando o HTML dinâmico), análise de dados (embora isso puxe mais o que um Data Scientist faz). Tudo isso pode ser feito com uma série de linguagens de programação diferentes como: PHP, Ruby, Java, Clojure, C#, entre diversas outras..");
	System.out.println();	
    System.out.println("------------");	
	Scanner leia = new Scanner(System.in);
	
	int opcao1=0, opcao2=0,opcao3=0, interesse = 0, nivel=0;

	System.out.println();		
	System.out.println("Se interessou em Back End?");
	System.out.println();
	Thread.sleep(500);
	System.out.println("Digite 1 para SIM");
	Thread.sleep(300);
	System.out.println("Digite 2 para NÃO");
	interesse = leia.nextInt();
	
if (interesse ==1) {
		System.out.println();
		Thread.sleep(500);
		System.out.println("Acesso aos links Gratuito!! ");
		Thread.sleep(1000);
		System.out.println( "Digite 1 :");
		Thread.sleep(500);
		System.out.println("1 para Cursos Back end ");
		nivel=leia.nextInt();
		
		if(nivel== 1) {
			Thread.sleep(500);
			System.out.println("Selecionamos alguns cursos gratuitos para iniciar o sua no Formação: ");
			System.out.println();
			Thread.sleep(500);
			System.out.println();
			Thread.sleep(300);
			System.out.println("| Java |:");
			System.out.println("https://www.cursoemvideo.com/curso/java-basico/");
			System.out.println();
			Thread.sleep(300);
			System.out.println("| Algoritimos |: ");
			System.out.println("https://www.cursoemvideo.com/curso/curso-de-algoritmo/");
			System.out.println();
			Thread.sleep(300);
			System.out.println(" |Java Poo |:");
			System.out.println("https://www.cursoemvideo.com/curso/java-poo/");
			System.out.println();
			Thread.sleep(300);
			System.out.println();
			System.out.println();
		    System.out.println("Bons estudos e bons Videos!!!!");
		
		
		
	    System.out.println("------------");	


					
	if(nivel !=1 ) {
		System.out.println();
		Thread.sleep(500);
		System.out.println("Opção inválida.Digite novamente ou retorne ao menu principal."); 			

				
			
	
	
	
	}
}

	}
  }
}

package br.generation.lacosrepeticao;

import java.util.Scanner;

public class ExercicioFor02 {

	/*
	 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	 */
	
    public  static  void  main ( String [] argss ){
        Scanner  in = new  Scanner ( System . in );
        int  num , par = 0 , impar = 0 ;

        for ( int  i = 1 ; i <= 10 ; i ++){
            System.out.println( "Digite o " + i + "º número" );
            num = in.nextInt ();

            if ( num % 2 == 0 ){
                par++;
            }
            else{
                impar++;
            }

            System.out.println();
        }

        System.out.println( "Foram digitados " + par + " números pares \n" );
        System.out.println( "Foram digitados " + impar+ " números impares \n" );
    }
}
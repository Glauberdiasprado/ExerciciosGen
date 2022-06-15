package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {
		
		String aula1 = "Bloco I - Java";
		String aula2 = "Bloco II - SpringBoot";
		String aula3 = "Bloco III - FrontEnd";
		String aula4 = "Bloco IV - Mobile";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1); //--> [0] Posições
		aulas.add(aula2); //--> [1]
		aulas.add(aula3); //--> [2]
		aulas.add(aula4); //--> [3]
		
		/*System.out.println(aulas);
		
		aulas.remove(0);
		System.out.println(aulas);*/
		
		/*for(String i: aulas) {
			System.out.println("Aulas: " + i);
		}*/
		
		/*String terceiraAula = aulas.get(2);
		System.out.println(terceiraAula);*/
		
		/*System.out.println(aulas.get(2));*/
		
		//for(int i = 0; i < aulas.size(); i++) {
		//System.out.println((i+1) + "° Aulas: " + aulas.get(i));
		//}
		
		//System.out.println("Tamanho do ArrayList: " + aulas.size());
		
		//Collections.sort(aulas);
		Collections.shuffle(aulas);
		System.out.println(aulas);
		
	}

}

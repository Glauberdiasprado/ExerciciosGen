package br.com.generation.ExerciciosClasses;

public class TesteAvião {
	public static void main(String[] args) {
	

				
		AviaoExercicio01 teteco = new AviaoExercicio01();
				
				
		teteco.modelo = "teteco ";
		teteco.cor = "Azul";
		teteco.ano = (String) "2021";
		teteco.legalizado = true;
		teteco.velocidade = 1000;
				
				System.out.println("Modelo: " + teteco.modelo);
				System.out.println("Cor: " + teteco.cor);
				System.out.println("Ano: " + teteco.ano);
				System.out.println("Legalizado: " + teteco.legalizado);
				
				teteco.acelerar(100);
				System.out.println("Velocidade: " + teteco.velocidade);
				
				teteco.freiar(40);
				System.out.println("Nova velocidade: " + teteco.velocidade);
				
			}

		}

		///teste
	

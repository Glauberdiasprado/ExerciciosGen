package br.com.generation.classes;

public class TesteAluno {

	public static void main(String[] args) {
		// Estanciando um objeto.... Criar um onjeto -->
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.nome ="Glauber do P.dias ";
		aluno1.idade = 23;
		aluno1.curso = "Java Bloco I";
		
		aluno1.assistirAula();
		aluno1.estudar();
		
		
		System.out.println(aluno1.nome);
		System.out.println(aluno1.idade);
		System.out.println(aluno1.curso);
		aluno1.assistirAula();
		aluno1.estudar();
		
		
		aluno2.nome = "jerume";
		aluno2.idade = 22;
		aluno2.curso = "Java Bloco II";
		
		System.out.println(aluno2.nome);
		System.out.println(aluno2.idade);
		System.out.println(aluno2.curso);
		aluno2.assistirAula();
		aluno2.estudar();
		
	}
	
	
	

}

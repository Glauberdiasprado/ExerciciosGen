package br.com.generation.heranca;

public class Testatodos {

	public static void main(String[] args) {
		
		
		
		Professor prof1 = new Professor();
		
		prof1.setNome("Pablo");
		prof1.setIdade(26);
		prof1.setEndereco("Rua logo ali, 222 - SP");
		
		prof1.setSalario(12.000);
		
		prof1.setDisciplina("Java");
		
		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getSalario());
		System.out.println(prof1.getDisciplina());
		System.out.println();
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Glauber");
		aluno1.setIdade(23);
		aluno1.setEndereco("Rua claudio, 100 - SP");
		aluno1.setSemestre("2° semestre");
		aluno1.setCurso("Java");
		
		System.out.println("Nome Aluno: " + aluno1.getNome());
		System.out.println();
		
		
		FuncAdm func1 = new FuncAdm();
		
		func1.setNome("jubicleidson");
		
		System.out.println("Nome do Funcionario Adm: " + func1.getNome());
	}

}

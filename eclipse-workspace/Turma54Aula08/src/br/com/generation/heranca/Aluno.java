package br.com.generation.heranca;

public class Aluno extends Pessoa{
	
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	private String semestre;
	private String curso;
}

programa
{
	
/*progrma: Laço Condicional
 * autor: Glauber
 * data: 30/05/22
 */
	
	funcao inicio()
	{
	//declaração de variaveis
	real nota1, nota2, media
	cadeia nomeAluno

	escreva("Deigite o nome do Aluno: ")
	leia(nomeAluno)

	escreva("Digite a Nota 1: ")
	leia(nota1)//10,00

	escreva("Digite a Nota 2: ")
	leia(nota2)//5,5

	media = (nota1 + nota2) / 2

	//Laço Condicional
	se (media >=9.0){
		escreva("Aluno: "+ nomeAluno + " Aluno Aprovado!!" + "\nMédia: "+ media)
		
		}

		senao se(media >= 6.0 e media <= 9.0){
			escreva("Aluno: " + nomeAluno + "  Aprovado!!" + "\nMédia: " + media)
		}

	senao se(media >= 3.0 e media < 6.0){
			escreva("Aluno: " + nomeAluno + "  Recuperação!!" + "\nMédia: " + media)
		}
		
	se	
		escreva("Aluno: " + nomeAluno + " AlunoReprovado!!" + "\nMédia: " + media)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 27; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
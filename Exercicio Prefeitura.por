programa
{
	inclua biblioteca Matematica --> mat
	 
	funcao inicio()
	{


/* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00. */
		
		real mediaS, mediaF, maiorS = 0, salario, totalS = 0
		inteiro filhos, totalF = 0, quantidadeP, salario100 = 0
		escreva("Quantidade de pessoas: ")
		leia(quantidadeP)

		para(inteiro c = 0; c < quantidadeP; c++){
			escreva("Informe o Salario: R$")
			leia(salario)
			escreva("Quantos Filho tem: ")
			leia(filhos)

			quantidadeP++
			totalS += salario
			totalF += filhos

			se(salario > maiorS){
				maiorS = salario	
			}

			se(salario <= 100){
				salario100++	
			
			}

			mediaS = totalS/quantidadeP
			mediaF = totalF/quantidadeP
			quantidadeP = (salario100*100)/quantidadeP



		escreva("média do salário da população: R$"+mat.arredondar(mediaS, 2.0)+ "\n")
		escreva("média do número de filhos: "+mediaF+ "\n")
		escreva("salário maior: "+maiorS+ "\n")
		escreva("percentual de pessoas com salário até R$100,00: "+ quantidadeP+ "%\n")

			
		}

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1221; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
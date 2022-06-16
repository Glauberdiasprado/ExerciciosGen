programa
{
/*
4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/
	
/*Exercicio 4
 * autor: Glauber
 * data: 30/05/22
 */

	
	funcao inicio()
	{
		inteiro numero, x

		escreva("Digite um número: ")
		leia(numero)
		
		x = numero % 2
		
		se (numero % 2 == 1){
		escreva(numero + " é impar ")
		
		}

		senao {
			escreva(numero + " é par")
			}

		se(x >=0){
			escreva(" e positivo")
		
			
			}
			
		senao{ 
			escreva(" e negativo")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
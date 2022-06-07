programa
{
	
	funcao inicio()
	{
		/*
		 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		 a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.	
		 */


		inteiro N1[2][2] = {{1, 2},{3, 4}} , N2[2][2] = {{1, 2},{3, 4}} , M1[2][2] , M2[2][2]

		para(inteiro i=0; i < 2; i++){
			para(inteiro g=0; g< 2; g++){
				M1[i][g]= N1[i][g]+N2[i][g]
				M2[i][g]= N1[i][g]-N2[i][g]
			
			
			}
		
		
		}
		escreva("\nA Matriz M1 contem a soma de: ")
		para(inteiro i=0; i <2; i++){
			para(inteiro g=0; g<2; g++){
				escreva(M1[i][g], " | ")
				}
				escreva("\n")
			
				}
				
		escreva("\nA Matriz M2 contem a soma de: ")
		 para(inteiro i=0; i <2; i++){
			para(inteiro g=0; g<2; g++){
				escreva(M2[i][g], " | ")
				}
				escreva("\n")

}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
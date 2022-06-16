programa
{
	/* Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer como leitura dos valores enquanto o usuário estiver indicando valores
positivo. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.*/
	
	funcao inicio()
	{
    
	real numero, soma = 0, media = 0, resultado = 0
		escreva("digite um valor positivo: ")
		leia (numero)
		
          
         

          
		enquanto (numero >= 0){

               soma += numero
			
			escreva("digite um valor positivo: ")
		     leia (numero)
		     
		     resultado++

		     media = soma / resultado

		     se (numero < 0 ){
		     	escreva(" ESSE NUMERO E NEGATIVO!!" + "\n")
		     	} }



		     
		     escreva("\n resultado da soma: " + soma)
		     escreva("\n resultado da media: " + media)


	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
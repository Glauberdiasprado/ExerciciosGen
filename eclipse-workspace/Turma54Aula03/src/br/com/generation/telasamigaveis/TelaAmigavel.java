package br.com.generation.telasamigaveis;

import javax.swing.JOptionPane;

public class TelaAmigavel {

	//Exemplo de tela amigavel
	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		if(numero % 4 == 0 && numero % 5 == 0) {
			JOptionPane.showMessageDialog(null, " O número " + numero + " é divisivel por 4 e 5 ");
		}
		else {
			JOptionPane.showMessageDialog(null, " O número " + numero + " não é divisivel por 4 e 5 ");
		}
	}

}

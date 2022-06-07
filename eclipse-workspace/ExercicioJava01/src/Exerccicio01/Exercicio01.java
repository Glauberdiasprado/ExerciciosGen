package Exerccicio01;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		Locale.setDefault(new Locale("en", "US"));
		int num1, num2, num3, maior = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

		if(num1 > maior) {
			maior = num1;
		}
		if(num2 > maior) {
			maior = num2;
		}
		if(num3 > maior) {
			maior = num3;
		}
		JOptionPane.showMessageDialog(null, "O Maior Número foi: " + maior);
		
		
	}

}

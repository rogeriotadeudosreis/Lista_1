package Lista_Exercicios_N2;

/*Escreva um programa que mostre na tela os números inteiros de 1 a 300, em ordem
crescente. Em seguida imprima os números em ordem decrescente.*/

public class Exercicio_9_N2 {

	public static void main(String[] args) {

		int numinicial = 1;
		int numfinal = 300;
		int decrescente = 300;

		while (numinicial <= numfinal) {
			
			System.out.println(numinicial + " \t" + decrescente);
			decrescente--;
			
			numinicial++; // n = n + 1

		}
		

	}

}

package lista_exercicios_N1;

/*Escreva um programa que leia o nome, o peso de uma pessoa na Terra e o n�mero de
um planeta e imprima o valor do peso desta pessoa neste planeta. A rela��o de planetas �
dada a seguir juntamente com o valor das gravidades relativas � Terra:*/

import java.util.Scanner;

public class Exercicio_33_peso_nos_planetas {

	public static void main(String[] args) {

		String nome;
		float peso,mercurio, venus, marte, jupiter, saturno,urano;
		char planeta;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		nome = entrada.nextLine();
		System.out.println("Digite seu peso:");
		peso = entrada.nextFloat();
		System.out.println("Digite a op��o de planeta:");
		planeta = entrada.next().charAt(0);
		
		mercurio = peso * 0.37f;
		venus = peso * 0.88f;
		marte = peso * 0.38f;
		jupiter = peso * 2.64f;
		saturno = peso * 1.15f;
		urano = peso * 1.17f;
		
		switch (planeta) {

		case '1':
			peso = mercurio;
			System.out.printf(nome + ", seu peso em Merc�rio �: %4.1f kilos.", peso);
			break;
		case '2':
			peso = venus;
			System.out.printf(nome + ", seu peso em V�nus �: %4.1f kilos.", peso);
			break;
		case '3':
			peso = marte;
			System.out.printf(nome + ", seu peso em Marte �: %4.1f kilos.", peso);
			break;
		case '4':
			peso = jupiter;
			System.out.printf(nome + ", seu peso em J�piter �: %4.1f kilos.", peso);
			break;
		case '5':
			peso = saturno;
			System.out.printf(nome + ", seu peso em Saturno �: %4.1f kilos.", peso);
			break;
		case '6':
			peso = urano;
			System.out.printf(nome + ", seu peso em Urano �: %4.1f kilos.", peso);
			break;

		default: {
			System.out.println("Op��o inv�lida.");
		}
		}
		entrada.close();
	}
}

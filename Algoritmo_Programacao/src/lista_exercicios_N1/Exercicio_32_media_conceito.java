package lista_exercicios_N1;

/*Leia a m�dia de um aluno em certa disciplina e mostre o conceito obtido nessa
disciplina. A tabela de conceitos � dada a seguir:*/

import java.util.Scanner;

public class Exercicio_32_media_conceito {

	public static void main(String[] args) {

		float media;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a m�dia do aluno:");
		media = entrada.nextFloat();

		if (media >= 0.0 && media <= 10) {

			if (media >= 9.0) {
				System.out.printf("O aluno possui m�dia %4.2f  , Conceito A.", media);
			}else if (media >= 7.0) {
				System.out.printf("O aluno possui m�dia %4.2f  , Conceito B",media);
			}else if (media >= 5.0) {
				System.out.printf("O aluno possui m�dia %4.2f  , Conceito C",media);
			}else {
				System.out.printf("O aluno possui m�dia %4.2f  , Conceito D",media);
			}
				
		}else {
			System.out.printf("Nota inv�lida.");
		}
		entrada.close();
	}
}

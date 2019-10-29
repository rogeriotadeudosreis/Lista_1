package Lista_Exercicios_N2;

/*Num frigorífico existem 5 bois. Cada boi traz em seu pescoço um cartão contendo seu
número de identificação e seu peso. Faça um programa que escreva o número e o peso
do boi mais gordo e do boi mais magro. Assuma que os dados são válidos*/

import java.util.Scanner;

public class Exercicio_28_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ident = 0, i;
		int identGordo = ident, identMagro = ident;
		double peso;
		double gordo = 0;
		double magro = 0;

		for (i = 0; i < 5; i++) {

			System.out.printf("Digite o número de identificação do %do boi: ", i + 1);
			ident = teclado.nextInt();
			System.out.printf("Digite o peso do %do boi: ", i + 1);
			peso = teclado.nextDouble();
			do {
				if (peso < 1) {
					System.out.println("Peso inválido! - Digite novamente:");
					peso = teclado.nextDouble();
				}

			} while (peso < 1);

			if (i == 0) {
				gordo = peso;
				magro = peso;
				identGordo = ident;
				identMagro = ident;
			}
			if (peso > gordo) {
				gordo = peso;
				identGordo = ident;
			}
			if (peso < magro) {
				magro = peso;
				identMagro = ident;
			}

		}
		System.out.println("");
		System.out.println("-----Resultado das coletas-----");
		System.out.println("");
		System.out.printf("Boi mais gordo:\nNúmero de identificação: %d\nPeso informado: %.4f\n", identGordo, gordo);
		System.out.println("");
		System.out.printf("Boi mais magro:\nNúmero de identificação: %d\nPeso informado: %.4f\n", identMagro, magro);

		teclado.close();
	}
}

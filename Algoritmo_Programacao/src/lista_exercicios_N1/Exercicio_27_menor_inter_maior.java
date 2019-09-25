package lista_exercicios_N1;

import java.util.Scanner;

public class Exercicio_27_menor_inter_maior {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int A, B, C, menor, inter, maior;

		System.out.println("Digite o valor A:");
		A = entrada.nextInt();
		System.out.println("Digite o valor B:");
		B = entrada.nextInt();
		System.out.println("Digite o valor C:");
		C = entrada.nextInt();

		if ((A < B) && (B < C)) {
			menor = A;
			inter = B;
			maior = C;

		} else if ((A < C) && (C < B)) {
			menor = A;
			inter = C;
			maior = B;

		} else if ((B < A) && (A < C)) {
			menor = B;
			inter = A;
			maior = C;
		} else if ((B < C) && (C < A)){
			menor = B;
			inter = C;
			maior = A;
		}else if ((C < A) && (A < B)){
			menor = C;
			inter = A;
			maior = B;
		}else {
			menor = C;
			inter = B;
			maior = A;
		}
		System.out.printf("O valores digitados foram: %d,%d,%d.", menor, inter, maior);

		entrada.close();
	}
}

package lista_exercicios_N1;

import java.util.Scanner;

public class exercicio_26_numero_divisivel {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num_A, num_B;

		System.out.print("Usuário, informe o número A:");
		num_A = entrada.nextInt();
		System.out.print("Agora, informe o número B:");
		num_B = entrada.nextInt();

		if (num_A % num_B == 0) {
			System.out.printf("O número %d é divisível pelo número %d.", num_A, num_B);
		} else {
			System.out.printf("O número %d não é divisível pelo número %d.", num_A, num_B);
		}

		entrada.close();
	}
}

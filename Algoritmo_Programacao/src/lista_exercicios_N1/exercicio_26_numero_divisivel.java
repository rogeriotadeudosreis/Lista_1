package lista_exercicios_N1;

import java.util.Scanner;

public class exercicio_26_numero_divisivel {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num_A, num_B;

		System.out.print("Usu�rio, informe o n�mero A:");
		num_A = entrada.nextInt();
		System.out.print("Agora, informe o n�mero B:");
		num_B = entrada.nextInt();

		if (num_A % num_B == 0) {
			System.out.printf("O n�mero %d � divis�vel pelo n�mero %d.", num_A, num_B);
		} else {
			System.out.printf("O n�mero %d n�o � divis�vel pelo n�mero %d.", num_A, num_B);
		}

		entrada.close();
	}
}

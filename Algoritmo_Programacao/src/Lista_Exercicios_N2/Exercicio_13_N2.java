package Lista_Exercicios_N2;

/*Solicite um número entre 1 e 5. Se a pessoa digitar um número fora deste intervalo, o
sistema deve escrever “Entrada Inválida” e solicitar o número novamente. Se digitar um
número válido, imprima “Parabéns! O número digitado foi ... “.*/

import java.util.Scanner;

public class Exercicio_13_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número de 1 a 5:");
		numero = teclado.nextInt();

		while (numero < 1 || numero > 5) {

			System.out.println("Entrada inválida, digite novamente:");
			numero = teclado.nextInt();
		}

		System.out.println("Parabéns ! o número digitado foi:" + numero);

		teclado.close();
	}

}

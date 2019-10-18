package Lista_Exercicios_N2;

/*Solicite um n�mero entre 1 e 5. Se a pessoa digitar um n�mero fora deste intervalo, o
sistema deve escrever �Entrada Inv�lida� e solicitar o n�mero novamente. Se digitar um
n�mero v�lido, imprima �Parab�ns! O n�mero digitado foi ... �.*/

import java.util.Scanner;

public class Exercicio_13_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;

		System.out.println("Digite um n�mero de 1 a 5:");
		numero = teclado.nextInt();

		while (numero < 1 || numero > 5) {

			System.out.println("Entrada inv�lida, digite novamente:");
			numero = teclado.nextInt();
		}

		System.out.println("Parab�ns ! o n�mero digitado foi:" + numero);

		teclado.close();
	}

}

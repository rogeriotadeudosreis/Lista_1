package lista_exercicios_N1;

/*Escreva um programa que leia dois n�meros inteiros e imprima a seguinte sa�da, com os
valores calculados, sabendo que o primeiro n�mero informado ser� o dividendo e o
segundo, o divisor:
Dividendo =
Divisor =
Quociente =
Resto =
*Obs. Para obter o resto de uma divis�o utilize o operador %.*/
import java.util.Scanner;

public class exercicio_4_leia_dois_numeros_inteiros {

	public static void main(String[] argas) {
		Scanner entrada = new Scanner(System.in);
		int num_1, num_2;
		int quociente, resto;

		System.out.print("Usu�rio, digite o primeiro n�mero:");
		num_1 = entrada.nextInt();
		System.out.print("Agora, digite o segundo o n�mero:");
		num_2 = entrada.nextInt();

		quociente = num_1 / num_2;
		resto = num_1 % num_2;

		System.out.printf("Dividendo:%d\nDivisor:%d\nQuociente:%d\nResto:%d.", num_1, num_2, quociente, resto);
		entrada.close();
	}
}

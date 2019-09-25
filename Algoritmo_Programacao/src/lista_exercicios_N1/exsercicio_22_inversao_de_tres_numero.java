package lista_exercicios_N1;

/*Escreva um programa que receba um número inteiro de 3 dígitos e imprima o dígito das
Centenas, o dígito das Dezenas e o dígito das Unidades. Em seguida, o programa deverá 
inverter o número recebido, isto é, se o usuário digitou 123, seu programa deverá gerar o
número 321.*/
import java.util.Scanner;

public class exsercicio_22_inversao_de_tres_numero {
	public static void main(String[] argas) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3, aux;

		System.out.print("Usuário, informe o primeiro número:");
		num1 = entrada.nextInt();
		System.out.print("Agora, informe o segundo número:");
		num2 = entrada.nextInt();
		System.out.print("Agora, informe o terceiro número:");
		num3 = entrada.nextInt();

		aux = num3;
		num3 = num1;
		num1 = aux;
						
		System.out.printf("Os três números informados, invertidos são: %d %d %d ", num1,num2,num3);
		entrada.close();

	}
}

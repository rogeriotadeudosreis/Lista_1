package lista_exercicios_N1;

/*Escreva um programa que receba um n�mero inteiro de 3 d�gitos e imprima o d�gito das
Centenas, o d�gito das Dezenas e o d�gito das Unidades. Em seguida, o programa dever� 
inverter o n�mero recebido, isto �, se o usu�rio digitou 123, seu programa dever� gerar o
n�mero 321.*/
import java.util.Scanner;

public class exsercicio_22_inversao_de_tres_numero {
	public static void main(String[] argas) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3, aux;

		System.out.print("Usu�rio, informe o primeiro n�mero:");
		num1 = entrada.nextInt();
		System.out.print("Agora, informe o segundo n�mero:");
		num2 = entrada.nextInt();
		System.out.print("Agora, informe o terceiro n�mero:");
		num3 = entrada.nextInt();

		aux = num3;
		num3 = num1;
		num1 = aux;
						
		System.out.printf("Os tr�s n�meros informados, invertidos s�o: %d %d %d ", num1,num2,num3);
		entrada.close();

	}
}

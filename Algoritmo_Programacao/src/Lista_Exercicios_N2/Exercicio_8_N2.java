package Lista_Exercicios_N2;

/*Escrever um programa que calcule todos os números inteiros divisíveis por um certo
valor indicado pelo usuário, e compreendidos em um intervalo também especificado
pelo usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e
após ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
Usar o comando While. Exemplo: Valor do divisor: 3; Inicio do Intervalo: 17; Fim do
Intervalo: 29; Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24, 27.*/

import java.util.Scanner;

public class Exercicio_8_N2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int divisor;
		int numinicial;
		int numfinal;
		
		System.out.print("Digite o valor do divisor:");
		divisor = entrada.nextInt();
		System.out.print("Digite o valor inicial:");
		numinicial = entrada.nextInt();
		System.out.print("Digite o valor final:");
		numfinal = entrada.nextInt();
	
		
		System.out.printf(" Os números divisíveis por %d no intervalo de %d a %d são:\n",divisor,numinicial, numfinal);

		while (numinicial <= numfinal) {

			if (numinicial % divisor == 0) {

				System.out.printf(" %d ",  numinicial);
				
			}
			numinicial++;
		}

		entrada.close();
	}
}

package lista_exercicios_N1;

/*Escreva um programa que leia um valor de hora e informe quantos minutos se passaram
desde o início do dia.*/
import java.util.Scanner;

public class exercicio_23_ler_hora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int hora, minutos;

		System.out.print("Usuário, informe a hora:");
		hora = entrada.nextInt();

		minutos = (hora - 0) * 60;

		System.out.printf("Conforme hora informada, se passaram %d minutos.", minutos);

		entrada.close();
	}
}

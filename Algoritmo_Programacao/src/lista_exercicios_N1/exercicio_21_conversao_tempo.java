package lista_exercicios_N1;

/*Faça um programa que leia um tempo total em segundos e expresse-o em horas, minutos e
segundos. Ex. 140s = 0h 2m 20s.*/
import java.util.Scanner;

public class exercicio_21_conversao_tempo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int tempo_seg, segundos, horas, min;
		System.out.print("Usuário, informe o tempo total em segundos:");
		tempo_seg = entrada.nextInt();

		horas = tempo_seg / 3600;
		min = (tempo_seg % 3600) / 60;
		segundos = (tempo_seg % 3600) % 60;
		System.out.printf("O tempo em segundos pode ser expressado em:%d horas %d minutos e %d segundos.", horas, min,
				segundos);
		entrada.close();

	}

}

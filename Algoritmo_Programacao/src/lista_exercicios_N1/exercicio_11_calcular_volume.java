package lista_exercicios_N1;

/*Faça um algoritmo que recebe o raio de uma esfera e calcula o seu volume (v = 4/3.P.R3),
 *  e a área (a = P.R2).*/
import java.util.Scanner;

public class exercicio_11_calcular_volume {

	public static void main(String[] argas) {

		Scanner entrada = new Scanner(System.in);

		double raio, area, volume;
		double pi = 3.1415;

		System.out.print("Usuário, informe a medida do raio:");
		raio = entrada.nextDouble();

		area = (pi * Math.pow(raio, 2));
		volume = (4 * pi * Math.pow(raio, 3) / 3);

		System.out.printf("A área do circulo é:%4f\n", area);
		System.out.printf("O volume do circulo é:%4f.", volume);
		entrada.close();
	}
}

package lista_exercicios_N1;

/*	calcular �rea e per�metro de um ret�ngulo*/
import java.util.Scanner;

public class exercicio_5_area_e_perimetro_retangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double base, altura, �rea, perimetro;

		System.out.print("Informe a base:");
		base = entrada.nextDouble();
		System.out.print("Informe a altura:");
		altura = entrada.nextDouble();

		�rea = base * altura;
		perimetro = 2 * base + 2 * altura;

		System.out.printf("A �rea desse ret�ngulo �:%4.2f\n", �rea);
		System.out.printf("O per�metro desse ret�ngulo �:%4.2f.", perimetro);
		entrada.close();
	}
}

package lista_exercicios_N1;

/*	calcular área e perímetro de um retângulo*/
import java.util.Scanner;

public class exercicio_5_area_e_perimetro_retangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double base, altura, área, perimetro;

		System.out.print("Informe a base:");
		base = entrada.nextDouble();
		System.out.print("Informe a altura:");
		altura = entrada.nextDouble();

		área = base * altura;
		perimetro = 2 * base + 2 * altura;

		System.out.printf("A área desse retângulo é:%4.2f\n", área);
		System.out.printf("O perímetro desse retângulo é:%4.2f.", perimetro);
		entrada.close();
	}
}

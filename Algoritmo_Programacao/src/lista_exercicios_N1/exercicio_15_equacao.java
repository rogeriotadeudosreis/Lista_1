package lista_exercicios_N1;

/*15. Faça um algoritmo que leia x e y e resolva a equação abaixo:

Eq = 2 ∗ √3x + 30 3 + (y − 32) 4*/
import java.util.Scanner;

public class exercicio_15_equacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int x, y;
		double equacao;

		System.out.print("Usuário, informe o valor de x:");
		x = entrada.nextInt();
		System.out.print("Usuário, informe o valor de y:");
		y = entrada.nextInt();
		
		equacao = (2 * Math.sqrt(3*x+30)) / 3 + Math.pow(y-32, 4);
		System.out.printf("A resolução da equação é: %4.4f.", equacao);

		entrada.close();

	}
}

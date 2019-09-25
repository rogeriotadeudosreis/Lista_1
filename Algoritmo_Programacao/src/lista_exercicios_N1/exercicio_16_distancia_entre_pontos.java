package lista_exercicios_N1;

/*Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano,
P(x1,y1) e P(x2,y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:*/
import java.util.Scanner;

public class exercicio_16_distancia_entre_pontos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int x1, x2, y1, y2;
		double distancia, ponto1, ponto2;

		System.out.print("Usuário, informe o valor de x2:");
		x2 = entrada.nextInt();
		System.out.print("Usuário, informe o valor de x1:");
		x1 = entrada.nextInt();
		System.out.print("Usuário, informe o valor de y2:");
		y2 = entrada.nextInt();
		System.out.print("Usuário, informe o valor de y1:");
		y1 = entrada.nextInt();

		ponto1 = Math.pow(x2 - x1, 3.0);
		ponto2 = Math.pow(y2 - y1, 3.0);
		distancia = Math.sqrt(ponto1 + ponto2);

		System.out.printf("A distância calculada é: %4.2f.", distancia);
		entrada.close();
	}
}

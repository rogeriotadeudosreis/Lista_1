package lista_exercicios_N1;

/*Fa�a um algoritmo que calcule a quantidade de litros de combust�vel gasta em uma
viagem, utilizando um autom�vel que faz 12Km por litro. Para obter o c�lculo, o usu�rio
deve fornecer o tempo gasto na viagem e a velocidade m�dia durante ela. Desta forma, ser�
poss�vel obter a dist�ncia percorrida com a f�rmula DISTANCIA = TEMPO *
VELOCIDADE. Tendo o valor da dist�ncia, basta calcular a quantidade de litros de
combust�vel utilizada na viagem com a f�rmula: LITROS_USADOS = DISTANCIA /
AUTONOMIA. O programa deve apresentar os valores da velocidade m�dia, tempo gasto
na viagem, a dist�ncia percorrida e a quantidade de litros utilizada na viagem.*/
import java.util.Scanner;

public class exercicio_19_consumo_combustivel {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int horas;
		int km_litro = 18;
		double distancia, litros_usados, vel_media, valor_gasto_comb;
		double preco_litro = 4.80;

		System.out.print("Usu�rio, informe a quantidade de horas da viagem:");
		horas = entrada.nextInt();
		System.out.print("Agora, informe a velocidade m�dia que viajou:");
		vel_media = entrada.nextDouble();

		distancia = horas * vel_media;
		litros_usados = distancia / km_litro;
		valor_gasto_comb = litros_usados * preco_litro;

		System.out.printf("Velocidade m�dia da viagem:%4.0f km por hora.\n", vel_media);
		System.out.printf("Tempo gasto nesta viagem foi:%d horas.\n", horas);
		System.out.printf("A dist�ncia percorrida nesta viagem foi:%4.0f km.\n", distancia);
		System.out.printf("Quantidade de combust�vel utilizados nesta viagem foi:%4.3f litros.\n", litros_usados);
		System.out.printf("O valor em combust�vel gasto nesta viagem foi: R$ %4.2f.", valor_gasto_comb);
		entrada.close();
	}
}

package lista_exercicios_N1;

/*Faça um algoritmo que calcule a quantidade de litros de combustível gasta em uma
viagem, utilizando um automóvel que faz 12Km por litro. Para obter o cálculo, o usuário
deve fornecer o tempo gasto na viagem e a velocidade média durante ela. Desta forma, será
possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO *
VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros de
combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA /
AUTONOMIA. O programa deve apresentar os valores da velocidade média, tempo gasto
na viagem, a distância percorrida e a quantidade de litros utilizada na viagem.*/
import java.util.Scanner;

public class exercicio_19_consumo_combustivel {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int horas;
		int km_litro = 18;
		double distancia, litros_usados, vel_media, valor_gasto_comb;
		double preco_litro = 4.80;

		System.out.print("Usuário, informe a quantidade de horas da viagem:");
		horas = entrada.nextInt();
		System.out.print("Agora, informe a velocidade média que viajou:");
		vel_media = entrada.nextDouble();

		distancia = horas * vel_media;
		litros_usados = distancia / km_litro;
		valor_gasto_comb = litros_usados * preco_litro;

		System.out.printf("Velocidade média da viagem:%4.0f km por hora.\n", vel_media);
		System.out.printf("Tempo gasto nesta viagem foi:%d horas.\n", horas);
		System.out.printf("A distância percorrida nesta viagem foi:%4.0f km.\n", distancia);
		System.out.printf("Quantidade de combustível utilizados nesta viagem foi:%4.3f litros.\n", litros_usados);
		System.out.printf("O valor em combustível gasto nesta viagem foi: R$ %4.2f.", valor_gasto_comb);
		entrada.close();
	}
}

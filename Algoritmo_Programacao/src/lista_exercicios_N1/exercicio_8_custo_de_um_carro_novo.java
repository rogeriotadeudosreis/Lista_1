package lista_exercicios_N1;

/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo
que a percentagem do distribuidor seja de 12% do preço de fábrica e os impostos de
30% do preço de fábrica, faça um programa para ler o custo de fábrica de um carro e
imprimir o custo ao consumidor.*/
import java.util.Scanner;

public class exercicio_8_custo_de_um_carro_novo {

	public static void main(String[] argas) {

		Scanner entrada = new Scanner(System.in);
		double perc_distr = 12;
		double perc_imposto = 30;
		double custo_fabrica, custo_consumidor, imposto, distribuidor;

		System.out.print("Informe o valor de custo de fábrica:");
		custo_fabrica = entrada.nextDouble();

		distribuidor = custo_fabrica * (perc_distr / 100);
		imposto = custo_fabrica * (perc_imposto / 100);

		custo_consumidor = custo_fabrica + distribuidor + imposto;

		System.out.printf("O custo final para o consumidor será:%4.2f.", custo_consumidor);
		entrada.close();

	}
}

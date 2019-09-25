package lista_exercicios_N1;

/*Numa determinada região, o imposto sobre propriedade é calculado a partir de duas
informações:
- área total do terreno (m2).
- área construída do terreno (m2).
O imposto é cobrado da seguinte maneira:
- R$ 5,00 para cada metro quadrado construído.
- R$ 3,80 para cada metro quadrado não construído.
Faça um programa que leia a área total do terreno, a área construída do terreno, calcule e
imprima o valor total a ser pago.*/
import java.util.Scanner;

public class exercicio_20_calcular_imposto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double area_terreno, area_construida, imposto;

		System.out.print("Informe a área total do terreno:");
		area_terreno = entrada.nextDouble();
		System.out.print("Informe a área total construída:");
		area_construida = entrada.nextDouble();

		imposto = (area_construida * 5.00) + ((area_terreno - area_construida) * 3.80);

		System.out.printf("O valor do imposto a ser pago é: R$ %4.2f.", imposto);
		entrada.close();
	}
}

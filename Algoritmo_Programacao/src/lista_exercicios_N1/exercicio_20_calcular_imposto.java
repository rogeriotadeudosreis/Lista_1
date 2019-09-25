package lista_exercicios_N1;

/*Numa determinada regi�o, o imposto sobre propriedade � calculado a partir de duas
informa��es:
- �rea total do terreno (m2).
- �rea constru�da do terreno (m2).
O imposto � cobrado da seguinte maneira:
- R$ 5,00 para cada metro quadrado constru�do.
- R$ 3,80 para cada metro quadrado n�o constru�do.
Fa�a um programa que leia a �rea total do terreno, a �rea constru�da do terreno, calcule e
imprima o valor total a ser pago.*/
import java.util.Scanner;

public class exercicio_20_calcular_imposto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double area_terreno, area_construida, imposto;

		System.out.print("Informe a �rea total do terreno:");
		area_terreno = entrada.nextDouble();
		System.out.print("Informe a �rea total constru�da:");
		area_construida = entrada.nextDouble();

		imposto = (area_construida * 5.00) + ((area_terreno - area_construida) * 3.80);

		System.out.printf("O valor do imposto a ser pago �: R$ %4.2f.", imposto);
		entrada.close();
	}
}

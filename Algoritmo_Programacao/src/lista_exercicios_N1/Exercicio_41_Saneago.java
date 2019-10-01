package lista_exercicios_N1;

import java.util.Scanner;

public class Exercicio_41_Saneago {

	public static void main(String[] args) {
		char tipo;
		double resid = 5.00;
		double comerc = 500.00;
		double indust = 800.00;
		double total = 0;
		double tarifa1 = 0.05;
		double tarifa2 = 0.25;
		double tarifa3 = 0.04;
		double cons_min2 = 80;
		double cons_min3 = 100;
		double metro_cubico;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o tipo da unidade medidora:\n\n(1) Residencia\n(2) Comercial\n(3) Industrial");
		tipo = entrada.next().charAt(0);
		System.out.println("Por favor, digite a quantidade de metros cubicos:");
		metro_cubico = entrada.nextDouble();

		if (tipo == '1') {
			total = resid + (metro_cubico * tarifa1);
		} else if (tipo == '2' && metro_cubico <= 80) {

			total = comerc;
		} else if (tipo == '2' && metro_cubico > 80) {
			total = comerc + ((metro_cubico - cons_min2) * tarifa2);

		} else if (tipo == '3' && metro_cubico <= 100) {
			total = indust;

		} else {
			total = indust + ((metro_cubico - cons_min3) * tarifa3);
		}

		System.out.printf("Total a pagar: R$ %.2f\n", total);

		entrada.close();
	}
}

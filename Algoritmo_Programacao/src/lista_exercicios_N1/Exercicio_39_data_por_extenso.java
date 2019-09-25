package lista_exercicios_N1;

/*Faça um programa que leia uma data (dia, mês e ano, em uma variável inteira cada), e
escreva a mesma data no formato dia de (mês por extenso) de ano.*/

import java.util.Scanner;

public class Exercicio_39_data_por_extenso {

	public static void main(String[] args) {

		int dia, mes, ano, aux;
		String mes_ext;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia:");
		dia = entrada.nextInt();
		System.out.println("Digite o Mês:");
		mes = entrada.nextInt();
		System.out.println("Digite o ano:");
		ano = entrada.nextInt();

		if ((mes == 1) && (dia <= 31)) {
			mes_ext = "janeiro";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else if ((mes == 2) && (dia <= 28)) {
			mes_ext = "Fevereiro";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else if ((mes == 3) && (dia <= 31)) {
			mes_ext = "Março";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else if ((mes == 4) && (dia <= 30)) {
			mes_ext = "Abril";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else if ((mes == 5) && (dia <= 31)) {
			mes_ext = "Maio";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else if ((mes == 6) && (dia <= 30)) {
			mes_ext = "Junho";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else if ((mes == 7) && (dia <= 31)) {
			mes_ext = "Julho";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else if ((mes == 8) && (dia <= 31)) {
			mes_ext = "Agosto";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else if ((mes == 9) && (dia <= 30)) {
			mes_ext = "Setembro";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else if ((mes == 10) && (dia <= 31)) {
			mes_ext = "Outubro";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else if ((mes == 11) && (dia <= 30)) {
			mes_ext = "Novembro";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		} else {
			mes_ext = "Dezembro";
			System.out.printf("%d de %s de %d.", dia, mes_ext, ano);
		}

		entrada.close();
	}
}

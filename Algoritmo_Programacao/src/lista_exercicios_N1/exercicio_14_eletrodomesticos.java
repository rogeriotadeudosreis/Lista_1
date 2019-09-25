package lista_exercicios_N1;

/*Numa certa loja de eletrodom�sticos, o comerci�rio encarregado da se��o de televisores
recebe, mensalmente, um sal�rio fixo (que representa 2*salarioMinimo) mais a
comiss�o. Essa comiss�o � calculada em rela��o ao n�mero de televisores vendidos por
m�s de cada um dos tipos de TV, obedecendo as seguintes especifica��es:
TV LCD R$ 50,00 de comiss�o por unidade vendida
TV LED R$ 60,00 de comiss�o por unidade vendida
TV Plasma R$ 75,00 de comiss�o por unidade vendida
Sabendo que o sal�rio total � calculado a partir do sal�rio fixo + a comiss�o, escreva um
programa que calcule e escreva o sal�rio final do empregado, considerando que o usu�rio vai
informar a quantidade de TVs vendidas de cada tipo e o sal�rio m�nimo atual.*/
import java.util.Scanner;

public class exercicio_14_eletrodomesticos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String vendedor;
		int quant_LCD, quant_LED, quant_Plasma;
		double sal_minimo;
		double sal_final;

		System.out.print("Informe o nome do vendedor:");
		vendedor = entrada.nextLine();
		System.out.print("Usu�rio, informe o sal�rio m�nimo atual:");
		sal_minimo = entrada.nextDouble();
		System.out.print("Usu�rio, informe a quantidade de LCD vendidas:");
		quant_LCD = entrada.nextInt();
		System.out.print("Usu�rio, informe a quantidade de LED vendidas:");
		quant_LED = entrada.nextInt();
		System.out.print("Usu�rio, informe a quantidade de Plasma vendidas:");
		quant_Plasma = entrada.nextInt();

		sal_final = (2 * sal_minimo) + (quant_LCD * 50.00) + (quant_LED * 60.00) + (quant_Plasma * 75.00);

		System.out.printf("O sal�rio final do vendedor %s, � R$ %4.2f.", vendedor, sal_final);
		entrada.close();
	}
}

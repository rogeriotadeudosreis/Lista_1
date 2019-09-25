package lista_exercicios_N1;

/*Numa certa loja de eletrodomésticos, o comerciário encarregado da seção de televisores
recebe, mensalmente, um salário fixo (que representa 2*salarioMinimo) mais a
comissão. Essa comissão é calculada em relação ao número de televisores vendidos por
mês de cada um dos tipos de TV, obedecendo as seguintes especificações:
TV LCD R$ 50,00 de comissão por unidade vendida
TV LED R$ 60,00 de comissão por unidade vendida
TV Plasma R$ 75,00 de comissão por unidade vendida
Sabendo que o salário total é calculado a partir do salário fixo + a comissão, escreva um
programa que calcule e escreva o salário final do empregado, considerando que o usuário vai
informar a quantidade de TVs vendidas de cada tipo e o salário mínimo atual.*/
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
		System.out.print("Usuário, informe o salário mínimo atual:");
		sal_minimo = entrada.nextDouble();
		System.out.print("Usuário, informe a quantidade de LCD vendidas:");
		quant_LCD = entrada.nextInt();
		System.out.print("Usuário, informe a quantidade de LED vendidas:");
		quant_LED = entrada.nextInt();
		System.out.print("Usuário, informe a quantidade de Plasma vendidas:");
		quant_Plasma = entrada.nextInt();

		sal_final = (2 * sal_minimo) + (quant_LCD * 50.00) + (quant_LED * 60.00) + (quant_Plasma * 75.00);

		System.out.printf("O salário final do vendedor %s, é R$ %4.2f.", vendedor, sal_final);
		entrada.close();
	}
}

package lista_exercicios_N1;
/*Fa�a um programa que leia o nome e sobrenome de duas pessoas (marido e esposa) e um
ano (inteiro). E exiba a seguinte mensagem: �Fulano da Silva � casado com Ciclana de
Souza h� XX anos�. Considere o ano atual como 2019.*/

import java.util.Scanner;

public class exercicio_3_leia_nome_sobrenome {

	public static void main(String[] argas) {
		Scanner entrada = new Scanner(System.in);

		String nome_marido, sobrenome_marido, nome_esposa, sobrenome_esposa;
		int ano, anos, tempo_casados;

		System.out.print("Marido, digite seu nome:");
		nome_marido = entrada.nextLine();
		System.out.print("Digite tamb�m seu sobrenome;");
		sobrenome_marido = entrada.nextLine();
		System.out.print("Esposa, digite seu nome:");
		nome_esposa = entrada.nextLine();
		System.out.print("Digite tamb�m seu sobrenome:");
		sobrenome_esposa = entrada.nextLine();
		System.out.print("Digite o ano em que casaram:");
		ano = entrada.nextInt();

		tempo_casados = 2019 - ano;
		System.out.printf("%s %s � casado com %s %s h� %d anos.", nome_marido, sobrenome_marido, nome_esposa,
				sobrenome_esposa, tempo_casados);

		entrada.close();
	}
}

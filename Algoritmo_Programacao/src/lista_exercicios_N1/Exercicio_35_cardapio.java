package lista_exercicios_N1;

/*Crie um algoritmo que exiba um card�pio com as op��es: 1: Pizza, 2: Picanha e 3: Peixe
Frito. Ao selecionar uma das op��es:1, 2 e 3 dever� exibir a mensagem: �Op��o (n�mero) :
(nome do prato), pedido realizado com sucesso�.*/

import java.util.Scanner;

public class Exercicio_35_cardapio {

	public static void main(String[] args) {

		char opcao;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a op��o desejada:");
		System.out.println("(1) Pizza\n(2) Picanha\n(3) Peixe Frito\n");
		opcao = entrada.next().charAt(0);

		switch (opcao) {

		case '1':
			System.out.println("(1) Pizza.\nPedido realizado com sucesso!.");
			break;
		case '2':
			System.out.println("(2) Picanha.\nPedido realizado com sucesso!.");
			break;
		case '3':
			System.out.println("(3) Peixe Frito.\nPedido realizado com sucesso!.");
		default: {
			System.out.println("Op��o inv�lida!.");
		}
		}

		entrada.close();
	}
}

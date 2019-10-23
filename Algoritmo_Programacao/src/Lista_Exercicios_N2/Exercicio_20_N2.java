package Lista_Exercicios_N2;

import java.util.Scanner;

public class Exercicio_20_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String login = "";
		int senha, senhaconfirmada = 0;
		int cont = 0;

		System.out.println("Digite seu login:");
		login = teclado.nextLine();
		System.out.println("Digite sua senha:");
		senha = teclado.nextInt();
		System.out.println("Confirme sua senha:");
		senhaconfirmada = teclado.nextInt();

		if (senha == senhaconfirmada) {
			System.out.println("BEM-VINDO AO SISTEMA.");

		} else {
			do {
				System.out.println("SENHA INCORRETA, tente novamente:");
				System.out.println("Confirme sua senha:");
				senhaconfirmada = teclado.nextInt();

				if (senha == senhaconfirmada) {
					System.out.println("BEM-VINDO AO SISTEMA.");
					break;
				}
				cont++;

			} while (cont < 2);
			
			if (senha != senhaconfirmada) {
				System.out.println("“ACESSO BLOQUEADO, PROCURE UM MODERADOR!”.");
			}

		}
		teclado.close();
	}
}

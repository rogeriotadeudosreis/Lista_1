package Lista_Exercicios_N2;

import java.util.Scanner;

public class Exercicio_20_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String login = "";
		int senha, senhaconfirmada = 0;
		int cont = 0;
		int tentativas = 3;
		

		System.out.println("Digite seu login:");
		login = teclado.nextLine();
		System.out.println("Digite sua senha:");
		senha = teclado.nextInt();
		System.out.println("Confirme sua senha:");
		senhaconfirmada = teclado.nextInt();

		do {
			if (senhaconfirmada == senha) {
				System.out.println("BEM-VINDO AO SISTEMA.");
				break;
			} else {
				System.out.printf("SENHA INCORRETA, após %d tentativas sua senha será bloqueada\n", tentativas);
				System.out.println("");
				System.out.printf("Confirme sua senha: (%da- tentativa)\n", cont+1);
				senhaconfirmada = teclado.nextInt();
				cont++; 
			}

		} while (cont < tentativas || senhaconfirmada == senha);

		if (senhaconfirmada != senha) {
			System.out.printf("“DESCULPE, SENHA BLOQUEADA APÓS A %da TENTATIVA, PROCURE UM MODERADOR!”.", tentativas);
		}
		teclado.close();
	}
}

package lista_exercicios_N1;

import java.util.Scanner;

public class Exercicio_29_maior_ou_menor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nome;
		int idade, menor, maior;

		System.out.println("Digite seu nome:");
		nome = entrada.nextLine();
		System.out.println(nome + ", digite sua idade:");
		idade = entrada.nextInt();

		if (idade == 0) {
			System.out.println("Idade informada inv�lida.");
		}
		 if (idade >= 18 && idade < 65) {
			System.out.printf(nome + ", tem %d anos de idade, portanto � adulto.", idade);
		} else if (idade >= 65) {
			System.out.printf(nome + ", tem %d anos de idade, portanto � idoso.", idade);
		} else if (idade >=12 && idade <18) {
			System.out.printf(nome + ", tem %d anos de idade, portanto � de menor.", idade);			
		}else {
			System.out.printf(nome + ", tem %d anos de idade, portanto � crian�a.", idade);
		}
		entrada.close();
	}

}

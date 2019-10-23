package Lista_Exercicios_N2;

/*19. Faça um programa que receba 2 notas (valide as notas, onde 0.0 ≤ nota ≤ 10) de
um número indeterminado de alunos. Calcule e mostre:
a. A média aritmética das 2 notas lidas;
b. Uma mensagem de acordo com as regras: Até 3 (Reprovado); Entre 3 e 7
(Exame); de 7 para cima (Aprovado);
c. O total de alunos;
d. Quantidade de alunos Aprovados, Reprovados e de Exame.
e. A Média da classe.*/

import java.util.Scanner;

public class Exercicio_19_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double nota1 = 0, nota2 = 0;
		int cont = 0;
		int quantaprovados = 0, quantreprovados = 0, quantexame = 0;
		double soma = 0, media = 0;
		char resp = 'S';

		do {

			System.out.printf("Digite a primeira nota do %d aluno:", cont+1);
			nota1 = teclado.nextDouble();
			while (nota1 < 0 || nota1 > 10) {
				System.out.println("Nota inválida!");
				System.out.printf("Digite a primeira nota do aluno:");
				nota1 = teclado.nextDouble();

			}

			System.out.printf("Digite a segunda nota do aluno:");
			nota2 = teclado.nextDouble();
			while (nota2 < 0 || nota2 > 10) {
				System.out.println("Nota inválida!");
				System.out.printf("Digite a segunda nota do aluno:");
				nota2 = teclado.nextDouble();

			}

			media = (nota1 + nota2) / 2;
			System.out.printf("A média aritmética das 2 notas lidas é: %.2f\n", media);
			
			if ( media <=3) {
				quantreprovados++;
				System.out.println("REPROVADO");
						
			}else if (media >3 && media <=7) {
				quantexame++;
				System.out.println("EXAME");
				
			}else {
				quantaprovados++;
				System.out.println("APROVADO");
			}

			cont++;
			System.out.println("---------------------------------------------");
			System.out.println("Deseja continuar ?");
			resp = teclado.next().charAt(0);
			
		} while (resp == 'S' || resp == 's');
		
		System.out.printf("Total de alunos: %d\n", cont);
		System.out.printf("Quantidade de alunos REPROVADOS: %d\n", quantreprovados);
		System.out.printf("Quantidade de alunos de EXAME: %d\n", quantexame);
		System.out.printf("Quantidade de alunos APROVADOS: %d\n", quantaprovados);

	
		
	
		
		
		
		
		
		
		teclado.close();
	}
}

package lista_exercicios_N1;

/*Ler dois valores inteiros para as vari�veis A e B, efetuar a troca dos valores de modo que a
vari�vel A passe a possuir o valor da vari�vel B, e a vari�vel B passe a possuir o valor da
vari�vel A. Apresentar os valores trocados.*/
import java.util.Scanner;

public class exercicio_18_troca_de_valores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int A, B, aux;
		System.out.print("Usu�rio, informe o valor de A:");
		A = entrada.nextInt();
		System.out.print("Agora, informe o valor de B:");
		B = entrada.nextInt();
		
		aux = A;
		A = B;
		B = aux;
		
		System.out.printf("O valor de A �:%d.\n", A);
		System.out.printf("O valor de B �:%d.", B);
		entrada.close();
	}
}

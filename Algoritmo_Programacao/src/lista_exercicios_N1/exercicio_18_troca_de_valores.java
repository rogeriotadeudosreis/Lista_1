package lista_exercicios_N1;

/*Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a
variável A passe a possuir o valor da variável B, e a variável B passe a possuir o valor da
variável A. Apresentar os valores trocados.*/
import java.util.Scanner;

public class exercicio_18_troca_de_valores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int A, B, aux;
		System.out.print("Usuário, informe o valor de A:");
		A = entrada.nextInt();
		System.out.print("Agora, informe o valor de B:");
		B = entrada.nextInt();
		
		aux = A;
		A = B;
		B = aux;
		
		System.out.printf("O valor de A é:%d.\n", A);
		System.out.printf("O valor de B é:%d.", B);
		entrada.close();
	}
}

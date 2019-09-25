package lista_exercicios_N1;

/*Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A
fórmula de conversão de temperatura a ser utilizada é C = (F – 32) * 5 / 9, em que a
variável F é a temperatura em graus Fahrenheit e a variável C é a temperatura em graus
Celsius.*/
import java.util.Scanner;

public class exercicio_10_conversao_temperatura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double C, F;

		System.out.print("Usuário, informe a temperatura em F:");
		F = entrada.nextDouble();

		C = (F - 32) * 5 / 9;
		System.out.printf("A temperatura convertidade de F para C é:%4.2f.", C);
		entrada.close();

	}
}

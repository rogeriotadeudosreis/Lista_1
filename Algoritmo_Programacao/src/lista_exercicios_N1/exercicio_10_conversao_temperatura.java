package lista_exercicios_N1;

/*Ler uma temperatura em graus Fahrenheit e apresent�-la convertida em graus Celsius. A
f�rmula de convers�o de temperatura a ser utilizada � C = (F � 32) * 5 / 9, em que a
vari�vel F � a temperatura em graus Fahrenheit e a vari�vel C � a temperatura em graus
Celsius.*/
import java.util.Scanner;

public class exercicio_10_conversao_temperatura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double C, F;

		System.out.print("Usu�rio, informe a temperatura em F:");
		F = entrada.nextDouble();

		C = (F - 32) * 5 / 9;
		System.out.printf("A temperatura convertidade de F para C �:%4.2f.", C);
		entrada.close();

	}
}

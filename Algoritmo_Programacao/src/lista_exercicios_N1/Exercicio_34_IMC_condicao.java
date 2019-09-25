package lista_exercicios_N1;

/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde
para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC =
peso / (altura)2
Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua
condição.*/
import java.util.Scanner;

public class Exercicio_34_IMC_condicao {

	public static void main(String[] aregs) {

		float peso, altura, imc;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu peso:");
		peso = entrada.nextFloat();
		System.out.println("Agora digite sua altura:");
		altura = entrada.nextFloat();
		imc = (float) (peso / Math.pow(altura, 2.0));

		if (imc > 30) {
			System.out.printf("Você está com %4.1f kilos, portanto está obeso.", imc);
		} else if (imc >= 25) {
			System.out.printf("Você está com %4.1f kilos, portanto está acima do peso.", imc);
		} else if (imc >= 18.5) {
			System.out.printf("Você está com %4.1f kilos, portanto está com o peso normal.", imc);
		} else {
			System.out.printf("Você está com %4.1f kilos, portanto está abaixo do peso.", imc);
		}

		entrada.close();
	}
}

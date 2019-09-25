package lista_exercicios_N1;

/*O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de
para dar uma indica��o sobre a condi��o de peso de uma pessoa adulta. A f�rmula � IMC =
peso / (altura)2
Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua
condi��o.*/
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
			System.out.printf("Voc� est� com %4.1f kilos, portanto est� obeso.", imc);
		} else if (imc >= 25) {
			System.out.printf("Voc� est� com %4.1f kilos, portanto est� acima do peso.", imc);
		} else if (imc >= 18.5) {
			System.out.printf("Voc� est� com %4.1f kilos, portanto est� com o peso normal.", imc);
		} else {
			System.out.printf("Voc� est� com %4.1f kilos, portanto est� abaixo do peso.", imc);
		}

		entrada.close();
	}
}

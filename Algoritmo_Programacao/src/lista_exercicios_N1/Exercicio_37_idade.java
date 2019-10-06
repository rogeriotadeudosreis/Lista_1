package lista_exercicios_N1;

/*Construa um programa que receba a idade de uma pessoa e classifique-a seguindo o
crit�rio apresentado a seguir. Considere a idade � um valor inteiro e que ser� informada de
forma v�lida.*/

import java.util.Scanner;
public class Exercicio_37_idade {

	public static void main (String[]args) {
		 int idade;
		 
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Usu�rio, informe a idade:");
		 idade = entrada.nextInt();
		 
		 if (idade >0 ) {
			 if (idade <=2){
				 System.out.println(idade + "ano(s) de idade, � um Rec�m-nascido." );
				 
			 }else if (idade >=3 && idade <12) {
				 System.out.println(idade + "ano(s) de idade, � uma Crian�a." );
			 }else if (idade >=12 && idade <20) {
				 System.out.println(idade + "ano(s) de idade, � um Adolescente." );
			 }else if (idade >=20 && idade <56) {
				 System.out.println(idade + "ano(s) de idade, � um Adulto." );
			 }else  {
				 System.out.println(idade + "ano(s) de idade, � um Idoso." );
			 }
		 }
		 else {
			 System.out.println("Idade inv�lida.");
		 }
		
		entrada.close();
	}
}

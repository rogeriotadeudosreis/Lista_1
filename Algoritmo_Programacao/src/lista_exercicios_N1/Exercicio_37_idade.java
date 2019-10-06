package lista_exercicios_N1;

/*Construa um programa que receba a idade de uma pessoa e classifique-a seguindo o
critério apresentado a seguir. Considere a idade é um valor inteiro e que será informada de
forma válida.*/

import java.util.Scanner;
public class Exercicio_37_idade {

	public static void main (String[]args) {
		 int idade;
		 
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Usuário, informe a idade:");
		 idade = entrada.nextInt();
		 
		 if (idade >0 ) {
			 if (idade <=2){
				 System.out.println(idade + "ano(s) de idade, é um Recém-nascido." );
				 
			 }else if (idade >=3 && idade <12) {
				 System.out.println(idade + "ano(s) de idade, é uma Criança." );
			 }else if (idade >=12 && idade <20) {
				 System.out.println(idade + "ano(s) de idade, é um Adolescente." );
			 }else if (idade >=20 && idade <56) {
				 System.out.println(idade + "ano(s) de idade, é um Adulto." );
			 }else  {
				 System.out.println(idade + "ano(s) de idade, é um Idoso." );
			 }
		 }
		 else {
			 System.out.println("Idade inválida.");
		 }
		
		entrada.close();
	}
}

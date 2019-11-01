package Lista_Exercicios_N2;

import java.util.Random;
public class Exercicio_47_feito_em_classe_pelo_prof {
	public static void main(String[] args) {
		
			int tamanho = 10;
		int[] vetor1 = new int[tamanho];
		int[] vetor2 = new int[tamanho];
		int[] vetorIntercalacao = new int[vetor1.length + vetor2.length];
		int j, k;
		
		for(int i = 0; i < vetor1.length; i++)
		{
//			System.out.printf("Informe o valor do Vetor1[ %d ]: " , i);
//			vetor1[i] = entrada.nextInt();
			vetor1[i] = sorteia(1, 50);
		}
		
		for(int i = 0; i < vetor2.length; i++)
		{
//			System.out.printf("Informe o valor do Vetor2[ %d ]: " , i);
//			vetor2[i] = entrada.nextInt();
			vetor2[i] = sorteia(1, 50);
		}
		
		 j = 0; //indice para controlar o vetor1
		 k = 0; //indice para controlar o vetor2
		for(int i = 0 ; i < vetorIntercalacao.length; i++)
		{
			if( i % 2 == 0) //filtra posicoes pares
			{
				vetorIntercalacao[i] = vetor1[j];
				j++;
			}
			else{ //filtra posicoes impares
				vetorIntercalacao[i] = vetor2[k];
				k++;
			}
		}
		
		System.out.println("Vetor1:");
		imprimeVetor(vetor1);
		
		System.out.println("\n\nVetor2:");
		imprimeVetor(vetor2);
		
		System.out.println("\n\nVetorIntercalacao:");
		imprimeVetor(vetorIntercalacao);
	}
	
	public static int sorteia(int limiteInferior, int limiteSuperior)
	{
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
	
	public static void imprimeVetor(int[] vetor)
	{
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.print(vetor[i] + "  ");
		}
	}
}

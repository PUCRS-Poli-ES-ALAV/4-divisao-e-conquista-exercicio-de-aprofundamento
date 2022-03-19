package br.pucrs;

import java.util.Locale;

import br.pucrs.sorts.Sorts;
import br.pucrs.util.ContagemRes;

public class Demo {

	private static int ELEMENTOS = 100_000;
	private static int ITERACOES = 5;

	public static void exibe(long[] v, long limite){
		for (int i = 1; i <= v.length; i++)
			if (i % limite == 0)
				System.out.println(v[i-1] + " ");
			else
				System.out.print(v[i-1] + " ");
		System.out.println("");
	}

	public static void exibe(double[] v, int limite){
		for (int i = 1; i <= v.length; i++)
			if (i % limite == 0)
				System.out.println(v[i-1] + " ");
			else
				System.out.print(v[i-1] + " ");

		System.out.println("\n");
	}

	public static void iteraTestes(int SORT_LIM, int TAM_VETOR) {

		Sorts srt = new Sorts();
		long [] vet, vetAux;

		long [] resIterMerge = new long[SORT_LIM];
		long [] resIterBubble0 = new long[SORT_LIM];

		long [] resInstrMerge = new long[SORT_LIM];
		long [] resInstrBubble0 = new long[SORT_LIM];

		double [] resClockMerge = new double[SORT_LIM];
		double [] resClockBubble0 = new double[SORT_LIM];

		ContagemRes sResMerge, sResBubble0;
		int pos;

		System.out.println("Iniciando!");
		for (pos = 0; pos < SORT_LIM; pos ++) {
			System.out.print("#");
			vet = srt.geraVetor(TAM_VETOR, TAM_VETOR / 2);
			vetAux = srt.geraVetorInv(TAM_VETOR);

			sResMerge = srt.mergeSort(vet);
			System.out.print(".");
			sResBubble0 = srt.bubbleSort0(vet);
			System.out.print(".");

			resIterMerge[pos] = sResMerge.getIteracoes();
			resIterBubble0[pos] = sResBubble0.getIteracoes();

			resInstrMerge[pos] = sResMerge.getInstrucoes();
			resInstrBubble0[pos] = sResBubble0.getInstrucoes();

			resClockMerge[pos] = sResMerge.getTime();
			resClockBubble0[pos] = sResBubble0.getTime();
		}

		System.out.println("\nFeito!");

		System.out.println("\nBubble Sort - Dois laços fixos");
		System.out.println("Nro iter pela classe complexidade - n ^ 2: " +
				TAM_VETOR * TAM_VETOR);
		System.out.println("Nro iteracoes:");
		exibe(resIterBubble0, 20);
		System.out.println("Nro instrucoes:");
		exibe(resInstrMerge, 20);
		System.out.println("Tempo em segundos:");
		exibe(resClockBubble0, 20);

		System.out.println("\nMerge Sort");
		System.out.println("Nro iter pela classe complexidade - Melhor Caso - n log n: " +
				TAM_VETOR * (Math.log10(TAM_VETOR)/Math.log10(2)) +
				"\nNro iter pela classe complexidade - Pior Caso - n log n: " +
				TAM_VETOR * (Math.log10(TAM_VETOR)/Math.log10(2)));
		System.out.println("Nro iteracoes:");
		exibe(resIterMerge, 20);
		System.out.println("Nro instrucoes:");
		exibe(resInstrMerge, 20);
		System.out.println("Tempo em segundos:");
		exibe(resClockMerge, 20);
	}

	public static void main(String argc[]) {

		ITERACOES = 1;
		ELEMENTOS = 32;
		System.out.printf(Locale.FRANCE,"********* Nro de Iterações - %,8d execuções de %,8d elementos \n", ITERACOES, ELEMENTOS);
		iteraTestes(ITERACOES, ELEMENTOS);

		ITERACOES = 1;
		ELEMENTOS = 2_048;
		System.out.printf(Locale.FRANCE,"********* Nro de Iterações - %,8d execuções de %,8d elementos \n", ITERACOES, ELEMENTOS);
		iteraTestes(ITERACOES, ELEMENTOS);

		ITERACOES = 1;
		ELEMENTOS = 1_048_576;
		System.out.printf(Locale.US,"********* Nro de Iterações - %,8d execuções de %,8d elementos \n", ITERACOES, ELEMENTOS);
		iteraTestes(ITERACOES, ELEMENTOS);
	}
}

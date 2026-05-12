package pctMatrizes04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner receba = new Scanner(System.in);
		int linhas = 3;
		int colunas = 3;

		int[][] matriz = new int[linhas][colunas];
		int i, j;

		System.out.println("INSERÇÃO NA MATRIZ");

		for (i = 0; i < linhas; i++) {
			for (j = 0; j < colunas; j++) {
				System.out.println("Digite um valor para a matriz [" + i + "][" + j + "]:");
				matriz[i][j] = receba.nextInt();
			}
		}

		System.out.println("IMPRESSÃO NA MATRIZ");

		for (i = 0; i < linhas; i++) {
			for (j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		receba.close();
	}
}
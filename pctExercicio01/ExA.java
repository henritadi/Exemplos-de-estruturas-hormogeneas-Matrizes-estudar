package pctExercicio01;

import java.util.Scanner;

public class ExA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner receba = new Scanner(System.in);
		int linhas = 3;
		int colunas = 3;
		
		int[][] matriz = new int[linhas][colunas];
		int i, j;

		
		String[][] Clientes = new String[3][3];
		Clientes[0][0] = "123.456.789-01" ;
		Clientes[0][1] = "Rua das Flores, 123";
		Clientes[1][0] = "Maria";
		Clientes[1][1] = "Avenida dos Anjos, 456";
		Clientes[2][0] = "Pedro";
		Clientes[2][1] = "Praça da Liberdade, 789";
		
		System.out.println("Digite valor nas matrizes");
		Clientes[0][0] = receba.nextLine();
	
		for (i = 0; i < linhas; i++) {
			for (j = 0; j < colunas; j++) {
				System.out.println("Digite um valor para a matriz [" + i + "][" + j + "]:");
				matriz[i][j] = receba.nextInt();

	}
			System.out.println("Voce inseriu os numeros na matrizes");
	}
	}
}
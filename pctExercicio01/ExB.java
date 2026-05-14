package pctExercicio01;

import java.util.Scanner;

public class ExB {

	public static void main(String[] args) {

		Scanner receba = new Scanner(System.in);

		String[][] cliente = new String[1][2];

		System.out.print("Digite o CPF: ");
		cliente[0][0] = receba.nextLine();

		System.out.print("Digite o telefone: ");
		cliente[0][1] = receba.nextLine();

		System.out.println("CADASTRADOS");

		System.out.println("CPF: " + cliente[0][0]);
		System.out.println("Telefone: " + cliente[0][1]);

		receba.close();
	}
}
package pctExercicio05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner (System.in);
		
		int[] numeros = new int[5];
		
		for(int i=0; i < numeros.length; i++) {
			
			System.out.println("digite um numero inteiro");
			numeros[i]=receba.nextInt();
			
			
		}
		for(int i=0; i<numeros.length;i++) {
			System.out.println("hospede no quarto "+i+ " = " + numeros[i]);
		}
		

	}

}

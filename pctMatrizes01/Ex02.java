package pctMatrizes01;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] Clientes = new String[3][3];
		Clientes[0][0] = "João Roberto";
		Clientes[0][1] = "Rua das Flores";
		Clientes[0][2] = "Cerejeira";
		Clientes[1][0] = "Maria Silva";
		Clientes[1][1] = "Avenida dos anjos, n 01";
		Clientes[1][2] = "Cidade Alta";
		Clientes[2][0] = "Pedro Amaro";
		Clientes[2][1] = "Rua da Liberdade";
		Clientes[2][2] = "Praça 67";
		
		//Aqui vamos imprimir os clientes:
		for(int lin = 0; lin <4; lin++) {
		System.out.println("Nome:" + Clientes[lin][0]);
		System.out.println("Endereço :"+Clientes[lin][1]);
		System.out.println("Bairro:"+Clientes[lin][2]);
		System.out.println(" ");

	}
	}


}

package pctMatrizes03;

public class Ex03 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        System.out.println("Matriz normal:");

        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + matriz[lin][col]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz ao contrário:");

        for (int lin = 2; lin >= 0; lin--) {
            for (int col = 2; col >= 0; col--) {
                System.out.print(" " + matriz[lin][col]);
            }
            System.out.println();
        }
    }
}
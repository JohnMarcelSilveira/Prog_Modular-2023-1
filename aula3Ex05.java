import java.util.Random;
import java.util.Scanner;

public class aula3Ex05 {

    static Scanner in = new Scanner(System.in);

    public static void lerMatriz(int mat[][]) {
        // System.out.println("digite a matriz");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                Random gerador = new Random();
                mat[i][j] = gerador.nextInt(30);
            }
            System.out.println();
        }
    }

    public static void imprimeMatriz(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int matriz[][], aux;
        matriz = new int[6][6];

        lerMatriz(matriz);
        System.out.println("Matriz");
        imprimeMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j % 2 == 0) {
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[i][j + 1];
                    matriz[i][j + 1] = aux;
                }
            }
        }

        System.out.println("Matriz trocada");
        imprimeMatriz(matriz);

    }
}
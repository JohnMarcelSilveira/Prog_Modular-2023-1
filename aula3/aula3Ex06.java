package aula3;

/*
 * Exercício 6
• Faça um programa que leia as dimensões de duas matrizes A e B, e
depois leia as duas matrizes.
• Se as matrizes forem de tamanhos compatíveis para multiplicação,
crie a matriz R resultante da multiplicação de A por B.
• Imprima na tela as matrizes A, B e R.
 * 
 */
import java.util.Scanner;

public class aula3Ex06 {

    static Scanner in = new Scanner(System.in);

    public static void lerMatriz(int mat[][]) {
        System.out.println("digite a matriz");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                // Random gerador = new Random();
                // mat[i][j] = gerador.nextInt(30);
                mat[i][j] = in.nextInt();
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

        int A[][], B[][], R[][], l, c, lin, col;

        System.out.println("digite o numero de linhas e de colunas da primeira matriz");
        l = in.nextInt();
        c = in.nextInt();

        System.out.println("digite o numero de linhas e de colunas da segunda matriz");
        lin = in.nextInt();
        col = in.nextInt();

        if (l == col) {

            A = new int[l][c];
            B = new int[lin][col];
            R = new int[l][col];

            lerMatriz(A);
            lerMatriz(B);

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < A[i].length; k++) {
                        R[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("Matriz A");
            imprimeMatriz(A);
            System.out.println("Matriz B");
            imprimeMatriz(B);
            System.out.println("Matriz R");
            imprimeMatriz(R);

        } else {
            System.out.println("impossivel multiplicar essas matrizes!");
        }

    }
}
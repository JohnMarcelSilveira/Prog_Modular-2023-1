/*
 * Exercício 7
• Faça um programa que leia duas matrizes quadradas A e B, de ordem
N, fornecido pelo usuário, e verifique se ambas são inversas (ou seja,
a multiplicação de A por B é a matriz identidade).

 */

import java.util.Scanner;

public class aula3Ex07 {

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

        int n, A[][], B[][], I[][];

        System.out.println("digite o valor de N");
        n = in.nextInt();

        A = new int[n][n];
        B = new int[n][n];
        I = new int[n][n];

        lerMatriz(A);
        lerMatriz(B);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[i].length; k++) {
                    I[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        boolean ehIdentidade = false;

        for (int i = 0; i < I.length; i++) {
            for (int j = 0; j < I[0].length; j++) {
                if (i == j && I[i][j] == 1) {
                    ehIdentidade = true;
                }
            }
        }

        if (ehIdentidade) {
            System.out.println("São inversas");
            System.out.println("matriz identidade");
            imprimeMatriz(I);
        }

        System.out.println("matriz A");
        imprimeMatriz(A);

        System.out.println("matriz B");
        imprimeMatriz(B);

    }
}
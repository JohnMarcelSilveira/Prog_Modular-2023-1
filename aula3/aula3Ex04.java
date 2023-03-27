package aula3;
/*
    Exercício 4
• Faça um programa que leia do teclado dois números inteiros L e C e
preencha uma matriz A de L linhas e C colunas.
• Crie uma matriz T que armazenará a transposta de A.
• Imprima na tela a matriz A e a matriz T 

 */

import java.util.Scanner;

public class aula3Ex04 {

    static Scanner in = new Scanner(System.in);

    public static void lerMatriz(int mat[][]) {
        System.out.println("digite a matriz");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
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

        int matriz[][], transposta[][], l, c;

        System.out.println("digite o numero de linhas e de colunas");
        l = in.nextInt();
        c = in.nextInt();

        matriz = new int[l][c];
        transposta = new int[c][l];

        lerMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz");
        imprimeMatriz(matriz);
        System.out.println("Transposta");
        imprimeMatriz(transposta);
    }
}
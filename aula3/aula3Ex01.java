package aula3;
/*Exercício 1
• Faça um programa que preencha por leitura do teclado uma matriz A
de tamanho 4 × 4.
• Em seguida, conte e escreva na tela quantos valores maiores do que
10 ela possui. */

import java.util.Scanner;

public class aula3Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat[][] = new int[4][4];
        int cont = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Digite os valores para a matriz:");
                mat[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > 10)
                    cont++;
            }
        }
        System.out.println("tem " + cont + " maiores que 10.");

    }
}

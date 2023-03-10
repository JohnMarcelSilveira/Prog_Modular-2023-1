/*
 * Exercício 5
• Escreva um programa que preencha por leitura do teclado uma matriz
6 x 6.
• Trocar os elementos das colunas pares com os elementos das colunas
ímpares subsequentes (0 e 1, 2 e 3, até 4 e 5).
• Escrever na tela a matriz antes e depois troca.
• Não usar matriz auxiliar
 * 
 */

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
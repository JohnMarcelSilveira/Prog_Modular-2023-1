/*
 * Exercício 6
• Faça um programa para ler do teclado 2 vetores, R de 5 elementos e S
de 10 elementos.
• Gere um vetor X que possua os elementos comuns a R e a S.
• Considere que no mesmo vetor não haverá números repetidos.
• Mostre na tela o vetor X.
• Exemplo:
• Se o vetor R for igual a [1, 2, 3, 4, 5] e o vetor S for [6, 7, 1, 8, 9, 10, 4, 3, 11,
12], deve-se mostrar “Vetor X = [1, 3, 4]”.
 */

import java.util.Scanner;

public class aula2Ex6 {

    public static void lerVetor(int vet[]) {
        Scanner in = new Scanner(System.in);
        for (int r = 0; r < vet.length; r++) {
            System.out.println("Digite o " + (r + 1) + "º valor:");
            vet[r] = in.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vetR[], vetS[], vetX[], atual;

        vetR = new int[5];
        vetS = new int[10];
        vetX = new int[5];
        atual = 0;

        lerVetor(vetR);
        lerVetor(vetS);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (vetR[i] == vetS[j]) {
                    vetX[atual] = vetR[i];
                    atual++;
                }
            }
        }

        for (int r = 0; r < atual; r++) {
            System.out.print(vetX[r] + " ");
        }

        System.out.println();

    }
}
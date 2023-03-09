import java.util.Scanner;

public class aula3Ex03 {

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

    public static void imprimeVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "\t");
        }
    }

    public static void main(String[] args) {

        int matriz[][] = new int[3][3];
        int soma;

        lerMatriz(matriz);

        int vetor[] = new int[3];

        for (int i = 0; i < matriz.length; i++) {           
            for (int j = 0; j < matriz[i].length; j++) {
                if(j==0){
                    vetor[0] = vetor[0] + matriz[i][0];
                }else if(j==1){
                    vetor[1] += matriz[i][1];
                }else{
                    vetor[2] += matriz[i][2];
                }
            }
        }

        System.out.println("Matriz");
        imprimeMatriz(matriz);
        System.out.println("Vetor");
        imprimeVetor(vetor);
    }
}
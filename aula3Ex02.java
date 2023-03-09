import java.util.Scanner;

public class aula3Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat[][] = new int[10][10];
        int cont = 0;

        

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i < j)
                    mat[i][j] = 2 * i + 7 * j - 2;
                else if (i == j)
                    mat[i][j] = (int) (3 * Math.pow(i, 2) - 1);
                else
                    mat[i][j] = (int) (4 * Math.pow(i, 3) + 5 * Math.pow(j, 2) + 1);
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

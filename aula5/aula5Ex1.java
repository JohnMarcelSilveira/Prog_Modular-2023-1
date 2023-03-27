package aula5;

import java.util.Scanner;

public class aula5Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String frase;

        System.out.println("Digite uma frase");
        frase = in.nextLine();

        String[] tokens = frase.split("\\s");
       
        for (int i = (tokens.length - 1); i >= 0; i--) {
            System.out.print(tokens[i] + " ");
        }       

    }
}

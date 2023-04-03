package aula6;

import java.util.Scanner;

public class aula6Ex2 {

    public static boolean isMultiple(int num1, int num2) {
        boolean multiple = false;

        if (num2 % num1 == 0)
            multiple = true;

        return multiple;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos números vamos testar?");
        int lacos = in.nextInt();

        boolean repetir =true;

        if(lacos%2 !=0){
            System.out.println("Precisamos de um número par");
            repetir = false;
        }


        while (repetir) {

            System.out.println("Digite o primeiro numero:");
            int primeiroNumero = in.nextInt();

            System.out.println("Digite o segundo numero:");
            int segundoNumero = in.nextInt();

            boolean ehMultiplo = isMultiple(primeiroNumero, segundoNumero);

            if (ehMultiplo)
                System.out.println(segundoNumero + " é multiplo de " + primeiroNumero);
            else
                System.out.println(segundoNumero + " NÃO é multiplo de " + primeiroNumero);

            lacos = lacos - 2;
            if (lacos == 0)
                repetir = false;

        }
    }
}

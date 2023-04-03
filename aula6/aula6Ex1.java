package aula6;

import java.util.Scanner;

public class aula6Ex1 {

    public static int calculaPotencia(int base, int expoente){
        int resultado = 1;

        for(int i = 0; i < expoente;i++){
            resultado = resultado*base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base");
        int base = in.nextInt();


        System.out.println("Digite o expoente");
        int expoente = in.nextInt();


        int result = calculaPotencia(base, expoente);
        System.out.println("Resultado " + result);
    }
    
}

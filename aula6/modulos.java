package aula6;
import java.util.Scanner;

public class modulos {


    public static int calculaPotencia(int base, int expoente){
        int resultado = 0;

        for(int i = 0; i < expoente;i++){
            resultado = resultado + (base*base);
        }
        return resultado;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int expoente = in.nextInt();

        int result = calculaPotencia(2, expoente);
        System.out.println(result);

    }
}
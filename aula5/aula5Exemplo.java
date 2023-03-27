package aula5;
public class aula5Exemplo {
    public static void main(String[] args) {
        boolean teste = "do".matches("(es)?");
        System.out.println(teste);

        String numeros = "1 2 3 4 5 6 7 8";
        for (int i = 0; i < 3; i++) {
            numeros = numeros.replaceFirst("\\d", "digito");
        }
        System.out.println(numeros);

        String numeros2 = "1 2 3 \t 4 5 6 7 8";
        String[] palavras = numeros2.split("\\s+");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

    }
}

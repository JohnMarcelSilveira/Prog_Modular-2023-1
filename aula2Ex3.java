public class aula2Ex3 {

    public static void main(String[] args) {
        int vet[] = { 1, 2, 3, 1, 4, 5, 5, 6, 7, 2 };

        for (int i = 0; i < vet.length; i++) {
            for (int j = i+1; j < vet.length; j++) {
                if (vet[i] == vet[j]) {
                    System.out.print(vet[i] + " ");
                    break;
                }
            }            
        }
        System.out.println();
    }
}
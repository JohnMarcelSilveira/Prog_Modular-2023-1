public class aula2Ex4 {

    public static void main(String[] args) {
        int vet[] = { 1, 1, 1, 1, 1, 2, 1, 2, 1, 3,3 }, atual = 0;
        int vet2[] = new int[vet.length];

        boolean achei = false;
        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] == vet[j]) {
                    for (int k = 0; k <= atual; k++) {
                        // preciso percorrer o vetor auxiliar e só incluir o número se não achar dentro
                        // do vetor
                        if (vet2[k] == vet[j]) {
                            achei = true;
                            break;
                        }
                    }
                    if (!achei) {
                        vet2[atual] = vet[i];
                        atual++;
                    }
                    break;
                }
            }
            achei = false;
        }
        System.out.println();

        for (int i = 0; i < atual; i++) {
            if (vet2[i] > 0)
                System.out.print(vet2[i] + " ");
        }
    }
}
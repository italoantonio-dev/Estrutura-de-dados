public class VerifyUniqueEX2 {
    public static void  main(String[] args) {
        boolean temRepetido = false;
        int[] vetor = {2, 5, 8, 9};

        for (int i = 0; i < vetor.length; i++) {

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] == vetor[i]) {
                    temRepetido = true;
                }

            }
        }
            if (temRepetido) {
                System.out.println("A lista contém números repetidos.");
            } else {
                System.out.println("Todos os elementos são únicos.");
            }




    }
}

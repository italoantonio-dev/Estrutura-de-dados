public class VerifyUnique {
    public static void main(String[] args) {
        int[] vetor = {2, 5, 8, 9};
        boolean resultado = verificarDuplicatas(vetor);


        if (resultado) {
            System.out.println("A lista contém números repetidos.");
        } else {
            System.out.println("Todos os elementos são únicos.");
        }

    }

    public static boolean verificarDuplicatas(int[] vetor) {
        boolean temRepetido = false;
        for (int i = 0; i < vetor.length; i++) {

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] == vetor[i]) {
                    temRepetido = true;
                    return true;
                }

            }

        }

        return false;
    }
}
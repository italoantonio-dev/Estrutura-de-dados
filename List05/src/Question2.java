public class Question2 {
    private int[] vetor = new int[2];
    private int tamanho = 0;

    public void adicionar(int valor) {
        if (tamanho == vetor.length) {
            redimensionar();
        }
        vetor[tamanho++] = valor;
    }

    private void redimensionar() {
        int[] novoVetor = new int[vetor.length * 2];
        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }
        vetor = novoVetor;
        System.out.println("Redimensionado para: " + vetor.length);
    }
}

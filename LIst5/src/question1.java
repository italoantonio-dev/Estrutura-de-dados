public class question1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10; array[1] = 20; array[2] = 30;
        int n = 3;
        int indiceDestino = 1;
        int novoValor = 15;
        for (int i = n; i > indiceDestino; i--) {
            array[i] = array[i - 1];
        }
        array[indiceDestino] = novoValor;
        n++;
        for (int i = 0; i < n; i++) System.out.print(array[i] + " ");
    }
}
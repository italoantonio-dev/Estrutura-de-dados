public class Question3 {
    public static int removerElemento(int[] arr, int n, int valor) {
        int indice = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == valor) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            for (int i = indice; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            return n - 1;
        }
        return n;
    }
}

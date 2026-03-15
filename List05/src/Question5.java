public class Question5 {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] resultado = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                resultado[k++] = arr1[i++];
            } else {
                resultado[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) resultado[k++] = arr1[i++];

        while (j < arr2.length) resultado[k++] = arr2[j++];

        return resultado;
        }
}

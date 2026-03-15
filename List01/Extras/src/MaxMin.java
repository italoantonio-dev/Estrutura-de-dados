public class MaxMin {
    public static void main(String[] args) {
        int[] numeros = {15, 3, 9, 27, 10, 2};

        int maior;
        int menor;

        for (int i=0; i<numeros.length; i++){;

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if ( numeros[i] < menor) {
                menor = numeros[i];
            }


        }



        System.out.println("Maior menor");
        System.out.println(" ");
    }
}
public class GradeCounter {

    public static void main(String[] args) {

        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};
        double mediaFinal = calcularMedia(notas);

        int acimaMedia = contarAcimaMedia(mediaFinal, notas);
        double maiorNota = encontrarMaiorNota(notas);
        System.out.println("Media da turma: " + mediaFinal);
        System.out.println("Alunos acima da media: " + acimaMedia);
        System.out.println("A maior nota encontrada foi: " + maiorNota);

    }
        public static double calcularMedia ( double[] notas){
            double soma = 0;
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            double media = soma / notas.length;
            return media;
        }

        public static int contarAcimaMedia ( double media, double[] notas){
            int contador = 0;
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] > media) {
                    contador++;

                }
            }

            return contador;
        }

        public static double encontrarMaiorNota ( double[] notas){
            double maiorNota = notas[0];
            for (int i = 0; i < notas.length; i++) {

                if (notas[i] > maiorNota) {
                    maiorNota = notas[i];
                }
            }

            return maiorNota;
        }





}
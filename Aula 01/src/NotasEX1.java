public class NotasEX1 {

    public static void main(String[] args){

        double [] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

        double soma = 0;


        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;

        int contador = 0;
        double maiorNota = notas[0];
        for  (int i = 0; i < notas.length; i++){
            if (notas[i] > media) {
                contador++;
            }

            if (notas[i] > maiorNota){
                maiorNota = notas[i];
            }



        }
        System.out.println("Media da turma: " + media);
        System.out.println("Alunos acima da media: " + contador);
        System.out.println("A maior nota encontrada foi: " + maiorNota);






    }



       }
public class Tempo {
    public static void main(String[] args) {

        int totalSegundos = 3665;
        int[] tempo[];
        int[] resultado = converterTempo(totalSegundos);

        System.out.println(resultado[0] +  "h");
        System.out.println(resultado[1] + "min");
        System.out.println(resultado[2] + "seg");

    }
    public static int[] converterTempo(int totalSegundos) {
        int[] tempo = new int[3];
        tempo[0] = totalSegundos / 3600;
        int restoSegundos = totalSegundos % 3600;

        tempo[1] = restoSegundos / 60;
        tempo[2] = restoSegundos % 60;

        return tempo;
    }
}

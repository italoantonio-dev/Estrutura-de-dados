public class ConversorTempoEX1 {
    public static void main(String[] args) {

        int totalSegundos= 3665;

        int hora = totalSegundos / 3600;
        int restoSegundos = totalSegundos % 3600;

        int minutos = restoSegundos / 60;
        int segundos = restoSegundos % 60;
        System.out.println(hora + "h");
        System.out.println(minutos + "min");
        System.out.println(segundos + "seg");


    }
}
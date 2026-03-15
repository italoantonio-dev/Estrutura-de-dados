public class CaixaEletronicoEX2 {

    public static void main(String[] args) {

        int valorSaque = 180;


        int notas50 = valorSaque / 50;
        int resto =  valorSaque % 50;
        int notas20 = resto / 20;
        resto = resto % 20;
        int notas10 = resto / 10;
        resto = resto % 10;

        System.out.println(notas50 + " notas de R$ 50");
        System.out.println(notas20 + " notas de R$ 20");
        System.out.println(notas10 + " notas de R$ 10");
    }

}

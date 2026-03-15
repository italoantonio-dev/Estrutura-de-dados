public class CaixaEletronico {

    public static void main(String[] args) {

        int valorSaque = 180;
    int[] notas = troco(valorSaque);
        System.out.println(notas[0] + " notas de R$ 50");
        System.out.println(notas[1] + " notas de R$ 20");
        System.out.println(notas[2] + " notas de R$ 10");

    }
public static int[] troco (int valorSaque){
        int[] notas = new int[3];

        notas[0] = valorSaque / 50;
        int resto =  valorSaque % 50;
        notas[1] = resto / 20;
        resto = resto % 20;
        notas[2] = resto / 10;
        resto = resto % 10;
    return notas;
    }

}

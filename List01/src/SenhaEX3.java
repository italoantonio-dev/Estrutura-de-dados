import java.util.Scanner;

public class SenhaEX3 {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        String especial = "!@##$%¨&*()_+=-{}][/";

        boolean temTamanho = false;
        boolean temEspecial = false;

        System.out.print("Digite sua senha: ");
        String senha = leitor.nextLine();



        if (senha.length() >=8) {
            temTamanho = true;
        }
        for (int i = 0; i < senha.length(); i++) {
            char letraAtual = senha.charAt(i);

            if (especial.contains(String.valueOf(letraAtual))) {
                temEspecial = true;
            }
        }

        if (temTamanho && temEspecial) {
            System.out.println("Senha Valida!");
        } else {
            System.out.println("Senha Invalida!");
            if (!temTamanho) {
                System.out.println("--- Precisa Conter pelo menos 8 caracteres ---");
            }
            if (!temEspecial) {
                System.out.println("--- Precisa ter pelo menos 1 caracter especial---");
            }
        }



    }
}
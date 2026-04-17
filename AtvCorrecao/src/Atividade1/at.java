package Atividade1;

import tad.Inserir;

public class at {
    public static void main(String[] args){
        Inserir insercao = new Inserir();

        // Cria um vetor com capacidade máxima para 5 elementos
        int[] lista = new int[5];

        // 'n' controla quantos elementos realmente existem no vetor
        int n = 0;

        // Inserindo os valores fora de ordem para testar
        n = insercao.inserirOrdenacaoDecrescente(lista, n, 10);
        n = insercao.inserirOrdenacaoDecrescente(lista, n, 50);
        n = insercao.inserirOrdenacaoDecrescente(lista, n, 30);
        n = insercao.inserirOrdenacaoDecrescente(lista, n, 40);

        // Imprimindo o resultado
        System.out.println("Vetor ordenado de forma decrescente:");
        for (int i = 0; i < n; i++) {
            System.out.print(lista[i] + " ");
        }
        // Saída esperada: 50 40 30 10
    }
}

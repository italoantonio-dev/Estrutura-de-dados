package tad;

public class Inserir implements InserirTAD{
    @Override
    public int inserirOrdenacaoDecrescente(int[] lista, int n, int novoValor) {
        // Prevenção: verifica se a lista já está cheia
        if (n >= lista.length) {
            System.out.println("A lista está cheia! Não é possível inserir " + novoValor);
            return n;
        }

        int i = 0;

        // 1. Procura a posição de inserção para ordem DECRESCENTE
        // Continua avançando enquanto o valor atual for MAIOR que o novoValor
        while (i < n && lista[i] > novoValor) {
            i++;
        }

        // 2. Desloca os elementos para a DIREITA para abrir espaço
        // Tem que ser de trás pra frente (j--) para não sobrescrever os dados
        for (int j = n; j > i; j--) {
            lista[j] = lista[j - 1];
        }

        // 3. Insere o novo valor na posição correta
        lista[i] = novoValor;

        // 4. Retorna o novo tamanho lógico da lista
        return n + 1;
    }
}

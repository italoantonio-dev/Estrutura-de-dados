

TAD - Inserção em Ordem Decrescente Este projeto implementa um Tipo Abstrato de Dados (TAD) em Java para gerenciar a inserção de elementos em vetores estáticos (arrays), garantindo que a lista permaneça sempre organizada em ordem decrescente.

🚀 O que o código faz A lógica principal está concentrada na operação de inserção, que segue três etapas fundamentais para manter a integridade dos dados:

Busca de Posição: O algoritmo percorre o vetor para encontrar o índice exato onde o novo valor deve ser inserido para manter a sequência do maior para o menor.

Deslocamento (Shifting): Uma vez encontrada a posição, o código desloca todos os elementos subsequentes uma casa para a direita. Isso "abre espaço" no array sem perder os dados existentes.

Inserção e Controle: O novo valor é armazenado na posição vaga e o método retorna o novo tamanho lógico (n) do vetor, facilitando o controle em loops externos.

📂 Estrutura do Projeto O código está dividido em três partes para seguir as boas práticas de orientação a objetos:

InserirTAD (Interface): Define o contrato do método, estabelecendo quais parâmetros são necessários (o array, o tamanho atual e o novo valor).

Inserir (Implementação): Contém a lógica algorítmica de busca, deslocamento e atribuição.

at (Main): Classe de teste onde o vetor é instanciado e as inserções são validadas.

🛠️ Tecnologias Utilizadas Linguagem: Java.

Conceitos: Vetores estáticos, Interfaces, Algoritmos de ordenação por inserção e manipulação de índices.

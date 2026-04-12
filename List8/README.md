# List8 - Estrutura de Dados

Implementacao de uma playlist de musicas em Java usando vetor (array) e operacoes basicas de uma lista sequencial.

## Objetivo

Este exercicio implementa o TAD `PlaylistTAD` e sua classe concreta `MusicPlaylist`, com operacoes de insercao, remocao, busca e acesso por indice.

## Estrutura do projeto

- `src/PlaylistTAD.java`: interface com os metodos do TAD.
- `src/MusicPlaylist.java`: implementacao da playlist usando `int[]`.
- `src/Main.java`: exemplo de uso e testes simples no console.

## Metodos implementados

- `addFirst(int musicaId)`
- `addLast(int musicaId)`
- `insertAt(int i, int musicaId)`
- `removeFirst()`
- `removeLast()`
- `remove(int musicaId)`
- `removeAt(int i)`
- `get(int i)`
- `set(int i, int musicaId)`
- `find(int musicaId)`
- `isEmpty()`
- `isFull()`

## Regras importantes

- Lanca `RuntimeException` quando tenta inserir em playlist cheia.
- Lanca `RuntimeException` quando tenta remover de playlist vazia.
- Lanca `IndexOutOfBoundsException` para indices invalidos.

## Como executar

No diretorio `List8`, compile e execute:

```bash
javac -d out src/*.java
java -cp out Main
```

## Exemplo de fluxo no `Main`

1. Cria playlist com capacidade 5.
2. Adiciona musicas no inicio, fim e posicao especifica.
3. Consulta musica por indice e busca por ID.
4. Testa remocoes.
5. Mostra estado final (vazia/cheia).

# MyLinkedList – TAD Lista Dinâmica Encadeada

Implementação de uma **Lista Dinâmica Encadeada** genérica em Java, desenvolvida como atividade prática da disciplina **Estruturas de Dados I** do curso de Análise e Desenvolvimento de Sistemas – IFTM Campus Patrocínio.

---

## Estrutura do projeto

```
.
└── src/
    └── dev/
        └── aluno/
            └── datastructures/
                └── list/
                    ├── MyList.java            # Interface genérica do TAD
                    ├── MyLinkedList.java      # Implementação concreta + classe Node
                    └── tests/
                        └── MyLinkedListTests.java  # Classe de testes manuais
```

---

## Visão geral

| Arquivo | Responsabilidade |
|---|---|
| `MyList<T>` | Interface que define o contrato do TAD (inserção, remoção, consulta) |
| `MyLinkedList<T>` | Lista encadeada simples; contém a classe interna `Node<T>` |
| `MyLinkedListTests` | Suite de testes manuais que exercita todos os métodos |

### Operações implementadas

**Inserção**
- `addFirst(T)` – insere no início
- `addLast(T)` – insere no fim
- `insertAt(int, T)` – insere em posição arbitrária
- `addSorted(T)` – insere em ordem crescente (requer `Comparable<T>`)

**Remoção**
- `removeFirst()` – remove e retorna o primeiro elemento
- `removeLast()` – remove e retorna o último elemento
- `removeAt(int)` – remove e retorna o elemento em determinado índice
- `remove(T)` – remove a primeira ocorrência de um valor

**Consulta e gerenciamento**
- `find(T)` – retorna o índice da primeira ocorrência (-1 se ausente)
- `get(int)` – retorna o elemento sem removê-lo
- `set(int, T)` – substitui o elemento em determinado índice
- `size()` – retorna o número de elementos
- `clear()` – esvazia a lista

---

## Requisitos

| Ferramenta | Versão mínima |
|---|---|
| JDK | 11+ |

> Não são utilizadas bibliotecas externas nem frameworks de build.

---

## Como compilar e executar

### 1. Clonar o repositório

```bash
git clone https://github.com/<seu-usuario>/<seu-repositorio>.git
cd <seu-repositorio>
```

### 2. Compilar os fontes

```bash
mkdir -p out
javac -d out \
  src/dev/aluno/datastructures/list/MyList.java \
  src/dev/aluno/datastructures/list/MyLinkedList.java \
  src/dev/aluno/datastructures/list/tests/MyLinkedListTests.java
```

### 3. Executar os testes

```bash
java -cp out dev.aluno.datastructures.list.tests.MyLinkedListTests
```

### Saída esperada

```
========================================
   MyLinkedList – Test Suite
========================================

--- addFirst / addLast ---
  PASS  expected: [0 -> 1 -> 2 -> 3]   got: [0 -> 1 -> 2 -> 3]
  PASS  expected: 4                    got: 4
...
========================================
   All tests completed.
========================================
```

Todos os casos de teste devem exibir `PASS`.

---

## Autor

Desenvolvido por **\<seu nome\>** – IFTM Campus Patrocínio  
Disciplina: Estruturas de Dados I – [1º Semestre 2026]

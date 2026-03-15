# List 02 — Data Structures

---

## 🇧🇷 Português

### Informações Acadêmicas

| Campo | Informação |
|---|---|
| **Instituição** | IFTM — Instituto Federal do Triângulo Mineiro |
| **Curso** | Tecnologia em Análise e Desenvolvimento de Sistemas |
| **Período** | 3º Período |
| **Disciplina** | Estrutura de Dados |
| **Professor** | Junio Moreira |
| **Autor** | Italo Antonio Costa Felisbino |
| **Data** | Fevereiro de 2026 |

---

### Descrição

Esta aula aprofunda o trabalho com **vetores** em Java, explorando algoritmos de conversão numérica e a técnica de **laços aninhados** (*nested loops*) para análise de elementos de um vetor, especificamente a verificação de unicidade de valores.

---

### Exercícios

#### Exercício 1 — Conversor de Tempo (`TimeConverterEX1.java`)

**Objetivo:** Dado um valor total em segundos, converter e exibir o tempo equivalente em **horas**, **minutos** e **segundos**.

**Algoritmo:**
```
horas    = totalSegundos / 3600
resto    = totalSegundos % 3600
minutos  = resto / 60
segundos = resto % 60
```

**Conceitos abordados:**
- Operadores de divisão inteira (`/`) e módulo (`%`)
- Decomposição hierárquica de unidades

**Exemplo:** `3665 segundos` → `1h 1min 5seg`

---

#### Exercício 2 — Verificar Elementos Únicos (`VerifyUniqueEX2.java`)

**Objetivo:** Percorrer um vetor de inteiros e verificar se **todos os elementos são únicos**, isto é, se não há valores repetidos.

**Algoritmo:**
- Para cada elemento na posição `i`, compará-lo com todos os elementos nas posições `j > i`;
- Se qualquer par for igual, sinalizar a presença de repetição via flag booleana.

**Conceitos abordados:**
- Laços `for` aninhados
- Variável `boolean` como flag de estado
- Comparação pairwise de elementos

**Exemplo:** `{2, 5, 8, 9}` → `"Todos os elementos são únicos."`

---

### Estrutura de Arquivos

```
List02/
└── src/
    ├── TimeConverterEX1.java
    └── VerifyUniqueEX2.java
```

---

### Como Executar

**Pré-requisitos:** JDK instalado (versão 8 ou superior).

```bash
# Compilar
javac src/TimeConverterEX1.java

# Executar
java -cp src TimeConverterEX1
```

> Substitua o nome da classe para executar o outro exercício.

---

---

## 🇺🇸 English

### Academic Information

| Field | Information |
|---|---|
| **Institution** | IFTM — Instituto Federal do Triângulo Mineiro |
| **Program** | Systems Analysis and Development Technology |
| **Semester** | 3rd Semester |
| **Subject** | Data Structures |
| **Professor** | Junio Moreira |
| **Author** | Italo Antonio Costa Felisbino |
| **Date** | February 2026 |

---

### Description

This class deepens the work with **arrays** in Java, exploring numeric conversion algorithms and the **nested loops** technique for array element analysis, specifically for checking value uniqueness.

---

### Exercises

#### Exercise 1 — Time Converter (`TimeConverterEX1.java`)

**Goal:** Given a total value in seconds, convert and display the equivalent time in **hours**, **minutes**, and **seconds**.

**Algorithm:**
```
hours   = totalSeconds / 3600
rest    = totalSeconds % 3600
minutes = rest / 60
seconds = rest % 60
```

**Key concepts:**
- Integer division (`/`) and modulo (`%`) operators
- Hierarchical unit decomposition

**Example:** `3665 seconds` → `1h 1min 5sec`

---

#### Exercise 2 — Verify Unique Elements (`VerifyUniqueEX2.java`)

**Goal:** Traverse an integer array and verify whether **all elements are unique**, i.e., no duplicated values exist.

**Algorithm:**
- For each element at position `i`, compare it against all elements at positions `j > i`;
- If any pair is equal, signal duplication through a boolean flag.

**Key concepts:**
- Nested `for` loops
- `boolean` variable as a state flag
- Pairwise element comparison

**Example:** `{2, 5, 8, 9}` → `"All elements are unique."`

---

### File Structure

```
List02/
└── src/
    ├── TimeConverterEX1.java
    └── VerifyUniqueEX2.java
```

---

### How to Run

**Prerequisites:** JDK installed (version 8 or higher).

```bash
# Compile
javac src/TimeConverterEX1.java

# Run
java -cp src TimeConverterEX1
```

> Replace the class name to run the other exercise.

---

*IFTM — Instituto Federal do Triângulo Mineiro | Análise e Desenvolvimento de Sistemas | 3º Período*

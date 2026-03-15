# List 01 — Data Structures

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

Esta aula apresenta os primeiros exercícios práticos com **vetores (arrays)** em Java, abordando percurso de elementos, cálculo de média aritmética, busca pelo maior valor e validação de dados com estruturas de controle (`for`, `if`).

---

### Exercícios

#### Exercício 1 — Notas da Turma (`GradesEX1.java`)

**Objetivo:** Dado um vetor de notas de 10 alunos, calcular:
- A **média** da turma;
- A quantidade de alunos com nota **acima da média**;
- A **maior nota** registrada.

**Conceitos abordados:**
- Percurso de vetor com laço `for`
- Acumulador de soma
- Comparação e contagem condicional

---

#### Exercício 2 — Caixa Eletrônico (`AtmEX2.java`)

**Objetivo:** Dado um valor de saque, calcular a menor quantidade de notas de R$ 50, R$ 20 e R$ 10 necessárias para compor o valor.

**Conceitos abordados:**
- Operadores de divisão inteira e módulo (`/`, `%`)
- Lógica de decomposição de valores

---

#### Exercício 3 — Validação de Senha (`PasswordEX3.java`)

**Objetivo:** Verificar se uma senha digitada pelo usuário é válida, considerando:
- Mínimo de **8 caracteres**;
- Presença de pelo menos um **caractere especial**.

**Conceitos abordados:**
- Leitura de entrada via `Scanner`
- Percurso de `String` com `charAt()`
- Uso de `boolean` como flag de controle

---

#### Extra — Maior e Menor (`Extras/src/MaxMin.java`)

**Objetivo:** Encontrar o **maior** e o **menor** valor em um vetor de inteiros.

**Conceitos abordados:**
- Comparação iterativa de elementos
- Inicialização de variáveis de controle

---

### Estrutura de Arquivos

```
List01/
├── src/
│   ├── GradesEX1.java
│   ├── AtmEX2.java
│   └── PasswordEX3.java
└── Extras/
    └── src/
        └── MaxMin.java
```

---

### Como Executar

**Pré-requisitos:** JDK instalado (versão 8 ou superior).

```bash
# Compilar
javac src/GradesEX1.java

# Executar
java -cp src GradesEX1
```

> Substitua o nome da classe conforme o exercício desejado. Para `PasswordEX3`, a leitura é interativa via terminal.

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

This class introduces the first practical exercises with **arrays** in Java, covering element traversal, arithmetic mean calculation, maximum value search, and data validation using control structures (`for`, `if`).

---

### Exercises

#### Exercise 1 — Student Grades (`GradesEX1.java`)

**Goal:** Given an array of 10 student grades, compute:
- The class **average**;
- The number of students scoring **above average**;
- The **highest grade** recorded.

**Key concepts:**
- Array traversal with `for` loop
- Sum accumulator
- Conditional counting and comparison

---

#### Exercise 2 — ATM Machine (`AtmEX2.java`)

**Goal:** Given a withdrawal amount, calculate the minimum number of R$ 50, R$ 20, and R$ 10 bills required.

**Key concepts:**
- Integer division and modulo operators (`/`, `%`)
- Value decomposition logic

---

#### Exercise 3 — Password Validation (`PasswordEX3.java`)

**Goal:** Validate a user-entered password by checking:
- Minimum length of **8 characters**;
- Presence of at least one **special character**.

**Key concepts:**
- User input via `Scanner`
- String character traversal with `charAt()`
- `boolean` flags for control flow

---

#### Extra — Max and Min (`Extras/src/MaxMin.java`)

**Goal:** Find the **maximum** and **minimum** values in an integer array.

**Key concepts:**
- Iterative element comparison
- Control variable initialization

---

### File Structure

```
List01/
├── src/
│   ├── GradesEX1.java
│   ├── AtmEX2.java
│   └── PasswordEX3.java
└── Extras/
    └── src/
        └── MaxMin.java
```

---

### How to Run

**Prerequisites:** JDK installed (version 8 or higher).

```bash
# Compile
javac src/GradesEX1.java

# Run
java -cp src GradesEX1
```

> Replace the class name with the desired exercise. `PasswordEX3` requires interactive terminal input.

---

*IFTM — Instituto Federal do Triângulo Mineiro | Análise e Desenvolvimento de Sistemas | 3º Período*

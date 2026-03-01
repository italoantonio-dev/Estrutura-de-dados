# Estrutura de Dados | Data Structures

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
| **Linguagem** | Java |
| **Ano** | 2026 |

---

### Sobre o Repositório

Este repositório reúne os exercícios práticos desenvolvidos ao longo da disciplina de **Estrutura de Dados** do curso de **Tecnologia em Análise e Desenvolvimento de Sistemas** do **Instituto Federal do Triângulo Mineiro (IFTM)**, sob orientação do professor **Junio Moreira**.

Os códigos são implementados em **Java** e organizam-se por aulas, cada qual abordando um conjunto de conceitos fundamentais da disciplina, como vetores, algoritmos de busca, laços de repetição e estruturas de controle.

---

### Estrutura do Repositório

```
Estrutura de Dados/
│
├── Aula 01/                        # Vetores e estruturas de controle
│   ├── README.md
│   ├── src/
│   │   ├── NotasEX1.java           # EX1 — Média, maior nota e contagem
│   │   ├── CaixaEletronicoEX2.java # EX2 — Decomposição de valor em notas
│   │   └── SenhaEX3.java           # EX3 — Validação de senha
│   └── Extras/
│       └── src/
│           └── MaiorMenor.java     # Extra — Maior e menor de um vetor
│
├── Aula 02/                        # Algoritmos com vetores e laços aninhados
│   ├── README.md
│   └── src/
│       ├── ConversorTempoEX1.java  # EX1 — Conversor de segundos para h/min/seg
│       └── VerificarUnicosEX2.java # EX2 — Verificação de elementos únicos
│
└── Aula04/                         # Refatoração e Métodos
    ├── README.md
    └── src/
        ├── CaixaEletronico.java    # Caixa eletrônico refatorado com métodos
        ├── ContadordeNotas.java    # Contagem de notas escolares
        ├── Senha.java              # Validação de senha refatorada
        ├── Tempo.java              # Conversor de tempo refatorado
        └── VerificarUnico.java     # Verificação de únicos refatorada
```

---

### Conteúdo por Aula

#### Aula 01 — Vetores e Estruturas de Controle

Introdução à manipulação de **arrays** em Java. Os exercícios exploram percurso de vetores, cálculo de média, busca pelo maior valor, decomposição de valores monetários e validação de entrada do usuário.

| Arquivo | Descrição |
|---|---|
| `NotasEX1.java` | Calcula média, conta alunos acima da média e encontra a maior nota de uma turma |
| `CaixaEletronicoEX2.java` | Simula um caixa eletrônico, calculando as notas de R$ 50, R$ 20 e R$ 10 para um saque |
| `SenhaEX3.java` | Valida uma senha verificando tamanho mínimo e presença de caractere especial |
| `MaiorMenor.java` | Percorre um vetor para encontrar o maior e o menor elemento |

---

#### Aula 02 — Algoritmos com Vetores e Laços Aninhados

Aprofundamento em **algoritmos sobre vetores**, com ênfase em conversão de unidades e verificação de propriedades de conjuntos utilizando laços `for` aninhados.

| Arquivo | Descrição |
|---|---|
| `ConversorTempoEX1.java` | Converte um total de segundos em horas, minutos e segundos |
| `VerificarUnicosEX2.java` | Verifica se todos os elementos de um vetor são únicos (sem repetições) |

---

#### Aula 04 — Refatoração e Métodos

Consolidação dos conceitos das aulas anteriores, refatorando os exercícios em **métodos reutilizáveis** e expandindo a compreensão de **organização de código**. Os exercícios são implementações melhoradas das aulas anteriores com separação de responsabilidades e métodos bem estruturados.

| Arquivo | Descrição |
|---|---|
| `CaixaEletronico.java` | Refatoração do caixa eletrônico com método separado para cálculo de troco |
| `ContadordeNotas.java` | Contagem e análise de notas escolares |
| `Senha.java` | Refatoração da validação de senha em método dedicado |
| `Tempo.java` | Refatoração do conversor de tempo com métodos separados |
| `VerificarUnico.java` | Refatoração da verificação de elementos únicos em método |

---

### Pré-requisitos

- **JDK** 8 ou superior instalado
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code) ou compilação via terminal

### Como Compilar e Executar

```bash
# Exemplo para Aula 01 — Exercício 1
cd "Aula 01"
javac src/NotasEX1.java
java -cp src NotasEX1
```

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
| **Language** | Java |
| **Year** | 2026 |

---

### About This Repository

This repository contains the practical exercises developed throughout the **Data Structures** course of the **Systems Analysis and Development Technology** program at the **Instituto Federal do Triângulo Mineiro (IFTM)**, under the guidance of Professor **Junio Moreira**.

All code is implemented in **Java** and organized by class session, each covering a set of foundational concepts such as arrays, search algorithms, iteration loops, and control structures.

---

### Repository Structure

```
Estrutura de Dados/
│
├── Aula 01/                        # Arrays and control structures
│   ├── README.md
│   ├── src/
│   │   ├── NotasEX1.java           # EX1 — Average, highest grade, count
│   │   ├── CaixaEletronicoEX2.java # EX2 — Bill decomposition for ATM
│   │   └── SenhaEX3.java           # EX3 — Password validation
│   └── Extras/
│       └── src/
│           └── MaiorMenor.java     # Extra — Max and min of an array
│
└── Aula 02/                        # Algorithms with arrays and nested loops
    ├── README.md
    └── src/
        ├── ConversorTempoEX1.java  # EX1 — Seconds to h/min/sec converter
        └── VerificarUnicosEX2.java # EX2 — Unique element verification

└── Aula04/                         # Refactoring and Methods
    ├── README.md
    └── src/
        ├── CaixaEletronico.java    # Refactored ATM with dedicated methods
        ├── ContadordeNotas.java    # School grades counting and analysis
        ├── Senha.java              # Refactored password validation
        ├── Tempo.java              # Refactored time converter
        └── VerificarUnico.java     # Refactored unique element verification
```

---

### Content by Class

#### Class 01 — Arrays and Control Structures

Introduction to **array** manipulation in Java. Exercises explore array traversal, average calculation, maximum value lookup, monetary value decomposition, and user input validation.

| File | Description |
|---|---|
| `NotasEX1.java` | Computes class average, counts students above average, and finds the highest grade |
| `CaixaEletronicoEX2.java` | Simulates an ATM, calculating the quantity of R$ 50, R$ 20, and R$ 10 bills for a withdrawal |
| `SenhaEX3.java` | Validates a password by checking minimum length and special character presence |
| `MaiorMenor.java` | Traverses an array to find its maximum and minimum elements |

---

#### Class 02 — Algorithms with Arrays and Nested Loops

Deepens work on **array algorithms**, focusing on unit conversion and set property verification using nested `for` loops.

| File | Description |
|---|---|
| `ConversorTempoEX1.java` | Converts a total number of seconds into hours, minutes, and seconds |
| `VerificarUnicosEX2.java` | Checks whether all elements in an array are unique (no duplicates) |

---

#### Class 04 — Refactoring and Methods

Consolidation of concepts from previous classes, refactoring exercises into **reusable methods** and expanding understanding of **code organization**. The exercises are improved implementations from previous classes with separation of concerns and well-structured methods.

| File | Description |
|---|---|
| `CaixaEletronico.java` | Refactored ATM with dedicated method for change calculation |
| `ContadordeNotas.java` | School grades counting and analysis |
| `Senha.java` | Refactored password validation in a dedicated method |
| `Tempo.java` | Refactored time converter with separate methods |
| `VerificarUnico.java` | Refactored unique element verification in a method |

---

### Prerequisites

- **JDK** 8 or higher installed
- Any IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal-based compilation

### How to Compile and Run

```bash
# Example for Class 01 — Exercise 1
cd "Aula 01"
javac src/NotasEX1.java
java -cp src NotasEX1
```

---

*IFTM — Instituto Federal do Triângulo Mineiro | Análise e Desenvolvimento de Sistemas | 3º Período*

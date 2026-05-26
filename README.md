# ME2---Atividade-01---Desenvolvimento-de-Sistema-Academico-Orientado-a-Objetos

# Como executar o projeto:

Requisitos:
- Java JDK 17+ instalado
- VS Code ou qualquer IDE Java

Compilar o Projeto, no terminal, dentro da pasta do projeto:
javac Main.java
Executar o Projeto
java Main

# Sistema Acadêmico Orientado a Objetos

## Descrição do Projeto

Este projeto foi desenvolvido como atividade prática da disciplina de Projeto de Programação.  
O sistema simula a gestão básica de uma instituição de ensino, permitindo:

- Cadastro de alunos
- Cadastro de professores e coordenadores
- Lançamento de notas
- Listagem da comunidade acadêmica
- Cálculo da média geral da instituição
- Autenticação de funcionários administrativos

O objetivo principal do projeto é aplicar conceitos fundamentais de Programação Orientada a Objetos utilizando Java.

---

# Conceitos de POO Aplicados

## Abstração
A classe `Pessoa` foi definida como abstrata, pois representa apenas um modelo genérico de indivíduo da instituição.  
Ela não deve ser instanciada diretamente, servindo apenas como base para as classes `Aluno`, `Professor` e `Coordenador`.

## Herança
As classes `Aluno` e `Professor` herdam atributos e métodos da classe `Pessoa`.  
A classe `Coordenador` herda da classe `Professor`, reaproveitando seus atributos e comportamentos.

## Encapsulamento
Todos os atributos das classes foram definidos como `private`, com acesso controlado por meio de métodos getters e setters.

## Polimorfismo
A classe `RelatorioAcademico` trabalha com objetos do tipo `Avaliavel`, permitindo calcular médias sem depender diretamente da classe `Aluno`.

## Interfaces
Foram utilizadas interfaces para padronizar comportamentos:

- `Avaliavel`
- `Autenticavel`

---

# Estrutura do Projeto

```text
br.edu.instituicao
│
├── model
│   ├── Pessoa.java
│   ├── Aluno.java
│   ├── Professor.java
│   └── Coordenador.java
│
├── interfaces
│   ├── Avaliavel.java
│   └── Autenticavel.java
│
├── service
│   ├── Secretaria.java
│   ├── RelatorioAcademico.java
│   └── Nota.java
│
└── main
    └── Main.java
```

# Exemplo de saída no Console

==============================Bem-vindo ao Sistema Escolar==============================

1- Cadastrar Aluno
2- Cadastrar Professor/Coordenador
3- Lançar Notas de Aluno
4- Listar Comunidade Acadêmica
5- Exibir Estatísticas (Média Geral)
6- Acesso Administrativo
7- Sair

Selecione a opção que deseja:
1

Nome do aluno:
Arthur Morgan

CPF:
12345678900

Email:
RedDeadRedemption2@email.com

Matricula:
001

Aluno Cadastrado com Sucesso.

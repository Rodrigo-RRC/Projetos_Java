# 🐾 Sistema de Cadastro de Animais

Este projeto simula um sistema simples de cadastro de animais utilizando conceitos fundamentais da Programação Orientada a Objetos (POO) com **Java**.

---

## 💡 Conceitos Aplicados

- **Abstração**: Classe `Animal` representa um conceito genérico.
- **Herança**: Classes `Cachorro` e `Gato` herdam de `Animal`.
- **Polimorfismo**: Cada animal implementa seu próprio som.
- **Encapsulamento**: Atributos protegidos com acesso controlado.

---

## 📂 Estrutura do Projeto

| Arquivo                 | Descrição                                                |
|-------------------------|----------------------------------------------------------|
| **Animal.java**         | Classe abstrata base para todos os animais               |
| **Cachorro.java**       | Classe concreta que representa um cachorro               |
| **Gato.java**           | Classe concreta que representa um gato                   |
| **SistemaCadastro.java**| Responsável por cadastrar e listar os animais            |
| **Principal.java**      | Classe com o método `main`, que executa o sistema        |
| **README.md**           | Este arquivo de documentação                             |

---

## ▶️ Como Executar

1. Compile todos os arquivos `.java`:

```bash
javac *.java


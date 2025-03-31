# Projeto Java | Cofrinho de Moedas

Este projeto simula um cofrinho digital com suporte a moedas de diferentes países. O usuário interage via console e pode adicionar, remover, listar e converter moedas para o valor total em Real (R$).

---

## 💡 Funcionalidades

- Adicionar moedas: Real, Dólar e Euro
- Remover moedas específicas
- Listar todas as moedas inseridas
- Calcular o valor total convertido para Real

---

## 🧱 Estrutura de Classes

- **Moeda**: classe abstrata base com o atributo `valor` e método abstrato `converter()`
- **Real, Dolar, Euro**: subclasses de `Moeda`, implementam o método de conversão
- **Cofrinho**: classe que gerencia uma coleção de moedas utilizando `ArrayList`
- **Principal**: classe com o menu interativo que executa as ações via terminal

---

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Herança e polimorfismo com `@Override`
- Encapsulamento com atributos protegidos
- Uso de `ArrayList` para armazenar objetos
- Controle de fluxo com `switch-case` e `do-while`

---

## 🚀 Como executar

1. Clone o repositório ou copie a pasta `cofrinho-moedas` para seu ambiente
2. Importe o projeto no Eclipse (File > Import > Existing Projects into Workspace)
3. Execute a classe `Principal.java`

---

## 📎 Requisitos

- Java 17 (ou compatível)
- Eclipse IDE (recomendado)

---

📌 *Última atualização: Março de 2025*

# 💰 Projeto Java | Cofrinho de Moedas

Este projeto simula um cofrinho digital com suporte a moedas de diferentes países.  
O usuário interage via console e pode **adicionar**, **remover**, **listar** e **converter moedas** para o valor total em **Real (R$)**.

---

### 🚀 Teste Online Agora Mesmo:

▶️ [Clique aqui para testar no Replit](https://replit.com/@rodrigorcdev/cofrinhomoedas)

---

## ✅ Funcionalidades

- Adicionar moedas: Real, Dólar e Euro
- Remover moedas específicas
- Listar todas as moedas inseridas
- Calcular o valor total convertido para Real (R$)

---

## 📦 Estrutura de Classes

| Classe       | Responsabilidade |
|--------------|------------------|
| `Moeda`      | Classe abstrata base com o atributo `valor` e o método abstrato `converter()` |
| `Real`, `Dolar`, `Euro` | Subclasses de `Moeda`, implementam o método `converter()` |
| `Cofrinho`   | Gerencia a coleção de moedas com `ArrayList` e fornece os métodos de manipulação |
| `Main`       | Classe com o menu interativo que executa as ações via terminal |

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança e Polimorfismo com `@Override`
- Encapsulamento com atributos protegidos
- Uso de `ArrayList` para armazenar objetos
- Controle de fluxo com `switch-case` e `do-while`

---

## 🛠️ Como Executar

1. Clone o repositório ou copie a pasta `cofrinho_moedas`
2. Importe no **Eclipse** ou rode diretamente no **Replit**
3. Execute a classe **`Main.java`**

---

## 📌 Requisitos

- Java 17 (ou compatível)
- IDE Eclipse ou Replit (versão online)

---

📅 **Última atualização:** Março de 2025  
👨‍💻 **Desenvolvido por:** Rodrigo Ribeiro Carvalho – [GitHub](https://github.com/Rodrigo-RRC)

---

🦾 _"Pode até demorar… mas quem luta vence."_  

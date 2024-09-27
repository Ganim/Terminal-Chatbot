# Terminal Chatbot

## Objetivo
Este trabalho tem como objetivo geral desenvolver um chatbot de escopo fechado utilizando a linguagem de programação JAVA aplicando conceitos de boas prátias e componentização.

## Tecnologias Usadas
- **Linguagem de Programação:** Java

## Versões
- **Versão do Projeto:** 1.0.0
- **Versão do Java SDK:** 23
- **Versão do Java Runtime Environment (JRE):** 1.8

## Como Compilar
1. Certifique-se de ter o Java SDK instalado.
2. Clone o repositório do projeto:
  ```bash
  git clone https://github.com/Ganim/Terminal-Chatbot
  ```
3. Navegue até o diretório src/ do projeto:
  ```bash
  cd src
  ```
4. Execute o comando de compilação (na primeira vez e sempre que modificar o projeto)
  ```bash
javac --release 8 LojaChatbot.java
  ```

## Como Executar
1. Certifique-se de que o Java Runtime Environment (JRE) instalado.
2. Abra o terminal na pasta do projeto e execute o comando:
  ```bash
  java LojaChatbot
  ```

## Estrutura do Projeto
```
LojaChatbot/
│
└── src/
    ├── LojaChatbot.java         (Classe principal que coordena tudo)
    ├── InformacoesLoja.java     (Classe para informações da loja)
    ├── DuvidaProduto.java       (Classe para dúvidas sobre produtos)
    ├── Promocoes.java           (Classe para promoções)
    ├── FalarVendedor.java       (Classe para falar com o vendedor)
    ├── AtendimentoPosVenda.java (Classe para atendimento pós-venda)
    └── AcompanharPedido.java    (Classe para acompanhar o pedido)
```

# 💱 Conversor de Moedas - Java

Este projeto foi desenvolvido como parte de um **desafio proposto pela Alura**, com o objetivo de aplicar conhecimentos de Java em um cenário prático, consumindo uma API de taxas de câmbio em tempo real.

## 🧠 Descrição do Desafio

Neste desafio, o objetivo principal foi construir um **Conversor de Moedas** com interação via **console**, permitindo ao usuário converter valores entre diferentes moedas de forma dinâmica, utilizando uma **API externa** para obter as taxas de câmbio atualizadas.

## ✅ Funcionalidades Implementadas

- ✅ Interface via console com menu interativo
- ✅ Requisição a uma API pública de câmbio (ExchangeRate API)
- ✅ Conversão dinâmica entre moedas
- ✅ Mapeamento de resposta JSON com a biblioteca **Gson**
- ✅ 6 opções de conversões disponíveis:
  - Dólar ↔ Peso argentino
  - Dólar ↔ Real brasileiro
  - Dólar ↔ Peso colombiano

## 🚀 Tecnologias Utilizadas

- Java 17+
- API HTTP `HttpClient` (java.net.http)
- Gson (para desserialização JSON)
- Scanner (entrada de dados pelo console)

## 🔧 Estrutura do Projeto

```
src/
├── br/com/conversordemoeda/
│   ├── conexao/
│   │   └── RequisicaoMoeda.java        # Responsável por consumir a API
│   ├── conversao/
│   │   ├── ConversorDaMoeda.java       # Lógica de conversão de moedas
│   │   └── Moeda.java                  # Record para mapear a resposta da API
└── Main.java                           # Interface principal do usuário
```

## 🛠️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/conversor-moedas-java.git
   ```
2. Abra o projeto em sua IDE Java preferida (IntelliJ, Eclipse, VS Code, etc.).
3. Certifique-se de estar utilizando Java 22 ou superior.
4. Execute a classe `Main.java`.

## 🔗 API Utilizada

[ExchangeRate API](https://www.exchangerate-api.com/)  
(Chave de API utilizada no projeto: gratuita para fins educacionais)

## 📌 Aprendizados

Durante esse projeto, pratiquei:

- Como realizar requisições HTTP em Java
- Leitura e manipulação de JSON com Gson
- Boas práticas de organização de código Java
- Implementação de menus interativos com controle de fluxo
- Manipulação de exceções

## ✍️ Desafio da Alura

Este projeto foi desenvolvido como parte do **Desafio: Conversor de Moedas**, proposto pela plataforma **Alura** com os seguintes objetivos:

- Criar uma aplicação Java funcional que se comunique com APIs externas
- Interpretar e trabalhar com dados JSON
- Criar um sistema simples com foco em **interação do usuário via console**
- Simular um sistema ágil de desenvolvimento com organização via **Trello**

## 📸 Exemplo de Uso

```
*******************************************************
Seja bem-vindo/a ao Conversor de Moedas:
1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileiro
4) Real brasileiro =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Sair
Escolha uma opção válida:
*******************************************************
```

## 🤝 Contribuição

Sinta-se à vontade para fazer melhorias ou adaptações! Sugestões e PRs são bem-vindos.

## 📬 Contato

Feito por **Henrique Guilherme de Jesus Hernandes**  
📧 henriquedejesushernandes@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/henrique-hernandes/) | [GitHub](https://github.com/HenriqueDeJesus)

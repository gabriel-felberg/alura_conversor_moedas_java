# Conversor de Moedas em Java com Gson

## Visão Geral

O Conversor de Moedas em Java é uma aplicação desenvolvida para permitir que os usuários realizem conversões de moedas de forma prática e eficiente via console. O projeto utiliza Java para implementar a lógica de negócio, Gson para manipulação de dados JSON, consumo de API para obter taxas de câmbio atualizadas e interface de usuário via console para interação com o usuário.

## Funcionalidades Principais

- **Conversão de Moedas Dinâmica**: As taxas de câmbio são obtidas em tempo real através da API selecionada, garantindo precisão nas conversões.
  
- **Interface de Usuário Via Console**: Interação simples e direta com o usuário através do console, permitindo seleção de moedas e visualização dos resultados das conversões.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver a lógica do conversor.
  
- **Gson**: Biblioteca Java para serialização e desserialização de objetos Java para JSON e vice-versa.
  
- **API de Taxas de Câmbio**: Utilização de uma API externa para obter as taxas de câmbio atualizadas. Exemplo: [ExchangeRate-API](https://www.exchangerate-api.com/).
  
- **JSON**: Manipulação de dados JSON utilizando Gson para analisar e extrair as informações de taxa de câmbio da resposta da API.

## Como Usar

### Pré-requisitos

- JDK (Java Development Kit) instalado no seu sistema.
- IntelliJ IDEA (ou IDE de sua preferência) configurado para desenvolvimento Java.

### Instalação

1. Clone o repositório para o seu ambiente local:

   ```bash
   git clone https://github.com/seu-usuario/conversor-de-moedas-java.git
   cd conversor-de-moedas-java

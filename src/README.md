# Conversor de Moedas

Este é um conversor de moedas desenvolvido em Java que permite a conversão de diversas moedas com base nas taxas de câmbio obtidas em tempo real de uma API.

## Funcionalidades

- Conversão de USD para CNY, ARS, BRL, BOB, GBP
- Conversão de BRL para CNY, ARS, BOB, GBP
- Taxas de câmbio obtidas dinamicamente de uma API para garantir dados precisos e atualizados

## Requisitos

- Java 11 ou superior
- Biblioteca `com.google.gson` para manipulação de JSON
- Conexão com a internet para acessar a API de taxas de câmbio

## Configuração do Ambiente

1. **Instale o Java 11**:
    - Acesse o site oficial do [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) e siga as instruções para download e instalação.

2. **Instale o IntelliJ IDEA** (ou qualquer outra IDE de sua preferência):
    - Acesse o site oficial do [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) e siga as instruções para download e instalação.

3. **Adicionar dependência Gson**:
    - Baixe a biblioteca `gson-2.8.6.jar` do site do [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.6).
    - Adicione a biblioteca ao seu projeto no IntelliJ IDEA.

## Como Executar

1. Clone o repositório ou baixe os arquivos do projeto.

2. Abra o projeto no IntelliJ IDEA.

3. Adicione a biblioteca Gson ao seu projeto conforme descrito na seção de configuração do ambiente.

4. Compile e execute o projeto.

5. O programa exibirá um menu no console para selecionar a conversão desejada e inserir o valor a ser convertido.

## Exemplo de Uso

```sh
Conversor de Moedas
1. USD para CNY
2. USD para ARS
3. USD para BRL
4. USD para BOB
5. USD para GBP
6. BRL para CNY
7. BRL para ARS
8. BRL para BOB
9. BRL para GBP
0. Sair
Escolha uma opção: 4
Digite o valor: 50
50,00 USD é equivalente a 346,04 BOB

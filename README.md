# Spring Boot RabbitMQ Example

Este é um exemplo simples de aplicativo Spring Boot que demonstra como usar o RabbitMQ para enviar e receber mensagens.

## Pré-requisitos

- Java 8 ou superior
- Maven
- RabbitMQ

Certifique-se de ter o RabbitMQ instalado e em execução em sua máquina.

## Configuração

As configurações do RabbitMQ estão localizadas no arquivo `application.properties`. Verifique se as configurações de host, porta, usuário e senha estão corretas para o seu ambiente.

## Executando o Aplicativo

Para executar o aplicativo, você pode usar o Maven:

```bash
mvn spring-boot:run
```bash
## O aplicativo será iniciado e você poderá acessar os endpoints para enviar e receber mensagens.

Endpoints
1 Enviar Mensagem para fila
   Método: POST
   URL: http://localhost:8080/send-queue
   Corpo da Requisição: Texto da mensagem a ser enviada
   Este endpoint envia uma mensagem para a fila no RabbitMQ

2 Enviar Mensagem para tópico
   Método: POST
   URL: http://localhost:8080/send-topic
   Corpo da Requisição: Texto da mensagem a ser enviada
   Este endpoint envia uma mensagem para a fila no RabbitMQ

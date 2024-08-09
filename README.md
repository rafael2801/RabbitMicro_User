# User Microservice

Este projeto é um exemplo de um microserviço de usuário, desenvolvido com o objetivo de demonstrar o funcionamento básico de um microserviço. Ele foi construído usando **Java**, **Spring Boot**, **RabbitMQ** e **SQL**.

## Funcionalidades

- **Criação de Usuários**: Permite a criação de novos usuários.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para o desenvolvimento do microserviço.
- **Spring Boot**: Framework que simplifica o desenvolvimento de aplicações Java, especialmente microserviços.
- **RabbitMQ**: Sistema de mensagens utilizado para comunicação entre serviços.
- **SQL**: Banco de dados relacional utilizado para armazenar as informações dos usuários.

## Estrutura do Projeto

- **/src**: Contém o código-fonte do microserviço.
  - **/controller**: Contém os controladores REST.
  - **/service**: Contém a lógica de negócios.
  - **/repository**: Contém as interfaces para interação com o banco de dados.
  - **/config**: Contém as configurações do RabbitMQ e do banco de dados.

## Pré-requisitos

- **Java 17** ou superior
- **Maven** para gerenciar dependências e build
- **RabbitMQ** instalado e configurado
- **Banco de dados SQL** (MySQL, PostgreSQL, etc.)

## Configuração

1. Clone o repositório:

    ```bash
    git clone https://github.com/rafael2801/RabbitMicro_User.git
    cd RabbitMicro_User
    ```

2. Configure as propriedades do banco de dados e do RabbitMQ no arquivo `application.properties`:

    ```yaml
    spring.application.name=user
    server.port=8081
    spring.datasource.url=jdbc:mysql://localhost:3306/userdb
    spring.datasource.username=root
    spring.datasource.password=senha

    spring.rabbitmq.addresses=address
    spring.rabbitmq.queue=senha
    broker.queue.email.name=default.email
    ```

3. Execute o projeto:

    ```bash
    mvn spring-boot:run
    ```

## Endpoints

O microserviço expõe os seguintes endpoints REST:

- **POST /users**: Cria um novo usuário.

## Mensagens RabbitMQ

Este microserviço interage com outros serviços usando mensagens via RabbitMQ. Ele pode:

- **Publicar** eventos de criação, atualização ou deleção de usuários.

## Banco de Dados

O banco de dados utilizado é um SQL relacional. As migrações de banco de dados podem ser gerenciadas utilizando **Flyway** ou **Liquibase** (opcional).

## Testes

Para executar os testes:

```bash
mvn test
 

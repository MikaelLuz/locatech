# 🚗 LocaTech — Sistema de Locação de Veículos

O **LocaTech** é um projeto de sistema de locação de veículos desenvolvido em **Java com Spring Boot**, com o objetivo de gerenciar veículos, clientes e operações de aluguel por meio de uma API REST.

O projeto tem como proposta aplicar conceitos de desenvolvimento backend, arquitetura em camadas, persistência de dados e boas práticas de programação Java.

## 🛠️ Tecnologias utilizadas

| Tecnologia | Descrição |
|---|---|
| **Java** | Linguagem principal de desenvolvimento. |
| **Spring Boot** | Framework para configuração e desenvolvimento da aplicação. |
| **Spring Web** | Desenvolvimento de APIs REST e gerenciamento de requisições HTTP. |
| **H2 Database** | Banco de dados relacional leve, utilizado para desenvolvimento e testes. |
| **Spring JDBC / JDBC API** | Comunicação com o banco de dados relacional e execução de operações SQL. |
| **Lombok** | Redução de código repetitivo por meio de anotações, como `@Getter`, `@Setter` e `@NoArgsConstructor`. |

## 🎯 Objetivo do projeto

Desenvolver uma aplicação backend capaz de gerenciar o processo de locação de veículos, permitindo o cadastro, consulta, atualização e exclusão de informações.

O sistema será construído de maneira incremental, possibilitando a evolução das funcionalidades e a aplicação de novos conceitos durante o desenvolvimento.

## 📋 Funcionalidades planejadas

### 🚘 Gestão de veículos
- Cadastro de veículos.
- Consulta de veículos disponíveis.
- Atualização de informações.
- Exclusão de veículos.
- Controle de disponibilidade para locação.

### 👤 Gestão de clientes
- Cadastro de clientes.
- Consulta de clientes cadastrados.
- Atualização de dados cadastrais.
- Exclusão de registros.

### 🔑 Gestão de locações
- Registro de novas locações.
- Associação entre clientes e veículos.
- Controle das datas de retirada e devolução.
- Registro de devoluções.
- Cálculo do valor da locação.

## 🏗️ Arquitetura proposta

A aplicação será organizada em camadas, visando a separação de responsabilidades e a facilidade de manutenção.

```text
src/main/java/
└── com/locatech/
    ├── controller/
    ├── service/
    ├── repository/
    ├── model/
    ├── dto/
    └── exception/
```

**Responsabilidades:**

- **Controller:** recebe as requisições HTTP e retorna as respostas da API.
- **Service:** concentra as regras de negócio.
- **Repository:** realiza operações de persistência utilizando JDBC.
- **Model:** representa as entidades do sistema.
- **DTO:** define os objetos utilizados na transferência de dados.
- **Exception:** centraliza o tratamento de exceções.

*Estrutura proposta, sujeita a alterações conforme a evolução do projeto.*

## 💾 Banco de dados

Inicialmente, o projeto utilizará o **H2 Database**, permitindo desenvolver e testar as operações de persistência sem a necessidade de configurar um servidor externo de banco de dados.

A comunicação será realizada por meio do **Spring JDBC**, utilizando instruções SQL para operações de consulta, inserção, atualização e exclusão.

Futuramente, o banco de dados poderá ser substituído por soluções como PostgreSQL ou MySQL.

## 🚀 Como executar

### Pré-requisitos

- JDK compatível com a versão do Spring Boot utilizada.
- Maven ou Gradle, conforme a configuração do projeto.
- IDE de preferência (IntelliJ IDEA, Eclipse ou VS Code).

### Clonar o repositório

```bash
git clone https://github.com/MikaelLuz/locatech.git
cd locatech
```

### Executar a aplicação

Após configurar o projeto Spring Boot, caso utilize Maven Wrapper:

```bash
./mvnw spring-boot:run
```

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

A aplicação poderá ser acessada, por padrão, em:

```text
http://localhost:8080
```

*Os comandos de execução dependem da inclusão dos arquivos de build e do código-fonte no repositório.*

## 📈 Evolução do projeto

1. Configuração inicial do Spring Boot e H2.
2. Criação das entidades do domínio.
3. Implementação dos repositórios com JDBC.
4. Desenvolvimento das regras de negócio.
5. Exposição dos endpoints REST.
6. Implementação de validações e tratamento de erros.
7. Desenvolvimento de testes automatizados.
8. Melhorias de arquitetura e persistência.

## 👨‍💻 Autor

**Mikael Luz**

GitHub: [@MikaelLuz](https://github.com/MikaelLuz)

---

**LocaTech** — Projeto de estudo e desenvolvimento backend com Java e Spring Boot.

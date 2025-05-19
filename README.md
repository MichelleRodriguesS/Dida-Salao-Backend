# 💇‍♀️ Projeto Web App – Salão Dida Cabelereira

Este é um sistema de agendamento de serviços para o salão de cabeleireira "Dida", desenvolvido com **Spring Boot**, **Gradle** e integrado a um banco de dados **PostgreSQL Neon**. O projeto tem como objetivo gerenciar atendimentos, serviços e agendamentos de forma eficiente e segura.

---

## 🔧 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Gradle (Kotlin DSL)
- PostgreSQL (Neon Database)
- JPA / Hibernate
- REST APIs
- IntelliJ IDEA / VS Code

---

## ⚙️ Configuração Inicial

### 1. Clonar o repositório

```bash
git clone https://github.com/MichelleRodriguesS/Dida-Salao-Backend.git
cd Dida-Salao-Backend
````

### 2. Configurar o banco de dados

> O projeto utiliza o Neon (PostgreSQL gerenciado na nuvem). Você precisa configurar as credenciais de acesso no arquivo de configuração.

#### Caminho do arquivo:

```
src/main/resources/
```

#### Passos:

* Renomeie o arquivo `application_base.yml` para `application.yml`
* Substitua `SENHA_AQUI` pela senha real fornecida pela Neon
* Exemplo de `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://<url-do-neon>/<nome-do-banco>?sslmode=require
    driver-class-name: org.postgresql.Driver
    username: <seu-usuario>
    password: <sua-senha>

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
```

---

## ▶ Como executar o projeto

### Com terminal no VS Code, IntelliJ ou qualquer IDE:

```bash
./gradlew bootRun
```

> No Windows, use `gradlew.bat bootRun`

### Ou via IDE:

* Abra a classe principal anotada com `@SpringBootApplication`
* Clique no botão ▶ para executar a aplicação

---

## 🌐 Acessar o projeto

Por padrão, a aplicação será iniciada em:

```
http://localhost:8080
```

Você pode testar seus endpoints usando Postman, Insomnia ou navegadores (caso algum endpoint GET esteja disponível).

---

## 📁 Estrutura de Diretórios

```plaintext
📦 dida-salao-backend
├── 📂 src
│   └── 📂 main
│       ├── 📂 java                # Código-fonte (controllers, services, entities)
│       └── 📂 resources           # Arquivos de configuração (.yml)
├── 📄 build.gradle.kts           # Configuração do Gradle
├── 📄 settings.gradle.kts
├── 📄 .gitignore
```

---

## 📝 Observações

* Certifique-se de que o banco esteja **ativo e acessível** na Neon
* Em produção, utilize variáveis de ambiente para ocultar a senha do banco
* O sistema está em desenvolvimento e pode ser expandido com autenticação, frontend (Vue.js), dashboards e notificações por WhatsApp (via API)

---

## 🤝 Contribuições

Contribuições são bem-vindas! Para sugestões ou melhorias, abra uma issue ou envie um pull request.

---

## 📄 Licença

Este projeto é acadêmico e de uso interno, sem fins comerciais. Disponível para fins de estudo e melhoria.

```

---

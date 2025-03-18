# 🗄️ Demo DAO JDBC

![Java](https://img.shields.io/badge/Java-17-orange)
![JDBC](https://img.shields.io/badge/JDBC-Database-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-lightblue)
![Maven](https://img.shields.io/badge/Maven-Build-red)

## 📌 Sobre o Projeto

O **Demo DAO JDBC** é um projeto simples que demonstra como utilizar **DAO (Data Access Object)** com **JDBC** para acessar e manipular um banco de dados MySQL. O objetivo é ilustrar boas práticas na separação da camada de persistência em aplicações Java.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **JDBC (Java Database Connectivity)**
- **MySQL**
- **Maven**
- **DAO Pattern**

## 📂 Estrutura do Projeto

demo-dao-jdbc │── src/ │ ├── db/ # Conexão e utilitários do banco de dados │ ├── model/ # Classes de modelo (Entidades) │ ├── dao/ # Interfaces e implementações DAO │ ├── application/ # Classe principal com testes │── pom.xml # Configuração do Maven │── README.md # Documentação do projeto

📌 Funcionalidades Implementadas
✅ Conexão com MySQL via JDBC
✅ CRUD (Create, Read, Update, Delete) com DAO
✅ Aplicação do padrão de projeto DAO
✅ Uso do Properties para configuração do banco

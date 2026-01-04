# Gerenciador de Finanças – API REST

## 🎯 Objetivo do Projeto

- Consolidar fundamentos de backend com Spring Boot

- Aplicar arquitetura limpa em camadas

- Trabalhar relacionamentos JPA

- Utilizar corretamente HTTP Status Codes

- Construir serviços orientados à regra de negócio
- 
## 🛠️ Tecnologias Utilizadas

- Java 17

- Spring Boot

- Spring Web

- Spring Data JPA

- H2 Database (ambiente de desenvolvimento)

- Maven

## 🧱 Arquitetura

- O projeto segue o padrão clássico de arquitetura em camadas, garantindo separação de responsabilidades e facilidade de manutenção:

 ###  Controller → Service → Repository → Model

## 🚀 Funcionalidades Implementadas

### 👤 Usuários

- Cadastro de usuário

- Busca de usuário por ID

### 💰 Receitas

- Cadastro de receita vinculada a um usuário

- Listagem de receitas por usuário

### 📉 Despesas

- Cadastro de despesa vinculada a um usuário

- Listagem de despesas por usuário

### 📊 Saldo

- Cálculo do saldo total do usuário
- (Receitas − Despesas)

## 🧪 Testes

- Endpoints testados manualmente via Postman

- Banco H2 utilizado para facilitar testes em ambiente local

## 🔄 Status do Projeto

### 🚧 Em desenvolvimento contínuo

- O projeto encontra-se funcional em sua base principal, com os fluxos de cadastro, listagem e cálculo de saldo já implementados e testados.

- No entanto, novas funcionalidades estão planejadas para ampliar a robustez da aplicação e aproximá-la de um cenário real de produção.

### 📌 Próximas evoluções previstas

- Implementar atualização de usuário (PUT /usuarios/{id})

- Implementar ativação e desativação de usuário (controle de status)

- Adicionar DTOs para padronização e organização das respostas da API

- Criar tratamento global de exceções

- Implementar frontend para consumo da API

- Evoluir regras de negócio e validações

- Preparar a aplicação para ambientes de produção



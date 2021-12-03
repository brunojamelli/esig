<h1 align="center" style="font-weight:bold;">
    RECRUTAMENTO - PESSOA DESENVOLVEDORA JAVA
</h1>

## ℹ️ Sobre o projeto
Este projeto representa a minha resolução da atividade prática do processo seletivo para Pessoa Desenvolvedora Java junto a empresa ESIG Group.

Foram implementados os itens obrigatórios:

- Criação de uma aplicação Java Web utilizando JavaServer Faces (JSF);
- Utilização de persistência em um banco de dados PostgreSQL;
- Utilização JPA.

E como itens opcionais:

- Publicação projeto no heroku ou outro ambiente cloud.

<p>A aplicação desenvolvida se trata de um gerenciador de tarefas, onde o usuário pode:</p>

- Criar uma tarefa
- Atualizar a tarefa
- Remover a tarefa
- Concluir a Tarefa
- Listar Tarefas
- Buscar Tarefas
## Demonstração no Heroku
A aplicação esta disponivel no heroku no seguinte link:

[https://esigproject.herokuapp.com/index.xhtml](https://esigproject.herokuapp.com/index.xhtml)

## 🚀 Como executar a aplicação localmente
### Pré-requisitos
Antes de começar, você vai precisar verificar se tem instalado em sua máquina as seguintes ferramentas: git, openjdk, Docker ou postgres nativo, Além disto é necessário ter uma IDE para desenvolvimento de aplicações java EE, recomendo o intellij para esse projeto em especifico, uma vez que ele foi desenvolvido utilizando o intellij. Caso queira executar o postgres + pgadmin via docker, 
indico esse tutorial do Renato Groffe [link](https://renatogroffe.medium.com/postgresql-pgadmin-4-docker-compose-montando-rapidamente-um-ambiente-para-uso-55a2ab230b89).

#### 🏁 Começar
```bash

# Clone este repositório
git clone https://github.com/brunojamelli/esig.git

```

Acesse a pasta do projeto no com a IDE de sua preferencia, recomendo utilizar o [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=linux) 
#### 🐳 Se você não tem o docker
```bash

# baixe o instalador genérico do site oficial do docker
curl -fsSL https://get.docker.com -o get-docker.sh

# usando instalador genérico (para linux)
sh get-docker.sh

```
### Configurações basicas do Projeto
- Abrir arquivo application.properties, que se encontra dentro da pasta resources;
- Criar no postgres via CLI ou pgadmin um banco de dados chamado **"gerenciadortarefas"**, ou se preferir, altere o nome do banco de dados no application.properties, bastando manter o novo nome do banco de dados criado igual ao que estiver configurado no properties;
- Descomentar todas as linhas abaixo do comentario **"BANCO LOCAL"**;
- Comentar as linhas iniciais, que são referentes a execução do projeto no ambiente cloud do Heroku;
- Agora basta clicar em executar, que a sua aplicação estara funcionando perfeitamente e com um banco de dados novo e limpo;
- A aplicação ira executar em **http://localhost:8081/index.xhtml**;
- Vale salientar que a primeira execução ira demorar, pois o projeto ira utilizar o maven para baixar todas as dependencias necessarias.

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

### 🌐 **Banco de dados** 
- **[Postgres](https://expressjs.com/)**
- **[PGadmin 4](https://github.com/arb/celebrate)**

### 🌐 **Ecosistema SPRING e JAVA**
- **Openjdk-8**
- **jsf-spring-boot-starter**
- **spring-boot-starter-data-jpa**
- **spring-boot-starter-web**
- **spring-boot-starter-tomcat**
- **spring-boot-starter-test**
- **primefaces**

### 🌐 **Ferramentas de Suporte**
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=linux) 
- [Maven](https://maven.apache.org/)

> Veja o arquivo [pom.xml](https://github.com/brunojamelli/esig/blob/master/pom.xml)

## 👩🏽‍💻 Autor
<table>
  <tr>
    <td align="center"><a href="https://github.com/brunojamelli"><img src="https://avatars0.githubusercontent.com/u/21262825?s=400&u=8d99e00b964f6e0eb0684b34b9094a6c6163b65e&v=4" width="100px;" alt=""/><br /><sub><b>Bruno Jamelli</b></sub></a><br /><a href="https://github.com/brunojamelli/potianuncios-api" title="Code">💻 🎨</a></td>
  <tr>
</table>

---
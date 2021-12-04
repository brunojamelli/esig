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

- Publicação projeto no heroku ou outro ambiente cloud;
- Criação API REST.

<p>A aplicação desenvolvida se trata de um gerenciador de tarefas, onde o usuário pode:</p>

- Criar uma tarefa
- Atualizar a tarefa
- Remover a tarefa
- Concluir a Tarefa
- Listar Tarefas
- Buscar Tarefas
## Demonstração no Heroku
A aplicação está disponível no heroku no seguinte link:

[https://esigproject.herokuapp.com/index.xhtml](https://esigproject.herokuapp.com/index.xhtml)

## 🚀 Como executar a aplicação localmente
### Pré-requisitos
Antes de começar, você vai precisar verificar se tem instalado em sua máquina as seguintes ferramentas: **[git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)**, **[openjdk](https://openjdk.java.net/)** ou o jdk da oracle, **Docker** ou **[postgres nativo](https://www.postgresql.org/)**, Além disto é necessário ter uma IDE para desenvolvimento de aplicações java EE, recomendo o intellij para esse projeto em específico, uma vez que ele foi desenvolvido utilizando o intellij. Caso queira executar o postgres + pgadmin via docker para o seu ambiente de desenvolvimento, 
indico esse [tutorial](https://renatogroffe.medium.com/postgresql-pgadmin-4-docker-compose-montando-rapidamente-um-ambiente-para-uso-55a2ab230b89) do Renato Groffe.

#### 🏁 Começar
```bash

# Clone este repositório
git clone https://github.com/brunojamelli/esig.git

```

Acesse a pasta do projeto no com a IDE de sua preferência, recomendo utilizar o [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=linux) 
#### 🐳 Se você não tem o docker
```bash

# baixe o instalador genérico do site oficial do docker
curl -fsSL https://get.docker.com -o get-docker.sh

# usando instalador genérico (para linux)
sh get-docker.sh

```
### Configurações/Dicas Basicas do Projeto
- Abrir arquivo application.properties, que se encontra dentro da pasta resources;
- Criar no postgres via CLI ou pgadmin um banco de dados chamado **"gerenciadortarefas"**, ou se preferir, altere o nome do banco de dados no application.properties, bastando manter o novo nome do banco de dados criado igual ao que estiver configurado no properties;
- Descomentar todas as linhas abaixo do comentário **"POSTGRESQL LOCAL"**;
- Comentar as linhas iniciais, que são referentes a execução do projeto no ambiente cloud do Heroku;
- Agora basta clicar em executar, que a sua aplicação estará funcionando perfeitamente e com um banco de dados novo e limpo;
- A aplicação JSF ira executar em **http://localhost:8081/index.xhtml**;
- A API REST irá executar em **http://localhost:8081/api/task**;
- Vale salientar que a primeira execução irá demorar, pois o projeto irá utilizar o maven para baixar todas as dependências necessárias.

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

### 🌐 **Banco de dados** 
- **[SGBD Postgres](https://expressjs.com/)**
- **[PGadmin 4](https://github.com/arb/celebrate)**

### 🌐 **Ecosistema SPRING e JAVA**
- **Openjdk-8**
- **primefaces**
- **jsf-spring-boot-starter**
- **spring-boot-starter-data-jpa**
- **spring-boot-starter-tomcat**

### 🌐 **Ferramentas de Suporte**
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=linux) 
- [Maven](https://maven.apache.org/)
- [VScode](https://code.visualstudio.com/)

> Veja o arquivo [pom.xml](https://github.com/brunojamelli/esig/blob/master/pom.xml)

## 👩🏽‍💻 Autor
<table>
  <tr>
    <td align="center"><a href="https://github.com/brunojamelli"><img src="https://avatars0.githubusercontent.com/u/21262825?s=400&u=8d99e00b964f6e0eb0684b34b9094a6c6163b65e&v=4" width="100px;" alt=""/><br /><sub><b>Bruno Jamelli</b></sub></a><br /><a href="https://github.com/brunojamelli/potianuncios-api" title="Code">💻 🎨</a></td>
  <tr>
</table>

---
# API db teste

## Introdução 

<p>- Este Projeto apresenta uma API Rest desenvolvida com o auxilio do Spring Boot, e a linguagem Java, para atender os requisitos de um sistema de um pequeno banco virtual, com cliente, tipo de conta, gerente, agência e transações. Com o intuito de exercitar a pratica de montagem de sistemas, com a modelagem da relação entre as entidades, e construção de APIs com todos os beans comuns a um sistema com arquitetura Rest. </p>

## Índice: 

<a href="#API-db-teste">API db teste</a></br>
<a href="#Introdução">Introdução</a></br>
<a href="#%EF%B8%8Ftécnicas-e-tecnologias-utilizadas">Técnicas e Tecnologias utilizadas</a></br>
<a href="#Funcionalidades">Funcionalidades</a></br>
<a href="#Etapas">Etapas</a></br>
<a href="#status-1515">Status: 15/15</a></br>
<a href="#Como-utilizar">Como utilizar</a></br>

Na operacionalização do sistema obedecer a seguinte sequência:
## ✔️Técnicas e Tecnologias utilizadas

*  Java </br>
*  Spring Framework</br>
*  Spring Boot </br>
*  Spring Boot Validation</br>
*  Spring Data JPA</br>
*  Maven</br>
*  Lombok</br>
*  Flyway</br>
*  PostgresSQL</br>
*  Docker</br>


## 📃Funcionalidades

<p>Projeto teste simples de conexão com banco de dados com imagem do banco postgress no docker.</br> 
Implementado specifications e pageable para filtro e paginação. </br>

## Etapas:

Para cada uma das entidades da API foi implementado os seguintes componentes:</br>
  - [x] Implementação da entidade
  - [x] Implementação do Repository
  - [x] Implementação do DTO Response
  - [x] Implementação do DTO Register


Controller
  - [x] AgenciaController
  - [x] PessoaController


Para o controle Agencia foram implementadas os seguintes endpoints para as requisições HTTP compondo  CRUD:</br>
Ex: Para a Agencia.</br>
  - [x] @RequestMapping("/agencias") => Endereço URL básico:
  - [x] @GetMapping => Listar todas as Agencias.
  - [x] @GetMapping("/{id}") => Listar uma Agencia pelo id.
  - [x] @PostMapping => Cadastrar uma Agencia, com as informações no corpo da mensagem via JSON.
  - [x] @PutMapping("/{id}") => Atualizar uma Agencia pelo id, com as informações no corpo da mensagem via JSON.
  - [x] @DeleteMapping("/{id}") => Deletar uma Agencia pelo id.

Service

Para cada um dos endpoints das controllers foram montados métodos dentro das services para acessar o banco de dados </br> através dos Repositorys, e juntamente com os métodos das entidades, completar o CRUD e regras de negócio.</br>


## Status: 15/15

## Como utilizar:

#### Carregamento do projeto

 <p>Neste momento para utilizar o sistema é necessário rodar o sistema offline dentro de alguma IDE, através do Spring Boot.</p>
   <p><strong>Etapas:</strong></p>
     - Download do projeto e descompactar </br>
     - Fazer a atualização das dependências com o Maven</br>
     - Fazer a configuração do banco de dados de sua preferência</br>
     - Criar o banco de dados </br>
     - Configurar a API a este banco de dados</br>
     - Rodar o projeto com a app.properties em spring.jpa.hibernate.ddl-auto=create</br>
     - Em seguida colocar spring.jpa.hibernate.ddl-auto=none</br>
     - Abrir a collection de endpoints com o software que gerencia requisições PostMan</br>



# Projeto Spring Boot

O projeto "Spring Boot Primeiro Exemplo" é uma aplicação Java desenvolvida com o framework Spring Boot. Ele consiste em três pacotes principais: br.com.pazzini.domain para a definição da entidade Cliente, br.com.pazzini.repository para a interface de repositório do Cliente, e br.com.pazzini.SpringBootPrimeiroExemplo para a configuração e execução da aplicação.

A classe Cliente representa a entidade a ser persistida no banco de dados, contendo atributos como nome, CPF, telefone, e outros. A interface IClienteRepository estende CrudRepository do Spring, fornecendo operações básicas de CRUD para a entidade Cliente.

A classe principal SpringBootPrimeiroExemploApplication é anotada com @SpringBootApplication e inclui configurações adicionais como @Configuration, @EnableJpaRepositories, @EntityScan, e @ComponentScan. Ela também implementa a interface CommandLineRunner, executando uma lógica simples ao iniciar a aplicação, onde um cliente é criado e salvo no banco de dados.

Além disso, há uma classe de teste SpringBootPrimeiroExemploApplicationTests que verifica se o contexto da aplicação é carregado corretamente ao ser executada.

O projeto, em resumo, utiliza o Spring Boot para criar uma aplicação Java que realiza operações básicas de persistência com uma entidade Cliente em um banco de dados, demonstrando conceitos fundamentais do desenvolvimento Spring Boot.


## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">


   

# SISTEMA DIDÁTICO DE CONVENIO MÉDICO COM MICROSSERVIÇOS

## Sobre o projeto

A proposta deste projeto é desenvolver um sistema utilizando a arquitetura de microsserviços para fins didáticos. O sistema será apresentando como exemplo de aplicação na aula de Desenvolvimento de Software Orientado a Objetos (DSOO) do Departamento de Computação da UFSCar (Programa de Pós-Graduação em Ciência da Computação) ministrada pelo professor Valter Camargo no 2º de 2022.

O exemplo consiste na criação de microsserviços que simulem o atendimento de um convênio médico cujo usuário (cliente) contrata um plano e tenta realizar um procedimento, no exemplo, uma consulta médica. Contudo vários fatores estão relacionados com a consulta, por exemplo o tipo de convênio e estar sem débidos com o convênio.

A seguir é apresentado o rascunho do diagrama da aplicação monolítica referente as microsserviços que serão implementados no projeto.

![Diagrama de Classes](https://github.com/ednilsonrossi/dsoo_ms_convenio_medico/assets/diagrama_monolito.png)

## Tecnologias

- Spring Boot
- Spring Cloud
- Java
- JPA


## Tutorial

### Projeto dsoo-ms-cliente
Esse projeto será responsável por fornecer serviços relacionados à clientes, inclusive com dados do plano de saúde.

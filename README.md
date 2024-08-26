Sistema de Agendamentos 

Descrição do Projeto
Este projeto é uma API para gerenciar um sistema de agendamentos, permitindo que usuários reservem horários para diversos serviços. 
O backend foi desenvolvido com Java 17 utilizando Spring Boot e um banco de dados embutido H2 para armazenamento temporário dos dados.

Tecnologias Utilizadas

Java 17: Linguagem de programação principal utilizada no desenvolvimento da API.
Spring Boot: Framework utilizado para a criação de microserviços e aplicações Java, simplificando a configuração e o desenvolvimento.
H2 Database: Banco de dados em memória usado para facilitar o desenvolvimento e testes da aplicação.

Funcionalidades Principais
Cadastro de Usuários: Permite o registro de novos usuários que podem realizar agendamentos.
Gerenciamento de Agendamentos: Permite a criação, visualização e cancelamento de agendamentos.

Estrutura da API

users: Endpoints para gerenciamento de usuários (criação, atualização, consulta).
/tasks: Endpoints para criação, consulta e cancelamento de agendamentos.

Como Rodar o Projeto?

Pré-requisitos:
Java 17 ou superior instalado
Maven instalado

Instruções:
Clone este repositório.
Navegue até o diretório do projeto.
Execute o comando mvn spring-boot:run para iniciar o servidor.
A API estará disponível em http://localhost:8080.

Banco de Dados H2:
O banco de dados H2 é executado em memória e é inicializado automaticamente ao rodar a aplicação.
Para acessar o console do H2, utilize o seguinte endereço: http://localhost:8080/h2-console.
As credenciais para o H2 serão configuradas no arquivo application.properties.

Contribuições
Contribuições para o aprimoramento desta API são bem-vindas. Sinta-se à vontade para abrir issues e submeter pull requests.

Licença
Este projeto está licenciado sob a Licença MIT.

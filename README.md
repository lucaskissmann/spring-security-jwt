# Spring Security Example

Este projeto é uma ilustração de como aplicar a biblioteca de segurança do Spring.

### Utilização Prática 

Para verificar a funcionalidade do Spring Security, foram criadas duas rotas diferentes na aplicação, uma privada e outra publica para realizar a autenticação do usuário.

As rotas são as seguintes:

- Publica para autenticação - POST `http://localhost:8080/authenticate`
- Privada - GET `http://localhost:8080/private`


Caso um usuário tente acessar a rota privada sem estar autenticado, o conteúdo não será exibido e retornará um 401 da API.

Para realizar a autenticação o usuário deve fazer a requisição POST e informar as seguintes credenciais já definidas para o usuário no banco em memória do H2:

- **Username**: `username`
- **Password**: `password`

Obs.: caso esteja utilizando algum aplicativo como Postman, as credenciais vão na aba `Authorization` com Auth Type `Basic Auth`.

Após fazer a requisição, será retornado um token JTW de acesso à rota privada. 

Utilizando esse token, ao fazer a requisição para a rota privada, o conteúdo deve ser exibido.

# Produtos API

API de Produtos desenvolvida com Spring Boot.

## Tecnologias Utilizadas

* Java 21
* Spring Boot 3.2.5
* Spring Web
* Spring Data JPA
* H2 Database
* Lombok

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/kauaxp77/Api_Rest.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd produtosapi
   ```
3. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```

A API estará disponível em `http://localhost:8080`.

## Endpoints

* `POST /produtos`: Cria um novo produto.
  * *Corpo esperado:* `{ "nome": "...", "descricao": "...", "preco": 0.0 }`
* `GET /produtos/{id}`: Obtém os detalhes de um produto pelo seu ID.
* `DELETE /produtos/{id}`: Remove um produto do banco de dados pelo seu ID.

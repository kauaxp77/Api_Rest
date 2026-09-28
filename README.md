# Produtos API - Aplicação de Estudo

API RESTful para gestão de produtos, desenvolvida com Spring Boot. 
Este projeto tem foco acadêmico e serve como uma aplicação base para estudos de desenvolvimento web em Java.

## 🛠️ Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3.2.5**
* **Spring Web** (criação de endpoints REST)
* **Spring Data JPA** (persistência de dados)
* **H2 Database** (banco de dados em memória)
* **Lombok** (redução de boilerplate)

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/kauaxp77/Api_Rest.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd produtosapi
   ```
3. Execute a aplicação (ela rodará na porta 8080):
   ```bash
   ./mvnw spring-boot:run
   ```

A API estará disponível localmente em `http://localhost:8080`.

## 📌 Endpoints da API

Abaixo estão todos os endpoints disponíveis na aplicação e seus respectivos exemplos de uso.

### 1. Criar Produto
* **Método:** `POST`
* **Rota:** `/produtos`
* **Descrição:** Cria um novo produto no sistema. O `id` é gerado automaticamente usando UUID.
* **Corpo da Requisição (JSON):**
  ```json
  {
    "nome": "Mouse Gamer",
    "descricao": "Mouse com LED RGB e 3200 DPI",
    "preco": 150.00
  }
  ```

### 2. Buscar Produto por ID
* **Método:** `GET`
* **Rota:** `/produtos/{id}`
* **Descrição:** Retorna os detalhes de um produto específico através do seu ID.
* **Exemplo de Rota:** `/produtos/550e8400-e29b-41d4-a716-446655440000`

### 3. Atualizar Produto
* **Método:** `PUT`
* **Rota:** `/produtos/{id}`
* **Descrição:** Atualiza os dados de um produto existente pelo seu ID.
* **Exemplo de Rota:** `/produtos/550e8400-e29b-41d4-a716-446655440000`
* **Corpo da Requisição (JSON):**
  ```json
  {
    "nome": "Mouse Gamer Atualizado",
    "descricao": "Mouse com LED RGB e 6400 DPI",
    "preco": 180.50
  }
  ```

### 4. Deletar Produto
* **Método:** `DELETE`
* **Rota:** `/produtos/{id}`
* **Descrição:** Remove um produto da base de dados através do seu ID.
* **Exemplo de Rota:** `/produtos/550e8400-e29b-41d4-a716-446655440000`

### 5. Pesquisar Produto por Nome
* **Método:** `GET`
* **Rota:** `/produtos`
* **Descrição:** Busca produtos filtrando pelo parâmetro de nome na URL (query param).
* **Exemplo de Rota:** `/produtos?nome=Mouse`

---

## 🧪 Testando com o Postman

Para testar os endpoints de pesquisa ou qualquer outro endpoint, você pode utilizar a ferramenta **Postman**. 

Veja o passo a passo para fazer a pesquisa de um produto pelo nome:

1. Abra o **Postman** e crie uma nova aba/requisição (botão **+**).
2. Na caixa de seleção de método (lado esquerdo), escolha **GET**.
3. Na barra de endereço (URL), insira: `http://localhost:8080/produtos`
4. Vá até a aba **Params** (fica logo abaixo da barra de URL).
5. Na coluna **Key**, digite `nome`.
6. Na coluna **Value**, digite o que deseja pesquisar (exemplo: `Mouse`).
7. Clique no botão azul **Send**.
8. O resultado da sua busca aparecerá na área inferior do Postman (na aba **Body**), no formato JSON.

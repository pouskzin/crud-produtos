# 📦 API de Controlo de Produtos

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)

API REST desenvolvida para gestão de inventário de produtos. Permite realizar operações completas de CRUD (Criar, Ler, Atualizar, Apagar).

## 🚀 Tecnologias Utilizadas

- **Java 21**: Linguagem principal.
- **Spring Boot 3**: Framework para desenvolvimento rápido.
- **Spring Data JPA**: Abstração para persistência de dados.
- **H2 Database**: Base de dados em ficheiro (File-based) para desenvolvimento.
- **Lombok**: Redução de código boilerplate (Getters/Setters).

## 🛠️ Como Executar

### Pré-requisitos
- Java 21 instalado.
- Maven (opcional, pois o projeto inclui o wrapper `mvnw`).

### Passos
1. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU-USER/NOME-DO-REPO.git](https://github.com/SEU-USER/NOME-DO-REPO.git)
   ```

2. Entre na pasta do projeto:
    ```bash
    cd crud_produtos
    ```

3. Execute a aplicação:

- **No Windows:**
    ```bash
    .\mvnw spring-boot:run
    ```

- **No Linux/Mac:**

    ```bash
    ./mvnw spring-boot:run
    ```

**Nota:** O servidor iniciará na porta ```8080```.

## 🔌 Endpoints (Documentação da API)
- Aqui estão as rotas disponíveis para testar no **Thunder Client** ou **Postman:**
```bash
Método, URL, Descrição, Exemplo de JSON (Body)
POST,/produtos,Cadastra um novo produto,"{""nome"": ""Teclado"", ""preco"": 150.00, ""quantidade"": 10}"
GET,/produtos,Lista todos os produtos,(Sem corpo)
GET,/produtos/{id},Busca um produto pelo ID,(Sem corpo)
PUT,/produtos/{id},Atualiza os dados de um produto,"{""nome"": ""Teclado RGB"", ""preco"": 180.00, ""quantidade"": 8}"
DELETE,/produtos/{id},Apaga um produto,(Sem corpo)
```

---

### 🐙 Passo 3: Criar o Repositório no GitHub

1.  Vai ao [GitHub.com](https://github.com/).
2.  Clica no **+** (canto superior direito) -> **New repository**.
3.  Nome: `api-produtos-springboot` (ou algo similar).
4.  Deixa como **Public**.
5.  **NÃO** adiciones README nem .gitignore (já os criámos no computador).
6.  Clica em **Create repository**.

---

### 🚀 Passo 4: Enviar o Código (Terminal)

Agora vamos usar o terminal do VS Code para enviar tudo.
Certifica-te de que estás na pasta do projeto.

1.  **Iniciar o Git:**
    ```bash
    git init
    ```
2.  **Adicionar os ficheiros:**
    ```bash
    git add .
    ```
3.  **Salvar a versão (Commit):**
    ```bash
    git commit -m "feat: CRUD completo de produtos com persistência em ficheiro"
    ```
4.  **Mudar o nome da branch principal (boa prática):**
    ```bash
    git branch -M main
    ```
5.  **Conectar com o GitHub:**
    *(Copia o comando que o GitHub te mostrou na página, que começa por `git remote add origin...`)*. Exemplo:
    ```bash
    git remote add origin https://github.com/SEU-USER/api-produtos-springboot.git
    ```
6.  **Enviar (Push):**
    ```bash
    git push -u origin main
    ```

---

### 🎉 Missão Cumprida!

Assim que o comando terminar, atualiza a página do GitHub. Deves ver o teu código, o escudo do Java 21 e a tabela bonita com os Endpoints.

**Desafio final:** Envia-me o link do repositório para eu ver como ficou a documentação! (Se quiseres, claro).
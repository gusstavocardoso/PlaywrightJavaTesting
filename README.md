# Projeto de Testes Automatizados com Playwright em Java

Este projeto automatiza o fluxo de compra no site saucedemo.com utilizando Playwright com Java.

## Tecnologias Utilizadas

- Java
- Maven
- Playwright
- TestNG
- Dotenv

## Instalação das Dependências

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```
   
2. Configure as variáveis de ambiente:

- Crie um arquivo .env na raiz do projeto com o seguinte conteúdo:
makefile

    ```sh
    SAUCEDEMO_USERNAME=your_username
    SAUCEDEMO_PASSWORD=your_password
   ```

3. Instale as dependências do projeto utilizando Maven:

    ```sh
    mvn clean install
    ```
## Execução dos Testes

  ```sh
    mvn test
  ```
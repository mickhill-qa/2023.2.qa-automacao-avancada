#language: pt

Funcionalidade: Cadastro
  Como usuario do site https://seubarriga.wcaquino.me/cadastro
  Quero realizar o cadastro na plataforma
  Para ter acesso aos recursos disponíveis

  Esquema do Cenario: Cadastro "<fluxo>"
    Dado que o usuario esteja na tela de cadastro
    Quando preencher os campos "<nome>", "<email>", "<senha>" e clicar no botao Cadastrar
    Entao o sistema mostrara a "<mensagem>"

    Exemplos:
      | nome          | email                | senha    | mensagem                     | fluxo                   |
      | Edinete Sousa | edinetebs@gmail.com  | 23456789 | Usuário inserido com Sucesso | Senha apenas numerica   |
      | Edinete Sousa | edinete.bs@gmail.com | asdfghjk | Usuário inserido com Sucesso | Senha apenas com letras |
      | Edinete Sousa | edineteb.s@gmail.com |          | Senha é um campo obrigatório | Senha vazia             |
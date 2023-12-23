#language: pt
Funcionalidade: Cadastro
  Como usuário do site "https://seubarriga.wcaquino.me/"
  Quero realizar o cadastro na plataforma
  Para ter acesso aos recursos disponíveis

  Esquema do Cenario: Testes de cadastro - EXCECAO
    Dado que o usuario esteja na tela de cadastros
    Quando o usuario preencher os campos "<nome>", "<email>", "<senha>" e clicar em cadastrar
    Entao o sistema mostrara a "<mensagem>"

    Exemplos:
      | nome | email                | senha    | mensagem                     |
      |      | teste@testegmail.com | teste123 | Nome é um campo obrigatório  |
      | Mick |                      | teste123 | Email é um campo obrigatório |
      | Mick | teste@testegmail.com |          | Senha é um campo obrigatório |
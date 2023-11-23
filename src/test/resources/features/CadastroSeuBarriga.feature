#language: pt

Funcionalidade: Cadastro
  Como usuário do site "https://seubarriga.wcaquino.me/"
  Quero realizar o cadastro na plataforma
  Para ter acesso aos recursos disponíveis

  Cenario: Cadastro com Sucesso
    Dado que o usuario esteja na tela de Cadastro
    Quando o usuario preencher os campos "<nome>", "<email>", "<senha>" e clicar em Cadastrar
    Entao o sistema mostrarar a mensagem "Usuário inserido com sucesso"


  Esquema do Cenario: Testes dos campos de Cadastros
    Dado que o usuario esteja na tela de Cadastro
    Quando preencher os campos "<nome>", "<email>", "<senha>" e clicar em Cadastrar
    Entao o sistema mostrara a "<mensagem>"

    Exemplos:
      | nome             | email           | senha  | mensagem                     |
      |                  | teste@teste.com | 123456 | Nome é um campo obrigatório  |
      | Teste Automation |                 | 123456 | Email é um campo obrigatório |
      | Teste Automation | teste@teste.com |        | Senha é um campo obrigatório |
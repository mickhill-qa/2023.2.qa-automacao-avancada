#language: pt

Funcionalidade: Login no Site Seu Barriga

  Contexto:
    Dado que o usuario esta na tela de login

  Cenario: Login com sucesso
    Quando preencher os campos email e senha com dados validos
    E clicar no botao entrar
    Entao o sistema mostrara a mensagem de Bem-vindo

  Cenario: Login com email vazio
    Quando o usuario deixar o campo email vazio
    E o usuario preeencher o campo senha
    E clicar no botao entrar
    Entao o sistema mostrara a mensagem "Email é um campo obrigatório"

  Cenario: Login com senha vazia
    Quando o usuario preencher o campo email
    E o usuario deixar o campo senha vazia
    E clicar no botao entrar
    Entao o sistema mostrara a mensagem "Senha é um campo obrigatório"

  Cenario: Login com email nao cadastrado
    Quando o usuario preencher o email com dados invalidos
    E o usuario preeencher o campo senha
    E clicar no botao entrar
    Entao o sistema mostrara a mensagem "Problemas com o login do usuário"

  Cenario: Login com senha incorreta
    Quando preencher o campo email
    E o usuario preencher a senha com dados incorretos
    E clicar no botao entrar
    Entao o sistema mostrara a mensagem "Problemas com o login do usuário"

#language: pt
@grupo_05_login
Funcionalidade: Login
  Realizar suite de teste de login

  Contexto:
    Dado que o usuario esteja na tela de login

  Cenario: Login com sucesso
    Quando o usuario preenche o campo email com "grupo05@qa.com" e o campo senha "grupo05"
    Entao o sistema redireciona para a home page
    E exibe a mensagem de sucesso "Bem vindo, Grupo 05 - Os melhores!"

  Cenario: Login com a tecla ENTER
    Quando o usuario preenche o email com "grupo05@qa.com" e a senha "grupo05"
    E pressiona a tecla ENTER
    Entao o sistema redireciona para a home page
    E exibe a mensagem de sucesso "Bem vindo, Grupo 05 - Os melhores!"

  Cenario: Login com email em branco
    Quando o usuario preenche o campo email com "" e o campo senha "grupo05"
    Entao exibe a mensagem de erro "Email é um campo obrigatório"

  Cenario: Login com senha em branco
    Quando o usuario preenche o campo email com "grupo05@qa.com" e o campo senha ""
    Entao exibe a mensagem de erro "Senha é um campo obrigatório"

  Esquema do Cenario: Login com dados invalidos
    Quando o usuario preenche o campo email com <email> e o campo senha <senha>
    Entao exibe a mensagem de erro "Problemas com o login do usuário"
    Exemplos:
      | email              | senha     |
      | "grupo05xx@qa.com" | "grupo05" |
      | "grupo05@qa.com"   | "grupo5"  |

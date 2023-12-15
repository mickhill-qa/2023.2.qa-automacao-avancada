#language: pt

Funcionalidade: Login Herokuapp

  Contexto:
    Dado que o usuario esta na Pagina de login

  Cenario: Login com Sucesso
    Quando o usuario preencher o Username "tomsmith"
    E o usuário preencher password com "SuperSecretPassword!"
    Entao o sistema apresenta a mensagem "You logged into a secure area!"

  Cenario: Login com campo Username vazio
    Quando o usuario nao preencher o Username
    E o usuário preencher password com "SuperSecretPassword!"
    Entao o sistema apresenta a mensagem "Your username is required field!"

  Cenario: Login com campo Username incorreto
    Quando o usuario preencher o Username "tomsmitherrado"
    E o usuário preencher password com "SuperSecretPassword!"
    Entao o sistema apresenta a mensagem "Your username and password is invalid!"

  Cenario: Login com campo Password vazio
    Quando o usuario preencher o Username "tomsmith"
    E o usuario nao preencher o password
    Entao o sistema apresenta a mensagem "Your password is required field!"

  Cenario: Login com campo Password incorreto
    Quando o usuario preencher o Username "tomsmith"
    E o usuário preencher password com "SuperSecretPassworderrado!"
    Entao o sistema apresenta a mensagem "Your username and password is invalid!"

  Cenario: Login com campo Username e Password vazio
    Quando o usuario nao preencher o Username
    E o usuario nao preencher o password
    Entao o sistema apresenta a mensagem "Your username and password is required field!"


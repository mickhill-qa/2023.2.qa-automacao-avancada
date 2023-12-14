#language: pt

Funcionalidade: Login Herokuapp

  Cenario: Login com Sucesso
    Dado que o usuario esta na Pagina de login
    Quando o usuario preencher o Username "tomsmith"
    E o usuário preencher password com "SuperSecretPassword!"
    Entao o sistema apresenta a mensagem "You logged into a secure area!"

  Cenario: Login com campo Username vazio
    Dado que o usuario esta na Pagina de login
    Quando o usuario nao preencher o Username
    E o usuário preencher password com "SuperSecretPassword!"
    Entao o sistema apresenta a mensagem "Your username is required field!"

  Cenario: Login com campo Username incorreto
    Dado que o usuario esta na Pagina de login
    Quando o usuario preencher o Username "tomsmitherrado"
    E o usuário preencher password com "SuperSecretPassword!"
    Entao o sistema apresenta a mensagem "Your username and password is invalid!"

  Cenario: Login com campo Password vazio
    Dado que o usuario esta na Pagina de login
    Quando o usuario preencher o Username "tomsmith"
    E o usuario nao preencher o password
    Entao o sistema apresenta a mensagem "Your password is required field!"

  Cenario: Login com campo Password incorreto
    Dado que o usuario esta na Pagina de login
    Quando o usuario preencher o Username "tomsmith"
    E o usuário preencher password com "SuperSecretPassworderrado!"
    Entao o sistema apresenta a mensagem "Your username and password is invalid!"

  Cenario: Login com campo Username e Password vazio
    Dado que o usuario esta na Pagina de login
    Quando o usuario nao preencher o Username
    E o usuario nao preencher o password
    Entao o sistema apresenta a mensagem "Your username and password is required field!"

  Cenario: Login pela area segura
    Dado que o usuario nao esta logado
    Quando o usuario tentar acessar o sistema pela url da area segura
    Entao o sistema deve redirecionar o usuario para a pagina de login
    E o sistema deve exibir a mensagem "You must login to view the secure area!"


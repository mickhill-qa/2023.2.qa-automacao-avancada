#language: pt
@grupo_5_login
Funcionalidade: Grupo 5 - Login

  Contexto:
    Dado que o usuario esta na pagina de login

  Cenario: Login com Sucesso
    Quando o usuario preenche o campo username com "tomsmith" e o campo password com "SuperSecretPassword!"
    Entao o sistema redireciona para a security area
    E apresenta a mensagem "You logged into a secure area!"

  Cenario: Login com a tecla Enter
    Quando o usuario preenche os campos username com "tomsmith" e password com "SuperSecretPassword!"
    E pressiona a tecla Enter
    Entao o sistema redireciona para a security area
    E apresenta a mensagem "You logged into a secure area!"

  Cenario: Login com password invalido
    Quando o usuario preenche o campo username com "tomsmith" e o campo password com "invalido"
    Entao o sistema exibe a mensagem de erro: "Your password is invalid!"

  Cenario: Login com username invalido
    Quando o usuario preenche o campo username com "joaozinho" e o campo password com "SuperSecretPassword"
    Entao o sistema exibe a mensagem de erro: "Your username is invalid!"

  Cenario: Login com username em branco
    Quando o usuario preenche o campo username com "joaozinho" e o campo password com "SuperSecretPassword"
    Entao o sistema exibe a mensagem de erro: "Username is required!"

  Cenario: Login com password em branco
    Quando o usuario preenche o campo username com "tomsmith" e o campo password com ""
    Entao o sistema exibe a mensagem de erro: "Password is required!"

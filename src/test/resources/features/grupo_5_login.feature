#language: pt
@resetBrowser
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

  Esquema do Cenario: Login com credenciais invalidas
    Quando o usuario preenche o campo username com <Username> e o campo password com <Password>
    Entao o sistema mostra a mensagem de erro: <Message>
    Exemplos:
      | Username    | Password               | Message                    |
      | "tomsmith"  | "invalido"             | "Your password is invalid" |
      | "joaozinho" | "SuperSecretPassword!" | "Your username is invalid" |
      | ""          | "SuperSecretPassword!" | "Username is required"     |
      | "tomsmith"  | ""                     | "Password is required"     |



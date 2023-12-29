#language: pt
  Funcionalidade: Grupo 4 Login

    Cenario: TC001 - Efetuar login com sucesso
      Dado que o usuario esteja na pagina de autenticacao
      Quando o usuario preencher os campos de com as credencias: "tomsmith" e "SuperSecretPassword!"
      E o usuario clique no botao login
      Entao o usuario deve ser redirecionado para a pagina Secure Area
      E o sistema deve exibir a mensagem "You logged into a secure area!"

    Cenario: TC002 - Tentativa de login com campo usuario vazio
      Dado que o usuario esteja na pagina de autenticacao
      Quando o usuario preencher os campos de com as credencias: "" e "SuperSecretPassword!"
      E o usuario clique no botao login
      Entao o usuario nao deve ser redirecionado para a pagina Secure Area
      E o sistema deve exibir a mensagem de erro "Your username is a required field!"

    Cenario: TC003 - Tentativa de login com campo senha vazio
      Dado que o usuario esteja na pagina de autenticacao
      Quando o usuario preencher os campos de com as credencias: "tomsmith" e ""
      E o usuario clique no botao login
      Entao o usuario nao deve ser redirecionado para a pagina Secure Area
      E o sistema deve exibir a mensagem de erro "Your password is a required field!"

    Cenario: TC004 - Tentativa de login com usuario nao cadastrado
      Dado que o usuario esteja na pagina de autenticacao
      Quando o usuario preencher os campos de com as credencias: "usuarioTeste" e "SuperSecretPassword!"
      E o usuario clique no botao login
      Entao o usuario nao deve ser redirecionado para a pagina Secure Area
      E o sistema deve exibir a mensagem de erro "Your username or password is invalid!"

    Cenario: TC005 - Tentativa de login com senha incorreta
      Dado que o usuario esteja na pagina de autenticacao
      Quando o usuario preencher os campos de com as credencias: "tomsmith" e "senha123"
      E o usuario clique no botao login
      Entao o usuario nao deve ser redirecionado para a pagina Secure Area
      E o sistema deve exibir a mensagem de erro "Your username or password is invalid!"



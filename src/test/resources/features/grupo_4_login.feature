#language: pt
  Funcionalidade: Login

    Cenario: TC001 - Efetuar login com sucesso
      Dado que o usuario esteja na pagina de autenticacao
      Quando o usuario preencher os campos de com as credencias: "tomsmith" e "SuperSecretPassword!"
      E o usuario clique no botão login
      Entao o usuario deve ser redirecionado para a pagina Secure Area
      E o sistema deve exibir a mensagem "You logged into a secure area!"

    Cenario: TC002 - Tentativa de login com campo usuario vazio
      Dado que o usuario esteja na pagina de autenticacao
      Quando o usuario preencher os campos de com as credencias: "" e "SuperSecretPassword!"
      E o usuario clique no botão login
      Entao o usuario nao deve ser redirecionado para a pagina Secure Area
      E o sistema deve exibir a mensagem "Your username is invalid!"

    Cenario: TC003 - Tentativa de login com campo senha vazio
      Dado que o usuario esteja na pagina de autenticacao
      Quando o usuario preencher os campos de com as credencias: "tomsmith" e ""
      E o usuario clique no botão login
      Entao o usuario nao deve ser redirecionado para a pagina Secure Area
      E o sistema deve exibir a mensagem "Your password is invalid!"

    Cenario: TC004 - Tentativa de login com usuario nao cadastrado
      Dado que o usuario esteja na pagina de autenticacao
      Quando o usuario preencher os campos de com as credencias: "usuarioTeste" e "SuperSecretPassword!"
      E o usuario clique no botão login
      Entao o usuario nao deve ser redirecionado para a pagina Secure Area
      E o sistema deve exibir a mensagem "Your username is invalid!"

    Cenario: TC005 - Tentativa de login com senha incorreta
      Dado que o usuario esteja na pagina de autenticacao
      Quando o usuario preencher os campos de com as credencias: "tomsmith" e "senha123"
      E o usuario clique no botão login
      Entao o usuario nao deve ser redirecionado para a pagina Secure Area
      E o sistema deve exibir a mensagem "Your password is invalid!"

    Cenario: TC006 - Acessar pagina de login já logado no sistema
      Dado que o usuario esteja logado no sistema
      Quando o usuario acessar a página de login
      Entao o usuario nao deve permanecer na pagina Secure Area



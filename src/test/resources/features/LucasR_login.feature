#language: pt
Funcionalidade: Login

  @resetBrowser
  Cenario: Login com sucesso
    Dado que o usuario esteja na tela de login
    Quando o usuario preeche Username com "demouser"
    E o usuario preenche Password com "abc123"
    E o usuario clica no botao login
    Entao sistema deve apresentar lista de invoice

  @resetBrowser
  Cenario: Login com username incorreto
    Dado que o usuario esteja na tela de login
    Quando o usuario preeche Username com "Demouser"
    E o usuario preenche Password com "abc123"
    E o usuario clica no botao login
    Entao sistema deve apresentar alerta com a mensagem Wrong username or password

  @resetBrowser
  Cenario: Login com password incorreto
    Dado que o usuario esteja na tela de login
    Quando o usuario preeche Username com "demouser"
    E o usuario preenche Password com "nananana"
    E o usuario clica no botao login
    Entao sistema deve apresentar alerta com a mensagem Wrong username or password



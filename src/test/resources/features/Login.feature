#language: pt
Funcionalidade: Login

  Cenario: Login com sucesso
    Dado que o usuario esteja na tela de login
    Quando o usuario preeche Username com "demouser"
    E o usuario preenche Password com "abc123"
    E o usuario clica no botao login
    Entao sistema deve apresentar lista de invoice

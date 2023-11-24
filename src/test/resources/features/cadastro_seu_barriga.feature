#language: pt
Funcionalidade: Cadastro

  Cenario: Cadastro usuário com sucesso
    Dado que o usuario esteja na tela de cadastro
    Quando o usuario preeche campos obrigatorios com dados validos
    E o usuario clica no botao Cadastrar
    Entao o sistema redireciona o usuario para a tela de login
    E o usuario deve visualizar mensagem de "Usuário inserido com sucesso"

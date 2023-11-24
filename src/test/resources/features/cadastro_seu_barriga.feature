#language: pt
Funcionalidade: Cadastro

  Cenario: Cadastro usuario com sucesso
    Dado que o usuario esteja na tela de cadastro
    Quando o usuario preeche campos obrigatorios com dados validos
    E o usuario clica no botao Cadastrar
    Entao o sistema redireciona o usuario para a tela de login
    E o usuario deve visualizar mensagem de "Usuário inserido com sucesso"

  Cenario: Cadastro usuario com email vinculado a outra conta
    Dado que o usuario esteja na tela de cadastro
    Quando o usuario preeche campos obrigatorios com dados validos informando email vinculado a outra conta
    E o usuario clica no botao Cadastrar
    Entao o sistema redireciona o usuario para a tela de login
    E o usuario deve visualizar mensagem de "Endereço de email já utilizado"

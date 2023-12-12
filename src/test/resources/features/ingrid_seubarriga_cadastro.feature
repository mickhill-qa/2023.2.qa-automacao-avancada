#language: pt
Funcionalidade: Cadastro de usuario

  Cenario: Cadastro com sucesso
      Dado que o usuario esta na pagina de cadastro
      Quando o usuario preencher "Ingrid3" no campo nome
      E preencher "ingrid3@gmail.com" no campo email
      E preencher "Ab@123" no campo senha
      E o usuario clica no botao CADASTRAR
      Entao o sistema mostra a mensagem "Usuário inserido com sucesso"

    Cenario: Cadastro com erro
      Dado que o usuario esta na pagina de cadastro
      Quando o usuario preencher "Ingrid3" no campo nome
      E preencher "ingrid3@gmail.com" no campo email
      E deixa o campo senha vázio
      E o usuario clica no botao CADASTRAR
      Entao o sistema mostra a mensagem de erro "Senha é um campo obrigatório"

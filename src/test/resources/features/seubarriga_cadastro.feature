#language: pt

  Funcionalidade: Seu barriga cadastro
    Cenario: Cadastrar usuario sucesso
      Dado que o usuario esta na pagina de cadastro
      Quando o usuario preeche campo nome
      E o usuario preeche campo email
      E o usuario preeche campo senha
      E o usuario clica no botao CADASTRAR
      Entao o sistema apresentara a mensagem "Usuário inserido com sucesso"

    Cenario: cadastrar usuario sem nome
      Dado que o usuario esta na pagina de cadastro
      Quando o usuario preeche campo email
      E o usuario preeche campo senha
      E o usuario clica no botao CADASTRAR
      Entao o sistema apresentara a mensagem "Nome é um campo obrigatório"
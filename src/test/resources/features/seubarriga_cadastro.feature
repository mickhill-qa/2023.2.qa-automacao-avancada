#language: pt
  Funcionalidade: Cadastro Seu Barriga

    Cenario: Cadastro Sucesso
      Dado que o usuario acessa a pagina de cadastro
      Quando o usuario preenche os campos com dados validos
      E o usuario clica em Cadastrar
      Então a pagina informa a mensagem "Usuário inserido com sucesso"
#language: pt
  Funcionalidade: Login Sucesso

    Cenario: Login Sucesso
      Dado que o usuario acessa a pagina de login
      Quando o usuario preenche os campos com dados validos
      E o usuario clica em Entrar
      Então a pagina informa a mensagem "Bem vindo, Herlon!"
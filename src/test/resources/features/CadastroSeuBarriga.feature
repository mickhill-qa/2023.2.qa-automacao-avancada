#language: pt
Funcionalidade: Cadastro Seu Barriga

    Cenario: Cadastro com sucesso
      Dado que o usuario esta na pagina de cadastro
      E o usuario preeche os campos Email e Senha
      Quando o usuario clica no botao CADASTRAR
      Entao o sistema mostra uma mensagem de sucesso


    Cenario: Cadastro sem preencher os campos obrigatorios
      Dado que o usuario esta na pagina de cadastro
      Quando o usuario clica no botao CADASTRAR
      Entao o sistema mostra uma mensagem de erro informando os campos obrigatorios

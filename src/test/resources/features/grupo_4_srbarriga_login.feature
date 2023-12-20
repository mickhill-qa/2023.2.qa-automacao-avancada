#language: pt

  Funcionalidade: Grupo 4 Login

    Contexto:
      Dado que o usuario esta na pagina de login

    Cenario: Login sucesso
      Quando o usuario preenche o email "testegrupo4@gmail.com"
      E o usuario preeche a senha "teste123"
      E aperta o botao de entrar
      Entao ele redireciona para pagina incial

    Cenario: Login de sucesso apertando Enter
      Quando o usuario preenche o email "testegrupo4@gmail.com"
      E o usuario preeche a senha "teste123"
      E aperta a tecla enter
      Entao ele redireciona para pagina incial

    Cenario: Login email vazia
      Quando o usuario preenche o email ""
      E o usuario preeche a senha "teste123"
      E aperta o botao de entrar
      Entao ele exibe a mensagem de erro "Email é um campo obrigatório"

    Cenario: Login com email correto e senha vazia
      Quando o usuario preenche o email "testegrupo4@gmail.com"
      E o usuario preeche a senha ""
      E aperta o botao de entrar
      Entao ele exibe a mensagem de erro "Senha é um campo obrigatório"

    Cenario: Login email incorreto e senha correta
      Quando o usuario preenche o email "emailerrado@gmail.com"
      E o usuario preeche a senha "teste123"
      E aperta o botao de entrar
      Entao ele exibe a mensagem de erro "Usuário ou senha incorreto. Tente novamente."

    Cenario: Login com email correto senha incorreta
      Quando o usuario preenche o email "testegrupo4@gmail.com"
      E o usuario preeche a senha "senhaerrado"
      E aperta o botao de entrar
      Entao ele exibe a mensagem de erro "Usuário ou senha incorreto. Tente novamente."

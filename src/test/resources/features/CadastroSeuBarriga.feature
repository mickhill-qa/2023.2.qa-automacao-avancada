#language: pt
Funcionalidade: Cadastro Usuário no Site Seu Barriga

    Cenario: Fazer Cadastro com sucesso
        Dado que o usuario esta na pagina de cadastro
        Quando o usuario preeche o campo Usuário com "teste"
        E o usuario preeche o campo com Email com "teste101012@teste101012"
        E o usuario preeche o campo com Senha com "teste1234"
        Quando o usuario clica no botao Cadastrar
        Entao o sistema redireciona para a pagina de login
        E o sistema exibe uma mensagem Usuário inserido com sucesso

    Cenario: Fazer Cadastro com erro
        Dado que o usuario esta na pagina de cadastro
        Quando o usuario preeche o campo Usuário com "teste"
        E o usuario preeche o campo com Email com "teste100012@teste101012"
        E o usuario preeche o campo com Senha com "teste1234"
        Quando o usuario clica no botao Cadastrar
        Entao o sistema redireciona para a pagina de login
        E o sistema exibe uma mensagem de erro Endereço de email já utilizado



#language: pt
Funcionalidade: Cadastro Seu Barriga

    Cenario: Cadastro com email ja utilizado
        Dado que o usuario esta na pagina de cadastro "https://seubarriga.wcaquino.me/cadastro"
        Quando o usuario preenche o campo de email com um email ja cadastrado
        E preencher corretamente os demais campos
        E clicar no botao cadastrar
        Entao o sistema mostra uma mensagem de erro ao cadastrar


    Cenario: Cadastro com senha invalida
        Dado que o usuario esta na pagina de cadastro "https://seubarriga.wcaquino.me/cadastro"
        Quando o usuario preenche o campo de senha com uma senha invalida
        E preencher devidamente os demais campos
        E clicar no botao Cadastrar
        Entao o sistema mostra uma mensagem de erro ao cadastrar 2

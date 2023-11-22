#language: pt
Funcionalidade: Cadastro de Usuário

  Cenario: Cadastro com sucesso
    Dado que o usuario esta na pagina de cadastro
    Quando o usuario preeche o campo nome com "Marcela"
    E o usuario preeche o campo email com "marcela9@teste.com"
    E o usuario preeche o campo senha com "123456789"
    E o usuario clica no botao CADASTRAR
    Entao o sistema apresenta uma mensagem de sucesso

  Cenario: Cadastrar com o email em branco
    Dado que o usuario esta na pagina de cadastro
    Quando o usuario preeche o campo nome com "Marcela"
    E  o usuario não preeche o campo email com um email valido " "
    E o usuario preeche o campo senha com "123456789"
    E o usuario clica no botao CADASTRAR
    Entao o sistema apresenta uma mensagem de campo obrigatorio

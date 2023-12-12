#language: pt
Funcionalidade: Cadastro de Usuário

  Cenario: Cadastro com sucesso
    Dado que o usuario esta na pagina de cadastro
    Quando o usuario preenche o campo nome com um nome
    E o usuario preenche o campo email com um email
    E o usuario preenche o campo senha com uma senha
    E o usuario clica no botao CADASTRAR
    Entao o sistema apresenta uma mensagem de sucesso

  Cenario: Cadastrar com o email em branco
    Dado que o usuario esta na pagina de cadastro
    Quando o usuario preenche o campo nome com um nome
    E  o usuario não preeche o campo email com um email valido " "
    E o usuario preenche o campo senha com uma senha
    E o usuario clica no botao CADASTRAR
    Entao o sistema apresenta uma mensagem de campo obrigatorio

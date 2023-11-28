#language: pt
Funcionalidade: Cadastro Seu Barriga - ln

  Cenario: Cadastro com SUCESSO - ln
    Dado que o usuario esta na tela de cadastro, ln
    Quando o usuario preenche os campos obrigatorios com dados validos, ln
    E o usuario clica no botao Cadastrar, ln
    Entao o sistema exibi a mensagem "Usuário inserido com sucesso", ln

  Cenario: Cadastro campo de nome vazio - ln
    Dado que o usuario esta na tela de cadastro, ln
    Quando o usuario deixa o campo nome vazio, ln
    E o usuario preenche os campos email e senha com dados validos, ln
    E o usuario clica no botao Cadastrar, ln
    Entao o sistema exibi a mensagem "Nome é um campo obrigatório", ln

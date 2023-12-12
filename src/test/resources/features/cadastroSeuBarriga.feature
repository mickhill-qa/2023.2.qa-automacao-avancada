#language: pt
  @testandoCenarios
Funcionalidade: Cadastro no site "https://seubarriga.wcaquino.me/" para ter acesso aos recursos disponíveis

  Cenario: Tentar realizar cadastro com senha contendo apenas numeros
    Dado que o usuario acesse o site, renato
    Quando preencher os campos nome e email com dados validos, e o campo senha com dado invalido, renato
    E clicar no botao Cadastrar, renato
    Entao o sistema mostrara a mensagem "Senha invalida", renato

  Cenario: Tentar realizar cadastro com senha em branco
    Dado que o usuario acesse o site, renato
    Quando preencher os campos nome e email, deixar o campo senha em branco
    E clicar no botao Cadastrar, renato
    Entao o sistema mostrara a mensagem "Senha é um campo obrigatório", renato





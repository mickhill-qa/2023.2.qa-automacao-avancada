#language: pt

Funcionalidade: Cadastro no site "https://seubarriga.wcaquino.me/" para ter acesso aos recursos disponíveis

  Cenario: Tentar realizar cadastro com senha contendo apenas numeros

    Dado que o usuario acesse o site
    Quando preencher os campos nome , email , senha e clicar no botao Cadastrar
    Entao o sistema mostrara a mensagem de erro

  Cenario: Tentar realizar cadastro com senha em branco

    Dado que o usuario acesse o site
    Quando preencher os campos nome e email, deixar o campo senha em branco e clicar no botao Cadastrar
    Entao o sistema mostrara a mensagem de erro





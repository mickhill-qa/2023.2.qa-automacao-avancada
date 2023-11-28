#language: pt

Funcionalidade: Cadastro
  Como usuário do site "https://seubarriga.wcaquino.me/"
  Quero realizar o cadastro na plataforma
  Para ter acesso aos recursos disponíveis

  Cenario: Cadastro com Sucesso
    Dado que o usuario esteja na tela de Cadastro
    Quando o usuario preenche os dados necessarios para o cadastro com sucesso
    Entao o sistema mostrarar a mensagem "Usuário inserido com sucesso"

  Cenario: Cadastro com campo Nome em branco
    Dado que o usuario esteja na tela de Cadastro
    Quando o usuario preenche os campos Email e Senha e deixa o campo Nome em branco
    Entao o sistema mostrarar a mensagem "Nome é um campo obrigatório"

  Cenario: Cadastro com campo Email em branco
    Dado que o usuario esteja na tela de Cadastro
    Quando o usuario preenche os campos Nome e Senha e deixa o Email nome em branco
    Entao o sistema mostrarar a mensagem "Email é um campo obrigatório"

  Cenario: Cadastro com campo Senha em branco
    Dado que o usuario esteja na tela de Cadastro
    Quando o usuario preenche os campos Nome e Email e deixa o campo Senha nome em branco
    Entao o sistema mostrarar a mensagem "Senha é um campo obrigatório"

#language: pt
Funcionalidade: Cadastro Seu Barriga

  Cenario: Cadastro com sucesso
    Dado que o usuario esta na pagina do site seu barriga
    Quando o usuario preenche o campo Nome com "Luana Lins"
    E o usuario preenche o campo Email com uma conta valida "lulu012@banana"
    E o usuario informa uma senha valida com "123456"
    E usuario clica no botão cadastrar
    Entao o usuário deve ser redirecionado


  Cenario: Cadastro com campo nome vazio
    Dado que o usuario esta na pagina do site seu barriga
    Quando o usuario preenche o campo Email com uma conta valida sendo "lulu01@banana"
    E o usuario informa uma senha valida com "123456"
    E usuario clica no botão cadastrar
    Entao o usuario deve permanecer na pagina de cadastro
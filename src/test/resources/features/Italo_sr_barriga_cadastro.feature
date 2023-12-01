#language: pt
Funcionalidade: Italo/ Cadastro usuario site Sr Barriga

    Cenario: Email ja existente
      Dado que o usuario esta na pagina de cadastrar novo usuario no site "https://seubarriga.wcaquino.me/cadastro"
      Quando o usuario preenche os campo nome com "Leomar"
      E o campo email com "123@gmail.com"
      E o campo senha com "1234"
      E o usuario clica em Cadastrar
      Entao o sistema exibe a mensagem Email ja utilizado

  Cenario: Cadastro com sucesso
    Dado que o usuario esta na pagina de cadastrar novo usuario no site "https://seubarriga.wcaquino.me/cadastro"
    Quando o usuario preenche os campos obrigatorio com dados validos
    E o usuario clica em Cadastrar
    Entao o sistema exibi a mensagem "Usuário inserido com sucesso"



#language: pt
  Funcionalidade: Cadastro novo usuário
    Cenario: Cadastro com email já utilizado
      Dado que o usuario esta na pagina "https://seubarriga.wcaquino.me/cadastro"
      Quando o usuario preeche o campo nome com "Leomar" o campo email com "123@gmail.com" e o campo senha com "Li2#"
      E o usuario clica no botao Cadastrar
      Entao o sistema mostra uma mensangem que o email ja esta utilizado



#language: pt
Funcionalidade: Cadastro
  Como usuário do site "https://seubarriga.wcaquino.me/"
  Quero realizar o cadastro na plataforma
  Para ter acesso aos recursos disponíveis


  Cenario: Cadastro com sucesso
    Dado que o usuario esteja na tela de cadastros
    Quando o usuario preencher os campos "<nome>", "<email>", "<senha>" e clicar em cadastrar / Sucesso
    Entao o sistema mostrara a mensagem "Usuário inserido com sucesso"
#language: pt
Funcionalidade: Cadastro
  Como usuario do site https://seubarriga.wcaquino.me/cadastro
  Quero realizar o cadastro na plataforma
  Para ter acesso aos recursos disponiveis

  Cenario: Cadastro de Usuario com Sucesso
    Dado que o usuario esta na tela de cadastro
    Quando o usuario preenche os campos obrigatorios com dados validos
    E o usuario clica no botao Cadastrar
    Então sera apresentada a mensagem "Usuário inserido com sucesso"

  Cenario: Cadastro de Usuario com Invalido
    Dado que o usuario esta na tela de cadastro
    Quando o usuario preenche os campos obrigatorios com dados invalidos
    E o usuario clica no botao Cadastrar
    Então sera apresentada a mensagem "Usuário inválido"

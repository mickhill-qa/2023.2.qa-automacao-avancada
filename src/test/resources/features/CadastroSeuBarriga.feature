#language: pt
Funcionalidade: Cadastro seu barriga

  Cenario: Cadastro com sucesso
    Dado que o usuário esteja na tela de cadastro
    E preencha os campos obrigatorio com dados validos
    Quando clicar em "Cadastrar"
    Então a mensagem "Usuário inserido com sucesso" deve ser exibida

  Cenario: Cadastro com senha fora do padrão
    Dado que o usuário esteja na tela de cadastro
    E preencha o campo Nome e email com dados válidos
    E o campo Senha com valor fora do padrão
    Quando clicar em cadastrar
    Então a mensagem "Usuário inserido com sucesso" não deve ser exibida


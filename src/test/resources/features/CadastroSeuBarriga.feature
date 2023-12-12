#language: pt
Funcionalidade: Cadastro seu barriga

  Cenario: Cadastro com sucesso
    Dado que o usuario esteja na tela de cadastro
    Quando o usuario preencher os campos obrigatorio com dados validos
    E o usuario clicar em cadastrar
    Entao a mensagem "Usuário inserido com sucesso" deve ser exibida

  Cenario: Cadastro com senha fora do padrao
    Dado que o usuario esteja na tela de cadastro
    Quando o usuario preencher o campo Nome e email com dados validos
    E o campo Senha com valor fora do padrao
    E o usuario clicar em cadastrar
    Entao a mensagem "Usuário inserido com sucesso" não deve ser exibida


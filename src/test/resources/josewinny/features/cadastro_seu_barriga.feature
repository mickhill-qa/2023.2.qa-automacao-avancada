#language: pt
Funcionalidade: Seu Barriga Cadastro
#  Cenario: Cadastro com dados válidos
#    Dado que o usuario esta na pagina de cadastro e nao esta cadastrado
#    Quando preenche o campo nome com "Seu chico"
#    E preenche o campo email com "chico@gmail.com"
#    E preenche o campo senha com "Chico@123"
#    Entao o sistema exibe a mensagem de "Usuário inserido com sucesso"
  Cenario: Tentativa de cadastro sem preencher o nome
    Dado que o usuario esta na pagina de cadastro e nao esta cadastrado
    Quando nao preenche o campo nome
    E preenche o campo email com "chico@gmail.com"
    E preenche o campo senha com "Chico@123"
    Entao o sistema exibe a mensagem de "Usuário inserido com sucesso"
  Cenario: Tentativa de cadastro sem preencher a senha
    Dado que o usuario esta na pagina de cadastro e nao esta cadastrado
    Quando preenche o campo nome com "Seu chico"
    E preenche o campo email com "chico@gmail.com"
    E nao preenche o campo senha
    Entao o sistema exibe a mensagem de "Usuário inserido com sucesso"
  Cenario: Tentativa de cadastro sem preencher o email
    Dado que o usuario esta na pagina de cadastro e nao esta cadastrado
    Quando preenche o campo nome com "Seu chico"
    E nao preenche o campo email
    E preenche o campo senha com "Chico@123"
    Entao o sistema exibe a mensagem de "Email é um campo obrigatório"
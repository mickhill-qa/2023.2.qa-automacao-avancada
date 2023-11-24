#language: pt
Funcionalidade: Seu Barriga Cadastro
#  Cenario: Cadastro com dados válidos
#    Dado que o usuario esta na pagina de cadastro e nao esta cadastrado
#    Quando preenche o campo nome com "Seu chico"
#    E preenche o campo email com "chico@gmail.com"
#    E preenche o campo senha com "Chico@123"
#    Entao o sistema exibe a mensagem de "Usuário inserido com sucesso"
  Cenario: Tentativa de cadastro sem preencher o nome
  Cenario: Tentativa de cadastro sem preencher a senha
  Cenario: Tentativa de cadastro sem preencher o email
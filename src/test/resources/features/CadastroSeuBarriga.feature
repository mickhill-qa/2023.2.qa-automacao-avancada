#language: pt
Funcionalidade: Cadastro no Seu Barriga

  Cenario: Cadastro com sucesso
    Dado que estou no site do seu barriga
    Quando clico na aba novo usuario
    E preencho o campo nome
    E preencho o campo email com um email valido
    E preencho o campo senha com uma senha valida
    E clico em cadastrar
    Entao sou cadastrado no sistema

  Cenario: Cadastro com email invalido
    Dado que estou no site do seu barriga
    Quando clico na aba novo usuario
    E preencho o campo nome
    E preencho o campo email com um email invalido
    E preencho o campo senha com uma senha valida
    E clico em cadastrar
    Entao o sistema avisa que preciso de um email valido

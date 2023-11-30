#language: pt
Funcionalidade: Ivan_Alves - Cadastro de Usuario

    Cenario: Cadastrar usuário com sucesso - nome, email e senha válidos
        Dado que estou acessando a acessando página de cadastro do seubarriga.wcaquino.me
        Quando digitar nome completo "ivan alves"
        E digitar o email válido "teste13@gmail.com"
        E digitar Senha válida "1q2w3e!Q@W#E"
        E Clico em cadastrar
        Entao deve retornar mensagem "Usuário cadastrado com sucesso"
        

     Cenario: Cadastrar usuário com sucesso - nome, email e senha válidos
        Dado que estou acessando a página de cadastro do seubarriga.wcaquino.me
        Quando digitar nome completo ""
        E digitar o email válido "mariajosedesousa@hotmail.com"
        E digitar Senha válida "1q2w3e!Q@W#E"
        E Clico em cadastrar
        Entao deve retornar mensagem "Nome é um campo obrigatório"

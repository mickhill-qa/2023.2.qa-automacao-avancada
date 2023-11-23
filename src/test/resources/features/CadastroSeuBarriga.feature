#language: pt
Funcionalidade: Cadastro no site  https://seubarriga.wcaquino.me/cadastro
    Cenário: Cadastro informando todos os campo conforme itens obrigatorios
        Dado que o usuario esteja na pagina de cadastro do site do seu barriga
        E preencha os campos Nome, Email e Senha conforme as obrigatoriedades de cada campo
        E clique no botao cadastrar
        Entao devera aparecer uma mensagem informado que o cadastro foi realizado

    Cenário: Cadastro deixando o campo senha em branco
        Dado que o usuario esteja na pagina de cadastro do site seu barriga
        E preencha os campos Nome, Email
        E e deixe o campo Senha em branco
        E clique no botao cadastrar
        Entao devera aparecer uma mensagem informando que houve erro no cadastro
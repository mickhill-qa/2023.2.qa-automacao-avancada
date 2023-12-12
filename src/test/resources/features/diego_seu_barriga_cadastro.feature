#language: pt
Funcionalidade: Diego - Seu Barriga Cadastro
    Para que eu tenha acesso ao sistema do Seu barriga
    Sendo um inquilino do seu Barriga
    Posso realizar um cadastro utilizando Nome, Email e Senha

    Contexto:
        Dado que o usuario esta na pagina de cadastro

    Cenario: Cadastrar usuario com dados validos
        Quando o usuario preenche os campos com dados validos
        E o usuario clica no botao Cadastrar
        Entao o sistema deve exibir a mensagem "Usuário inserido com sucesso"

    Cenario: Cadastrar usuario sem nome
        Quando o usuario preenche os campos sem informar um nome
        E o usuario clica no botao Cadastrar
        Entao o sistema deve exibir a mensagem "Nome é um campo obrigatório"

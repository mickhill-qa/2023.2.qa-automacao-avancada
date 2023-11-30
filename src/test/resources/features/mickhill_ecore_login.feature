#language: pt
Funcionalidade: Mick Hill - Ecore Login

    Cenario: Login com Sucesso
        Dado que o usuario esta na pagina de autenticacao
        Quando o usuario prenecher as credenciais validas
        Entao o sistema redireciona para a lista de faturas

    Cenario: Login com Credenciais invalidas
        Dado que o usuario esta na pagina de autenticacao
        Quando o usuario prenecher as credenciais invalidas
        Entao o sistema mostra a mensagem de erro: "Wrong username or password"

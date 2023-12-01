#language: pt
Funcionalidade: login

  Cenario: login com sucesso
    Dado que o usuario esta na pagina de autenticação
    Quando o usuario preenche as credenciais validas
    Entao o sistema redireciona para lista de faturas

  Cenario: login com credenciais invalidas
    Dado que o usuario esta na pagina de autenticação
    Quando o usuario preenche as credenciais invalidas
    Entao o sistema mostra a mensagem de erro "Wrong username or password"
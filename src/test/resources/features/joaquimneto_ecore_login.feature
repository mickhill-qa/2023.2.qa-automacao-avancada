#language: pt

Funcionalidade: Ecore Login

  Cenario: Login com Sucesso
    Dado que o usuario esta na pagina de Login
    Quando o usuario prenecher as credenciais de login
    Entao o sistema redireciona para pagina lista de faturas

  Cenario: Login com Credenciais invalidas 1
    Dado que o usuario esta na pagina de Login
    Quando o usuario prenecher as credenciais "Demouser" e "abc123"
    Entao o sistema apresenta mensagem de erro: "Wrong username or password"

  Cenario: Login com Credenciais invalidas 2
    Dado que o usuario esta na pagina de Login
    Quando o usuario prenecher as credenciais "demouser_" e "xyz"
    Entao o sistema apresenta mensagem de erro: "Wrong username or password"


  Cenario: Login com Credenciais invalidas 3
    Dado que o usuario esta na pagina de Login
    Quando o usuario prenecher as credenciais "Demouser" e "nananana"
    Entao o sistema apresenta mensagem de erro: "Wrong username or password"


  Cenario: Login com Credenciais invalidas 4
    Dado que o usuario esta na pagina de Login
    Quando o usuario prenecher as credenciais "Demouser" e "abc123"
    Entao o sistema apresenta mensagem de erro: "Wrong username or password"

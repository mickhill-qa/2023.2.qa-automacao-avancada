#language: pt
@ecore_login
@resetBrowser
Funcionalidade: Lucas Norte - Ecore Login

  Contexto:
    Dado que o usuario esta na pagina de autenticacao

  Cenario: Login com Sucesso
    Quando o usuario prenecher as credenciais "demouser" e "abc123"
    Entao o sistema redireciona para a lista de faturas

    Esquema do Cenario: Login com Credenciais invalidas
      Quando o usuario prenecher as credenciais <Username> e <Password>
      Entao o sistema mostra a mensagem de erro: "Wrong username or password."
      Exemplos:
        | Username    | Password   |
        | "Demouser"  | "abc123"   |
        | "demouser_" | "xyz"      |
        | "demouser"  | "nananana" |
        | "demouser"  | "abc123"   |

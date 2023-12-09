#language: pt
@ecore_invoice_details
@resetBrowser
Funcionalidade:  Italo - Login Ecore

  Contexto:
    Dado que o usuario esta na pagina de login

  Cenario: Login com Sucesso
    Quando o usuario preencher as credenciais "demouser" e "abc123"
    Entao o sistema encaminha para a lista de faturas

  Esquema do Cenario: Login com Credenciais invalidas
    Quando o usuario prenecher as credenciais <Username> e <Password>
    Entao o sistema exibe a mensagem de erro: "Wrong username or password."
    Exemplos:
      | Username    | Password   |
      | "Demouser"  | "abc123"   |
      | "demouser_" | "xyz"      |
      | "demouser"  | "nananana" |
      | "demouser"  | "abc123"   |
#language: pt
Funcionalidade: José Winny - Ecore Login

  Contexto:
    Dado que um usuario esta na pagina de autenticacao

  Cenario: Login com Sucesso
    Quando preenche as credenciais "demouser" e "abc123"
    Entao o sistema redireciona para a Invoice List

  @resetBrowser
  Esquema do Cenario: Login com Credenciais invalidas
    Quando preenche as credenciais <Username> e <Password>
    Entao o sistema exibe a mensagem de erro: "Wrong username or password."
    Exemplos:
      | Username    | Password   |
      | "Demouser"  | "abc123"   |
      | "demouser_" | "xyz"      |
      | "demouser"  | "nananana" |

# language: pt

Funcionalidade: Sandro Augusto -  Ecore Login

  Cenario: Login com Sucesso
    Dado que o usuario esta na pagina de Login
    Quando o usuario preenhcer com o "demouser" e "abc123"
    Entao o sistema redireciona para "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account"

  @resetBrowser
  Esquema do Cenario: Testes de Login invalido
    Dado que o usuario esta na pagina de Login
    Quando o usuario preenhcer o "<username>" e "<password>"
    Entao o sistema ira exibir a mensagem "Wrong username or password."

    Exemplos:
      | username  | password |
      | Demouser  | abc123   |
      | demouser_ | xyz      |
      | demouser  | nananana |

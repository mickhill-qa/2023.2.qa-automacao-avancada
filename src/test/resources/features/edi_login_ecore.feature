#language: pt
@ecore_invoice_details
@resetBrowser
Funcionalidade: Login ecore

  Contexto:
    Dado que o usuario esta na pagina de login

  Cenario: TC001 - Login (Positive) - ecore
    Quando o usuario preencher os campos "demouser" e "abc123"
    E o usuario clicar no botao login
    Entao o aplicativo deve redirecionar o usuario para a pagina Lista de faturas

  Esquema do Cenario: TC002 - Login (Negative) - ecore
    Quando o usuario preencher os campos "<Username>" e "<Password>"
    E o usuario clicar no botao login
    Entao o sistema mostrara a mensagem de alerta "Wrong username or password."
    Exemplos:
      | Username  | Password |
      | Demouser  | abc123   |
      | demouser_ | xyz      |
      | demouser  | nananana |


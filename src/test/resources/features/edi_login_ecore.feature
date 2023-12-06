#language: pt
@resetBrowser
Funcionalidade: Login ecore

  Contexto:
    Dado que o usuario esta na pagina de login

  Cenario: TC001 - Login (Positive) - ecore
    Quando o usuario preenche o login com credenciais validas
    E o usuario clicar no botao login
    Entao o aplicativo deve redirecionar o usuario para a pagina Lista de faturas

  Esquema do Cenario: TC002 - Login (Negative) - ecore
    Quando o usuario preencher os campos "<Username>", "<Password>" com credenciais invalidas
    E o usuario clicar no botao Login
    Entao o sistema mostrara a mensagem de alerta "Wrong username or password."
    Exemplos:
      | Username  | Password |
      | Demouser  | abc123   |
      | demouser_ | xyz      |
      | demouser  | nananana |
      | demouser  | abc123   |


#language: pt

Funcionalidade: Login ecore

  Contexto:
    Dado que o usuario esta na pagina de login

  Cenario: Login com sucesso
    Quando preencher os campos "<Username>", "<Password>" com credenciais valida
    E clicar no botao login
    Entao o aplicativo deve redirecionar o usuario para a pagina Lista de faturas

  Esquema do Cenario: Login invalidos
    Quando preencher os campos "<Username>", "<Password>" com credenciais invalidas
    E clicar no botao Login
    Entao o sistema mostrara a mensagem de alerta "<Mensagem>"
    Exemplos:
      | Username  | Password | Mensagem                    |
      | Demouser  | abc123   | Wrong username or password. |
      | demouser_ | xyz      | Wrong username or password. |
      | demouser  | nananana | Wrong username or password. |
      | demouser  | abc123   | Wrong username or password. |

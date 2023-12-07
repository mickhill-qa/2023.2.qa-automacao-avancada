#language: pt
@ecore_login
@resetBrowser
  Funcionalidade: Yohans - Ecore Login

    Contexto:
        Dado que o usuario esta na pagina de login

    Cenario: Login com sucesso
        Quando o usuario preencher os campos com "demouser" e "abc123"
        Entao o sistema redireciona para a pagina de lista de faturas


    Esquema do Cenario: Login com valores invalidos
        Quando o usuario preencher os campos com <Username> e <Password>
        Entao o sistema mostra a mensagem de erro "Wrong username or password."
        Exemplos:
            | Username    | Password   |
            | "Demouser"  | "abc123"   |
            | "demouser_" | "xyz"      |
            | "demouser"  | "nananana" |
            | "demouser"  | "abc123"   |
#language: pt
Funcionalidade: Login
   Cenário: Login com sucesso
        Dado que o usuario esta na pagina de login
        Quando o usuario insere "demouser" no campo de usuario
        E insere "abc123" no campo senha
        E o usuario clicar no botao LOGIN
        Entao o sistema mostra uma lista de faturas

   @resetBrowser
   Esquema do Cenário: Login com Erro
        Dado que o usuario esta na pagina de login
        Quando o usuario insere "<usuario>" no campo de usuario
        E insere "<senha>" no campo senha
        E o usuario clicar no botao LOGIN
        Entao o sistema mostra uma mensagem de erro "Wrong username or password."

        Exemplos:
        |usuario  |senha    |
        |Demouser |abc123   |
        |demouser_|xyz      |
        |demouser |nananana |




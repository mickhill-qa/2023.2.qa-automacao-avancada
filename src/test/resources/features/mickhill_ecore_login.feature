#language: pt
Funcionalidade: Mick Hill - Ecore Login
    Analise e Modelage: Plano de testes
    Excecucao de testes: Scrips e Evidencias
    Apresentacao / Demo: Report de Teste e Report de Bug
    Automacao de testes...
        Trazer o Plano e os Scripts para o Projeto
        Gerar o CODE dos steps do script de automacao
        Mapear objetos de tela

    Cenario: Login com Sucesso
        Dado que o usuario esta na pagina de autenticacao
        Quando o usuario prenecher as credenciais "demouser" e "abc123"
        Entao o sistema redireciona para a lista de faturas

    Esquema do Cenario: Login com Credenciais invalidas
        Dado que o usuario esta na pagina de autenticacao
        Quando o usuario prenecher as credenciais <Username> e <Password>
        Entao o sistema mostra a mensagem de erro: "Wrong username or password."
        Exemplos:
            | Username    | Password   |
            | "Demouser"  | "abc123"   |
            | "demouser_" | "xyz"      |
            | "demouser"  | "nananana" |
            | "demouser"  | "abc123"   |

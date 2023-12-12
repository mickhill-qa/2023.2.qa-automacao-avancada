#language: pt
@ecore_login
@resetBrowser
  Funcionalidade: Alex - Login Ecore
    Analise e Modelage: Plano de testes
    Excecucao de testes: Scrips e Evidencias
    Apresentacao / Demo: Report de Teste e Report de Bug
    Automacao de testes...
          Trazer o Plano e os Scripts para o Projeto
          Gerar o CODE dos steps do script de automacao
          Mapear objetos de tela

    Contexto:
      Dado que o usuario esta na pagina de login

    Cenario: Login Sucesso
      Quando o usuario preencher as credenciais "demouser" e "abc123"
      Entao o sistema encaminha para lista de faturas

    Esquema do Cenario: Login com Dados Invalidos
      Quando o usuario preencher as credenciais <Username> e <Password>
      Entao o sistema aparece a mensagem de erro: "Wrong username or password."
      Exemplos:
        | Username    | Password   |
        | "Demouser"  | "abc123"   |
        | "demouser_" | "xyz"      |
        | "demouser"  | "nananana" |
        | "demouser"  | "abc123"   |
#language: pt
@lucasnorte
@resetBrowser
Funcionalidade: Lucas Norte - TC003 - Validate invoice details

  Cenario: Validar Invoice Details, ln
    Dado que o usuario esta na pagina de login
    Quando o usuario preencher as credenciais "demouser" e "abc123"
    E o sistema encaminha para a lista de faturas
    Quando o cliente clica no Invoice Link, ln
    E o sistama exibe a pagina Invoice Details, ln
    Entao a pagina Invoice Details exibe o campo Hotel Name com "Rendezvous Hotel", ln



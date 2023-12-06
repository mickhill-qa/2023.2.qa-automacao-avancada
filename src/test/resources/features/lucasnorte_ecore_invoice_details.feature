#language: pt
@resetBrowser
Funcionalidade: Lucas Norte - TC003 - Validate invoice details

  Cenario: Validar Invoice Details, ln
    Dado que o usuario esta na pagina de autenticacao, ln
    E o usuario prenecher as credenciais "demouser" e "abc123", ln
    E o sistema redireciona para a lista de faturas, ln
    Quando o cliente clicar no Invoice Link, ln
    E o sistama exibe a pagina Invoice Details, ln
    Entao a pagina Invoice Details exibe o campo Hotel Name com "Rendezvous Hotel", ln
    E a pagina Invoice Details exibe o campo Invoice Date com "", ln
    E a pagina Invoice Details exibe o campo Due Date com "", ln
    E a pagina Invoice Details exibe o campo Invoice Number com "", ln
    E a pagina Invoice Details exibe o campo Booking Code com "", ln
    E a pagina Invoice Details exibe o campo Customer Details com "", ln
    E a pagina Invoice Details exibe o campo Room com "", ln
    E a pagina Invoice Details exibe o campo Check In com "", ln
    E a pagina Invoice Details exibe o campo Check Out com "", ln
    E a pagina Invoice Details exibe o campo Total Stay Count com "", ln
    E a pagina Invoice Details exibe o campo Total Stay Amount com "", ln
    E a pagina Invoice Details exibe o campo Deposit Now com "", ln
    E a pagina Invoice Details exibe o campo Tax & VATe com "", ln
    E a pagina Invoice Details exibe o campo Total Amount com "", ln


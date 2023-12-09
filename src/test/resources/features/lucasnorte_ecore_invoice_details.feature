#language: pt
@resetBrowser
Funcionalidade: Lucas Norte - TC003 - Validate invoice details

  Cenario: Validar Invoice Details, ln
    Dado que o usuario esta na pagina de login
    Quando o usuario preencher as credenciais "demouser" e "abc123"
    E o sistema encaminha para a lista de faturas
    Quando o cliente clica no Invoice Link, ln
    E o sistama exibe a pagina Invoice Details, ln
    Entao a pagina Invoice Details exibe o campo Hotel Name com "Rendezvous Hotel", ln
    E a pagina Invoice Details exibe o campo Invoice Date com "14/01/2018", ln
    E a pagina Invoice Details exibe o campo Due Date com "15/01/2018", ln
    E a pagina Invoice Details exibe o campo Invoice Number com "110", ln
    E a pagina Invoice Details exibe o campo Booking Code com "0875", ln
    E a pagina Invoice Details exibe o campo Customer Details com "JOHNY", ln
    E a pagina Invoice Details exibe o campo Room com "Superior Double", ln
    E a pagina Invoice Details exibe o campo Check In com "14/01/2018", ln
    E a pagina Invoice Details exibe o campo Check Out com "15/01/2018", ln
    E a pagina Invoice Details exibe o campo Total Stay Count com "1", ln
    E a pagina Invoice Details exibe o campo Total Stay Amount com "$150", ln
    E a pagina Invoice Details exibe o campo Deposit Now com "USD $20.90", ln
    E a pagina Invoice Details exibe o campo Tax & VATe com "USD $19", ln
    E a pagina Invoice Details exibe o campo Total Amount com "USD $209", ln



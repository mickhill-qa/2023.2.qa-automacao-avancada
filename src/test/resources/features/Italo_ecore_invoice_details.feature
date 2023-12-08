#language: pt
@resetBrowser
Funcionalidade: Italo Invoice Details

  Cenario: Validar Invoice Details, ln
    Dado que o usuario esta na pagina de login
    E o usuario preencher as credenciais "demouser" e "abc123"
    E o sistema encaminha para a lista de faturas
    Quando o usuario clicar no Invoice Link
    E o sistama mostra a pagina Invoice Details
    Entao a pagina Invoice Details mostra o campo Hotel Name com "Rendezvous Hotel"
    E a pagina Invoice Details mostra o campo Invoice Date com ""
    E a pagina Invoice Details mostra o campo Hotel Name com {string} o campo Due Date com ""
    E a pagina Invoice Details mostra o campo Invoice Number com ""
    E a pagina Invoice Details mostra o campo Booking Code com ""
    E a pagina Invoice Details mostra o campo Customer Details com ""
    E a pagina Invoice Details mostra o campo Room com ""
    E a pagina Invoice Details mostra o campo Check In com ""
    E a pagina Invoice Details mostra o campo Check Out com ""
    E a pagina Invoice Details mostra o campo Total Stay Count com ""
    E a pagina Invoice Details mostra o campo Total Stay Amount com ""
    E a pagina Invoice Details mostra o campo Deposit Now com ""
    E a pagina Invoice Details mostra o campo Tax & VATe com ""
    E a pagina Invoice Details mostra o campo Total Amount com ""
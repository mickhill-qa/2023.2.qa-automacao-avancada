#language: pt
Funcionalidade: Mick Hill - Ecore Invoice Details

  Cenario: Validar Invoice Details
    Dado que o usuario esta na pagina de autenticacao
    Quando o usuario prenecher as credenciais validas
    Entao o sistema redireciona para a lista de faturas
    Quando o clinete clicar no Invoice Link
    Quando o sistama exibe a pagina Invoice Details
    Entao a pagina Invoice Details exibe o campo Hotel Name com ""
    E a pagina Invoice Details exibe o campo Invoice Date com ""
    E a pagina Invoice Details exibe o campo Due Date com ""
    E a pagina Invoice Details exibe o campo Invoice Number com ""
    E a pagina Invoice Details exibe o campo Booking Code com ""
    E a pagina Invoice Details exibe o campo Customer Details com ""
    E a pagina Invoice Details exibe o campo Room com ""
    E a pagina Invoice Details exibe o campo Check In com ""
    E a pagina Invoice Details exibe o campo Check Out com ""
    E a pagina Invoice Details exibe o campo Total Stay Count com ""
    E a pagina Invoice Details exibe o campo Total Stay Amount com ""
    E a pagina Invoice Details exibe o campo Deposit Now com ""
    E a pagina Invoice Details exibe o campo Tax & VATe com ""
    E a pagina Invoice Details exibe o campo Total Amount com ""


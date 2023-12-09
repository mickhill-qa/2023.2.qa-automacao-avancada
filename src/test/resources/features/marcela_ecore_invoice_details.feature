#language: pt
@ecore_invoice_details
@resetBrowser
Funcionalidade: Marcela - Ecore Invoice Details

  Cenario: Validar Invoice Details
    Dado que o usuario esta na pagina de autenticacao
    Quando o usuario preenche as credenciais validas
    Entao o sistema redireciona o usuario para a lista de faturas
    Quando o cliente clicar no Invoice Link
    Quando o sistema exibe a pagina Invoice Details
    Entao a pagina Invoice Details exibe o campo Hotel Name com "Rendezvous Hotel"
    E a pagina Invoice Details exibe o campo Invoice Date
    E a pagina Invoice Details exibe o campo Due Date
    E a pagina Invoice Details exibe o campo Invoice Number com "Invoice #110 details"
    E a pagina Invoice Details exibe o campo Booking Code com "0875"
    E a pagina Invoice Details exibe o campo Customer Details
    E a pagina Invoice Details exibe o campo Room com "Superior Double"
    E a pagina Invoice Details exibe o campo Check In com "14/01/2018"
    E a pagina Invoice Details exibe o campo Check Out com "15/01/2018"
    E a pagina Invoice Details exibe o campo Total Stay Count com "1"
    E a pagina Invoice Details exibe o campo Total Stay Amount com "$150"
    E a pagina Invoice Details exibe o campo Deposit Nowt com "USD $20.90"
    E a pagina Invoice Details exibe o campo Tax & VAT com "USD $19"
    E a pagina Invoice Details exibe o campo Total Amount com "USD $209"


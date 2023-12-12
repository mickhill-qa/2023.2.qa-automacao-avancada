#language: pt
@ecore_invoice_details
@resetBrowser
Funcionalidade: Mick Hill - Ecore Invoice Details

    Cenario: Validar Invoice Details
        Dado que o usuario esta na pagina de autenticacao
        E o usuario prenecher as credenciais "demouser" e "abc123"
        E o sistema redireciona para a lista de faturas
        Quando o cliente clicar no Invoice Link
        E o sistama exibe a pagina Invoice Details
        Entao a pagina Invoice Details exibe o campo Hotel Name com "Rendezvous Hotel"
        E a pagina Invoice Details exibe o campo Invoice Date com "Invoice Date: 14/01/2018"
        E a pagina Invoice Details exibe o campo Due Date com "Due Date: 15/01/2018"
        E a pagina Invoice Details exibe o campo Invoice Number com "Invoice #110 details"
        E a pagina Invoice Details exibe o campo Booking Code com "0875"
        E a pagina Invoice Details exibe o campo Customer Details com "JOHNY SMITH"
        E a pagina Invoice Details exibe o campo Room com "Superior Double"
        E a pagina Invoice Details exibe o campo Check In com "14/01/2018"
        E a pagina Invoice Details exibe o campo Check Out com "15/01/2018"
        E a pagina Invoice Details exibe o campo Total Stay Count com "1"
        E a pagina Invoice Details exibe o campo Total Stay Amount com "$150"
        E a pagina Invoice Details exibe o campo Deposit Now com "USD $20.90"
        E a pagina Invoice Details exibe o campo Tax & VATe com "USD $19"
        E a pagina Invoice Details exibe o campo Total Amount com "USD $209"


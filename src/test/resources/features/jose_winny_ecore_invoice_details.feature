#language: pt
Funcionalidade: José Winny - Ecore Invoice Details

  Cenario: Validar Invoice Details - Rendezvous Hotel
    Dado que um usuario esta na pagina de autenticacao
    E preenche as credenciais validas
    E o sistema redireciona para a Invoice List
    Quando clica no Invoice Link
    Quando o sistema exibe a pagina Invoice Details
    Entao a pagina Invoice Details exibe o campo Hotel Name com "Rendezvous Hotel"
    E a pagina Invoice Details exibe o campo Invoice Number com "#110"
    E a pagina Invoice Details exibe o campo Invoice Date com "14/01/2018"
    E a pagina Invoice Details exibe o campo Due Date com "15/01/2018"
    E a pagina Invoice Details exibe o campo Booking Code com "0875"
    E a pagina Invoice Details exibe o campo Room com "Superior Double"
    E a pagina Invoice Details exibe o campo Total Stay Count com "1"
    E a pagina Invoice Details exibe o campo Total Stay Amount com "$150"
    E a pagina Invoice Details exibe o campo Check In com "14/01/2018"
    E a pagina Invoice Details exibe o campo Check Out com "15/01/2018"
    E a pagina Invoice Details exibe o campo Customer Details com "JOHNY SMITH", "R2, AVENUE DU MAROC" e "123456"
    E a pagina Invoice Details exibe o campo Deposit Now com "USD $20.90"
    E a pagina Invoice Details exibe o campo Tax & VATe com "USD $19"
    E a pagina Invoice Details exibe o campo Total Amount com "USD $209"


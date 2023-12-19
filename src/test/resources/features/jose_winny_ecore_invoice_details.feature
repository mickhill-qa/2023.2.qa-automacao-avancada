#language: pt
Funcionalidade: José Winny - Ecore Invoice Details

  Contexto:
    Dado que um usuario esta na pagina de autenticacao
    E preenche as credenciais validas
    E o sistema redireciona para a Invoice List

  Cenario: Validar Invoice Details - Rendezvous Hotel
    Quando o usuario clica no Invoice Link
    Entao o sistema exibe a Invoice Details
    E a Invoice Details exibe o campo Hotel Name com "Rendezvous Hotel"
    E a Invoice Details exibe o campo Invoice Number com "#110"
    E a Invoice Details exibe o campo Invoice Date com "14/01/2018"
    E a Invoice Details exibe o campo Due Date com "15/01/2018"
    E a Invoice Details exibe o campo Booking Code com "0875"
    E a Invoice Details exibe o campo Room com "Superior Double"
    E a Invoice Details exibe o campo Total Stay Count com "1"
    E a Invoice Details exibe o campo Total Stay Amount com "$150"
    E a Invoice Details exibe o campo Check In com "14/01/2018"
    E a Invoice Details exibe o campo Check Out com "15/01/2018"
    E a Invoice Details exibe o campo Customer Details com "JOHNY SMITH", "R2, AVENUE DU MAROC" e "123456"
    E a Invoice Details exibe o campo Deposit Now com "USD $20.90"
    E a Invoice Details exibe o campo Tax & VATe com "USD $19"
    E a Invoice Details exibe o campo Total Amount com "USD $209"


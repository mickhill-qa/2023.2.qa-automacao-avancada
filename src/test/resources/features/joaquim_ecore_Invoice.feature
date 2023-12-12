# new feature
# Tags: optional
#language: pt


Funcionalidade: Ecore Login

  Cenario: Lista de faturas
    Dado que o usuario esta na pagina de Login
    Quando o usuario prenecher as credenciais de login
    Quando o usuário clica em Invoice Details
    Quando o sistama exibe a pagina Invoice Details
    Entao a pagina Invoice Details exibe o campo Hotel Name com "Rendezvous Hotel"
    E a pagina Invoice Details exibe o campo Invoice Date com "14/01/2018"
    E a pagina Invoice Details exibe o campo Due Date com "15/01/2018"
    E a pagina Invoice Details exibe o campo Invoice Number com "110"
    E a pagina Invoice Details exibe o campo Booking Code com "0875"
    E a pagina Invoice Details exibe o campo Customer Details com "JOHNY SMITH","R2, AVENUE DU MAROC", "123456"
    E a pagina Invoice Details exibe o campo Room com "Superior Double"
    E a pagina Invoice Details exibe o campo Check In com "14/01/2018"
    E a pagina Invoice Details exibe o campo Check Out com "15/01/2018"
    E a pagina Invoice Details exibe o campo Total Stay Count com "1"
    E a pagina Invoice Details exibe o campo Total Stay Amount com "$150"
    E a pagina Invoice Details exibe o campo Deposit Now com "USD $20.90"
    E a pagina Invoice Details exibe o campo Tax & VATe com "USD $19.00"
    E a pagina Invoice Details exibe o campo Total Amount com "USD $209.00"

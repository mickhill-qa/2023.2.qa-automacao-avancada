#language:pt
@ingrid_ecore_invoice_list
@resetBrowser
Funcionalidade: Lista de Invoice
    Cenário: Detalhes do Invoice
        Dado que o usuario logado esta na pagina de listagem de Invoice
        Quando o usuario clicar no link do hotel
        Entao o sistema redireciona o usuario para a pagina de detalhes
        E mostra "Rendezvous Hotel" no campo Hotel name
        E mostra "14/01/2018" no campo Invoice date
        E mostra "15/01/2018" no campo Due Date
        E mostra "110" no campo Invoice Number
        E mostra "0875" no campo Booking Code
        E mostra "JOHNY SMITH R2, AVENUE DU MAROC 123456" no campo Customer Details
        E mostra "Superior Double" no campo Room
        E mostra "1" no campo Total Stay Count
        E mostra "$150" no campo Total Stay Amount
        E mostra "14/01/2018" no campo Check In
        E mostra "15/01/2018" no campo Check Out
        E mostra "USD $20.90" no campo Deposit Now
        E mostra "USD $19.00" no campo Tax & VAT
        E mostra "USD $209.00" no campo Total Amount


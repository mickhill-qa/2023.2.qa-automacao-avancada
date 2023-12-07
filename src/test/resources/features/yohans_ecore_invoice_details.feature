#language: pt
    Funcionalidade: Yohans - Ecore Detail List

      Cenario: Validar dados da pagina Invoice Details
          Dado que o usuario esta na pagina de login
          E o usuario preencher os campos com "demouser" e "abc123"
          E o sistema redireciona para a pagina de lista de faturas
          Quando o usuario clicar no Invoice Link
          E o sistema exibi a pagina Invoice Details
          Entao a pagina Invoice-Details exibe o campo Hotel Name com "Rendezvous Hotel"
          E a pagina Invoice-Details exibe o campo Invoice Date com "14/01/2018"
          E a pagina Invoice-Details exibe o campo Due Date com "15/01/2018"
          E a pagina Invoice-Details exibe o campo Invoice Number com "110"
          E a pagina Invoice-Details exibe o campo Booking Code com "0875"
          E a pagina Invoice-Details exibe o campo Customer Details com "JOHN SMITH R2, AVENUE DU MAROC 123456"
          E a pagina Invoice-Details exibe o campo Room com "Superior Double"
          E a pagina Invoice-Details exibe o campo Check In com "14/01/2018"
          E a pagina Invoice-Details exibe o campo Check Out com "15/01/2018"
          E a pagina Invoice-Details exibe o campo Total Stay Count com "1"
          E a pagina Invoice-Details exibe o campo Total Stay Amount com "$150"
          E a pagina Invoice-Details exibe o campo Deposit Now com "USD $20.90"
          E a pagina Invoice-Details exibe o campo Tax & VATe com "USD $19.00"
          E a pagina Invoice-Details exibe o campo Total Amount com "USD $209.00"

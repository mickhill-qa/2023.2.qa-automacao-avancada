 #language: pt
 Funcionalidade: Detalhe Fatura

   Contexto:Login com sucesso
     Dado que o usuario esteja na tela de login
     Quando o usuario preeche Username com "demouser"
     E o usuario preenche Password com "abc123"
     E o usuario clica no botao login
     Entao sistema deve apresentar lista de invoice

   Cenario: Visualizar detalhe da Fatura
     Quando o usuario clicar detalhe da fatura
     E o sistema exibe a pagina Invoice Details
     Entao a pagina Invoice Details exibe o campo Hotel Name com "Rendezvous Hotel"
     E a pagina Invoice Details exibe o campo Invoice Date com "14/01/2018"
     E a pagina Invoice Details exibe o campo Due Date com "15/01/2018"
     E a pagina Invoice Details exibe o campo Invoice Number com "110"
     E a pagina Invoice Details exibe o campo Booking Code com " 0875"
     E a pagina Invoice Details exibe o campo Customer Details com "JOHNY SMITH, R2, AVENUE DU MAROC, 123456"
     E a pagina Invoice Details exibe o campo Room com "Superior Double"
     E a pagina Invoice Details exibe o campo Check In com "14/01/2018"
     E a pagina Invoice Details exibe o campo Check Out com "15/01/2018"
     E a pagina Invoice Details exibe o campo Total Stay Count com "1"
     E a pagina Invoice Details exibe o campo Total Stay Amount com "150"
     E a pagina Invoice Details exibe o campo Deposit Now com "20.90"
     E a pagina Invoice Details exibe o campo Tax & VATe com "19"
     E a pagina Invoice Details exibe o campo Total Amount com "209"



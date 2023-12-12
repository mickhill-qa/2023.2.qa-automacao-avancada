# language: pt

  Funcionalidade: Sandro Augusto -  Invoice Details

    Contexto:
      Dado que o usuario esta Logado

    Cenario: Invoice Details
      Dado que o usuario clique no primeiro link da coluna Invoice Link
      Quando o usuario visualizar as informações da tela Invoice Details
      Entao o usuario ira validar o nome do Hotel: "Rendezvous Hotel"
      E o usuario ira validar o nome do Invoice Date: "14/01/2018"
      E o usuario ira validar o nome do Due Date: "15/01/2018"
      E o usuario ira validar o nome do Invoice Number: "110"
      E o usuario ira validar o nome do Booking Code: "0875"
      E o usuario ira validar o nome do Customer Details: "JOHNY SMITH R2, AVENUE DU MAROC 123456"
      E o usuario ira validar o nome do Room: "Superior Double"
      E o usuario ira validar o nome do Check In: "14/01/2018"
      E o usuario ira validar o nome do Check Out: "15/01/2018"
      E o usuario ira validar o nome do Total Stay Count: "1"
      E o usuario ira validar o nome do Total Stay Amount Hotel: "$150"
      E o usuario ira validar o nome do Deposit Now: "USD $20.90"
      E o usuario ira validar o nome do Tax & VAT: "USD $19"
      E o usuario ira validar o nome do Total Amount: "USD $209"



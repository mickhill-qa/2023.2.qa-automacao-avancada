#language: pt
Funcionalidade: invoice

  Cenario: invoice
    Dado que o usuario esta na pagina de autenticação
    Quando o usuario preenche as credenciais validas
    Entao o sistema redireciona para lista de faturas

    Quando o cliente clica em invoice
    Quando o sistema exibe pagina invoice
    Entao a pagina invoice exibe  o campo hotel com ""
    E a pagina invoice exibe  o campo invoice com ""
    E a pagina invoice exibe  o campo due com ""
    E a pagina invoice exibe  o campo invoice com ""
    E a pagina invoice exibe  o campo booking com ""
    E a pagina invoice exibe  o campo customer com ""
    E a pagina invoice exibe  o campo room com ""
    E a pagina invoice exibe  o campo check com ""
    E a pagina invoice exibe  o campo out com ""
    E a pagina invoice exibe  o campo cont com ""
    E a pagina invoice exibe  o campo amount com ""
    E a pagina invoice exibe  o campo now com ""
    E a pagina invoice exibe  o campo vat com ""
    E a pagina invoice exibe  o campo T amount com ""


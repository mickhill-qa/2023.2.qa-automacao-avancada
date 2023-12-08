#language: pt
@ecore_invoice_details
@resetBrowser
Funcionalidade: TC003 - Validate invoice details

  Cenario: Validar detalhes na tela apos o login
    Dado que o usuario esta no site
    Quando o usuario realiza o login com credenciais validas
    E o usuario clica no link para o primeiro item
    E o sistama exibe a pagina de detalhes da fatura
    Entao as informacoes na tela devem corresponder a tabela de dados fornecida

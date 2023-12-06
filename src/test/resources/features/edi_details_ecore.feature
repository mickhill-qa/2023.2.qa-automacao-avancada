#language: pt

@resetBrowser
@ecore_invoice_details
Funcionalidade: TC003 - Validate invoice details

  Cenario: Validar detalhes na tela apos o login
    Dado que o usuario esta no site
    Quando o usuario realiza o login com credenciais validas
    E o usuario clica no link "Invoice Details" para o primeiro item
    Entao as informacoes na tela devem corresponder a tabela de dados fornecida

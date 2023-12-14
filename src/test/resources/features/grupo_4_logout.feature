#language: pt
Funcionalidade: Logout

  Cenario: TC001 - Efetuar logout
    Dado que o usuario esteja logado no sistema
    Quando o usuario clicar no botão de logout
    Entao o usuario deve ser redirecionado para a pagina de login
    E o sistema deve exibir a mensagem "You logged out of the secure area!"

  Cenario: TC002 - Tentativa de acesso a secure area deslogado
    Dado que o usuario esteja na tela de autenticacao e nao efetue login no sistema
    Quando o usuario acessar a url da secure area
    Entao o usuario nao deve ser redirecionado para a pagina Secure Area
    E o sistema deve exibir a mensagem "You must login to view the secure area!"

#  Cenario: TC003 - Efetuar logout com duas abas logadas
#    Dado que o usuario esteja logado em duas abas simultaneamente
#    Quando o usuario clicar no botão de logout em uma das abas
#    E o usuario mudar para a outra aba logada
#    E o usuario atualizar a pagina
#    Entao o usuario deve ser redirecionado para a pagina de login
#    E o sistema deve exibir a mensagem "You must login to view the secure area!"
#

#language: pt

Funcionalidade: Equipe-2 - Login internet herokuapp
  Contexto:
	Dado que o usuario esta na tela de login

  Cenario: Autenticacao com usuario e senha validos
              
     Quando ele insere no botao as credenciais "tomsmith" e "SuperSecretPassword!"
     E clica no botao Login
     Então o sistema deve ser apresentado uma pagina
     E o sistema exibe a mensagem "You logged into a secure area!"
        
  Esquema do Cenario:  Autenticacao com usuario e senha invalidos
    
     Quando ele insere no botao as credencias <username> e <password>
     E clica no botao Login
     Então a pagina deve ser mantido a mesma
     E o sistema exibe a mensagem <message>
         
      Exemplos:
      
         |username      |password               |message                       |
         |"usuario1234" |"SuperSecretPassword!" |"Your username is invalid!"   |
         |"tomsmith"    |"senhaErrada@123"      |"Your password is invalid!"   |
 
 	
  Cenario: logar com a tecla ENTER

     Quando ele insere no botao as credenciais "tomsmith" e "SuperSecretPassword!"
     E clica no botao Enter
     Então o sistema deve ser apresentado uma pagina
     E o sistema exibe a mensagem "You logged into a secure area!"
         
         
  Cenario: Validar Campos Obrigatorios

     Quando ele insere no botao as credenciais "" e ""
     E clica no botao Login
     Então o sistema deve ser apresentado uma pagina
     E o sistema exibe a mensagem "The username and password fields are mandatory"
         
         
#       Cenario: Logout com Sucesso
#         Dado que o usuario logado esta na pagina principal
#         Quando ele clicar em logout
#         Então o usuario sera deslogado e redirecionado para tela de login
#
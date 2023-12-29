#language: pt

Funcionalidade: Equipe-2 - Login Seu Barriga
  Contexto:
  
	Dado que o usuario esta na tela de login

  Cenario: Autenticacao com usuario e senha validos
              
     Quando ele insere no botao as credenciais "irede20232@teste.com" e "1q2w3e!Q@W#E"
     E clica no botao Entrar
     Então o sistema deve apresentado a area de login
     E o sistema exibe a mensagem "Bem vindo, hachathon!"
        
  Esquema do Cenario:  Autenticacao com usuario ou senha vazios
    
     Quando ele insere no botao as credencias <username> e <password>
     E clica no botao Entrar
     Então a pagina deve ser mantido
     E o sistema exibe a mensagem de execao <message>
         
    Exemplos:
       |username     							|password               |message                          |
       |"" 												|"irede20232@teste.com" |"Email é um campo obrigatório"   |
       |"irede20232@teste.com"    |""    									|"Senha é um campo obrigatório"   |
 
 	
  Cenario: logar com a tecla ENTER

     Quando ele insere no botao as credenciais "irede20232@teste.com" e "1q2w3e!Q@W#E"
     E clica no botao Enter
      Então o sistema deve apresentado a area de login
     E o sistema exibe a mensagem "Bem vindo, hachathon!"

   #Cenario com Bug - Não da feadback para o usuario     
  Cenario: Deve validar o campo email


     Quando ele insere no botao as credenciais "irede20232.teste.com" e "1q2w3e!Q@W#E"
     Então a pagina deve deve em login
     E o sistema exibe a mensagem "Digite um email validoo"
     
         
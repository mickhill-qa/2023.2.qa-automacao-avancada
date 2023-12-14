#language: pt

Funcionalidade: Equipe-2 - Login internet herokuapp

    Cenario: Sucesso na autenticação de usuário

    		Dado que o usuário está na tela de login
			Quando ele insere no botão as credenciais "tomsmith" e "SuperSecretPassword!"
			E clica no botão Login
			Então o sistema deve ser apresentado uma pagina
			E o sistema exibe a mensagem "You logged into a secure area!"
        

    Esquema do Cenario: : Falha na autenticação de usuário inválido

	    	Dado que o usuário está na tela de login
			Quando ele insere no botão as credencias <username> e <password>
			E clica no botão Login
			Então a pagina deve ser mantido a mesma
			E o sistema exibe a mensagem <message>

		Exemplos:
			|username      |password               |message						|
			|"usuario1234" |"SuperSecretPassword!" |"Your username is invalid!"	|
			|"tomsmith"    |"senhaErrada@123"      |"Your password is invalid!"	|




	Cenario: Logout com Sucesso
		Dado que o usuário logado está na pagina principal
		Quando ele clicar em logout
		Então o usuario sera deslogado e redirecionado para tela de login

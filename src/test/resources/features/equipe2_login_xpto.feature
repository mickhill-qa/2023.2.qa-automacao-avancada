#language: pt

Funcionalidade: Equipe-2 - Login internet herokuapp

    Cenario: Sucesso na autenticação de usuário
    	Dado que o usuário está na tela de login
			Quando ele insere um "nome de usuário" válido 
			E ele insere uma "senha" válida 
			E clica no botão "Entrar"
			Então a "tela inicial" do sistema deve ser apresentada
			E uma "mensagem de boas-vindas" deve ser exibida
        

    Cenario: Falha na autenticação de usuário inválido
    
	    Dado que o usuário está na tela de login
			Quando ele insere um "nome de usuário" inválido
			E ele insere uma "senha" válida 
			E clica no botão "Entrar"
			Então a "tela de login" deve ser mantida
			E uma "mensagem de erro de autenticação" deve ser exibida
    
    
     Cenario: Falha na autenticação de usuário devido a senha inválida
        
      Dado que o usuário está na tela de login
			Quando ele insere um "nome de usuário" válido 
			E ele insere uma "senha" inválida 
			E clica no botão "Entrar"
			Então a "tela de login" deve ser mantida 
			E uma "mensagem de erro de autenticação" deve ser exibida
#language: pt
Funcionalidade: Login com sucesso

    Cenario: Login com sucesso
        Dado que o usuario esta na pagina inicial
        Quando o usuario preeche o Nome "Leonardo Candido Hilário"
        E preeche o Email "hilarioleozinho@gmail.com"
        E preeche o Senha "LEOhilario10#"
        E o usuario clica no botao Cadastrar
        Entao o usuario recebe mensagem "usuario inserido com sucesso"

#    Cenario: Falha no login
#        Dado que o usuario esta na pagina inicial
#        Quando o usuario preeche o Nome "Leonardo Candido Hilário"
#        E preeche o Email "hilarioleozinho@gmail.com"
#        E preeche o Senha "LEOhilario"
#        E o usuario clica no botao Cadastrar
#        Entao o usuario nao faz o login

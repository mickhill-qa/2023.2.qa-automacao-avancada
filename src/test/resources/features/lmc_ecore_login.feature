#language: pt

  Funcionalidade: Leonardo Conceicao - ecore login
    Como um usuario quero fazer
    um login na pagina da ecore

    @log1
    Cenario: Login com sucesso
      Dado que o usuario esta na pagina de login
      Quando o usuario preencher os campos com informações validas
      Entao o sistema redireciona para lista de faturas

    @log2
    Esquema do Cenario: Cenario: Login sem sucesso
      Dado que o usuario esta na pagina de login
      Quando o usuario preencher os campos com <e-mail> e <senha> invalidos
      Entao o sistema retorna uma mensagem de Erro

      Exemplos: Credenciais invalidas
      |e-mail     |senha     |
      |"Demouser" |"dabc123" |
      |"demouser_"|"xyz"     |
      |"demouser" |"nananana"|
      |"demouser" |""        |
      |" "        |"abc123"  |
      |""         |""        |


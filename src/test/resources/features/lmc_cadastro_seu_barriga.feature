#language: pt
  Funcionalidade: cadastro em seu barriga
    como um usuario quero fazer um
    cadastro no site do seu barriga


  Esquema do Cenário: Cenário: Cenario: Criar cadastro - com senha valida
    Dado que o usuario acesse a pagina
    Quando o usuario fazer o cadastro com <senha_valida>
    Entao o sistema retorna uma mensagem de sucesso

    Exemplos: senha valida
    |senha_valida|
    |"John@123"  |

    Esquema do Cenário: Cenário: Cenario: Criar cadastro - com senha em branco
      Dado que o usuario acesse a pagina
      Quando o usuario fazer o cadastro com <senha_invalida>
      Entao o sistema retorna uma mensagem de erro

      Exemplos: senha em branco
      |senha_invalida|
      |""           |
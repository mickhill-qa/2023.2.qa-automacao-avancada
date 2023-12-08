#language: pt
Funcionalidade: Marcela Silva - Ecore Login
  Analise e Modelagem: Plano de testes
  Excecucao de testes: Scrips e Evidencias
  Apresentacao / Demo: Report de Teste e Report de Bug
  Automacao de testes...
  Trazer o Plano e os Scripts para o Projeto
  Gerar o CODE dos steps do script de automacao
  Mapear objetos de tela

  Cenario: Login com Sucesso
    Dado que o usuario ta na pagina de autenticacao
    Quando o usuario preenche as credenciais validas
    Entao o sistema redireciona o usuario para a lista de faturas

  @resetBrowser
  Cenario: Login Negativo
    Dado que o usuario ta na pagina de autenticacao
    Quando o usuario preenche os campos com credenciais invalidas
    Entao o sistema apresenta uma mensagem de credenciais invalidas



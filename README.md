# 2023.2.qa-automacao-avancada

### Como começar a atividades no git...

Volta pra **develop**
```bash
git checkout develop
```

Atualizar a **develop**
```bash
git pull
```

Criar a branch da demanda atual
```bash
git checkout -b feature/<grupo_x>/pre_hachathon
```
---
### Pre-Hachathon

1. Atividade de automacao

    - Elebora em Gherkin/BDD X cenaios de testes da Feature abaixo:

        - Feature: https://the-internet.herokuapp.com/login;
            ```text
            - Levar em consideracao os fluxos base, alternativos e excecao.
            - Coloquem Screenshots nos steps decisivos;
            - Processo onde cada fase terá um Output;
            - Tempo determinado para iniciar cada faze.
               Fase 1 [30min] - Análise e Modelagem
                  > Entendimento de negócio e critérios de aceite.
                  > Planejamento de Cenários de teste.
                  > Output: Plano de Testes.
        
               Fase 2 [30min] - Execução
                  > Descrição dos Cenários do Plano de Testes (Step By Step).
                  > Coletar Evidências: prints, logs, payloads, etc.
                  > Output:	1 - Scripts de Teste
                            2 - Evidências dos Testes
        
               Fase 3 [1hr] - Apresentação
                  > [15min] Formatar Evidências de testes.
                  > [45min] Apresentar Outputs para a Turma.
                  > Output:	1 - Report de Testes (failed e passed)
                            2 - Report de Bugs
            ```

    - Entrega:
        1. Scripts de teste no arquivo .feature;
        1. Steps da feature no Pacote/Package: steps
        1. Pages/Páginas do site no Pacote/Package: pages
        1. Repositorio de entrega: https://github.com/mickhill-qa/2023.2.qa-automacao-avancada
        1. Entregar com um pull-request para a branch develop;
        1. Entregar até 15/12/2023;
        1. Os nomes de arquivos deve comecar com o nome do grupo:
            - [grupo_1](#)_xpto.feature
            - [Grupo1](#)XPTOSteps.java
            - [Grupo1](#)XPTOPage.java
    - Grupos:

        ```text
        Team 1:
        Joaquim Neto, Sandro Augusto, Lucas Rodrigues, Edinete, Roberto Bezerra
		
        Team 2:
        Jonnas Targino, Ivan Alves, Natália Rabelo, Ingrid Rana, Alexsandro Amancio
		
        Team 3:
        Leonardo Conceição, Luana Lins, Edmozer Cavalcante, Leonardo Hilário, Italo Freitas
		
        Team 4:
        Arthur Motta, Winny, Anderson Ramos, Karen Sousa, Felipe Daniel
		
        Team 5:
        Marcela Nascimento, Luscas Norte, Renato Correa, Yohans Nascimento, Diego Aquino
        ```


---
### Atividades

1. Atividade de automacao

    - Elebora em Gherkin/BDD 2 cenaios de testes da Feature abaixo:

        - Feature: https://seubarriga.wcaquino.me/cadastro;
            ```text
            > Nome: String(60) Obrigatório
            > Email: String(32) Obrigatório 
                [Precisa ser uma email válido]
            > Senha: String(32) Obrigatório 
                [Precisa ter:
                    uma letra maiuscula, 
                    uma letra minuscula,
                    um caracter especial e 
                    um numero]
            ```
        - Pode ser o mesmo script entregue no Pre-Hackatho!

    - Entrega:
        1. Scripts de teste no arquivo: CadastroSeuBarriga.feature
        1. Steps da feature no arquivo: CadastroSeuBarrigaSteps.java
        1. Pages/Páginas do site no Pacote/Package: pages
        1. Repositorio de entrega: https://github.com/mickhill-qa/2023.2.qa-automacao-avancada
        1. Entregar com um pull-request;
        1. Entregar até 24/11/2023;
        1. Os nomes de arquivos deve comecar com o nome do aluno:
            - [tio_mick](#)_cadastro_seu_barriga.feature
            - [TioMick](#)CadastroSeuBarrigaSteps.java
            - [TioMick](#)XPTOPage.java

---
2. Atividade de automacao

   - Elebora em Gherkin/BDD os 3 cenaios de testes do documento:

      - Requisito: [Documento PDF](Quality_Assurance_-_Test_Automation_Assessment.pdf)

   - Entrega:
      1. Scripts de teste no arquivo: 
         - login.feature
         - invoice_details.feature
      1. Steps da feature no arquivo:
         - InvoiceDetailsSteps.java
         - LoginSteps.java
      1. Pages/Páginas do site no Pacote/Package: pages
      1. Repositorio de entrega: https://github.com/mickhill-qa/2023.2.qa-automacao-avancada
      1. Entregar com um pull-request;
      1. Entregar até 08/12/2023;
      1. Os nomes de arquivos deve comecar com o nome do aluno:
          - [tio_mick](#)_xpto.feature
          - [TioMick](#)XPTOSteps.java
          - [TioMick](#)XPTOPage.java
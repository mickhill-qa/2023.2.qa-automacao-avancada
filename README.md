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
git checkout -b feature/<aluno>/recuperacao
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
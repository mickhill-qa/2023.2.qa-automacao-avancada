package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.AlexsandroSeuBarrigaCadastroPage;
import runner.base_class.BaseSteps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AlexsandroSeuBarrigaCadastroSteps extends BaseSteps {

    AlexsandroSeuBarrigaCadastroPage pageCadastro = new AlexsandroSeuBarrigaCadastroPage();

    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
    String formattedDate = myDateObj.format(myFormatObj);

    String nome = "Herlon";
    String email = "herlon@teste" + formattedDate;
    String senha = "pwd123";


    @Dado("que o usuario acessa a pagina de cadastro")
    public void que_o_usuario_acessa_a_pagina_de_cadastro() {
        pageCadastro.open();
        screenshot();
    }

    @Quando("o usuario preenche os campos com dados validos")
    public void o_usuario_preenche_os_campos_com_dados_validos() {

        scenario.log("nome: " + nome);
        scenario.log("email: " + email);
        scenario.log("senha: " + senha);

        pageCadastro.preNome(nome);
        pageCadastro.preEmail(email);
        pageCadastro.preSenha(senha);
        screenshot();

    }

    @E("o usuario clica em Cadastrar")
    public void o_usuario_clica_em_cadastrar() {
        pageCadastro.clicarCadastro();
    }

    @Então("a pagina informa a mensagem {string}")
    public void a_pagina_informa_a_mensagem(String _mensagem) {
        String mensagemTela = pageCadastro.pegarNotificacao();
        Assert.assertEquals(_mensagem, mensagemTela);
        screenshot();
    }

    @Quando("o usuario preenche o campo nome e campo email")
    public void o_usuario_preenche_o_campo_nome_e_campo_email() {

        pageCadastro.preNome(nome);
        pageCadastro.preEmail(email);
        screenshot();

    }


}

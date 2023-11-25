package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.SeuBarrigaCadastroPage;
import runner.base_class.BaseSteps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SeuBarrigaCadastroSteps extends BaseSteps {
    SeuBarrigaCadastroPage paginaCadastro = new SeuBarrigaCadastroPage();
    @Dado("que o usuario esta na pagina de cadastro")
    public void que_o_usuario_esta_na_pagina_de_cadastro() {
        paginaCadastro.abri ();
    }
    @Quando("o usuario preeche campo nome")
    public void o_usuario_preeche_campo_nome() {
        paginaCadastro.preencherNome("Farofeiro");
        screenshot();
    }
    @Quando("o usuario preeche campo email")
    public void o_usuario_preeche_campo_email() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
        String formattedDate = myDateObj.format(myFormatObj);

        paginaCadastro.preencherEmail("teste@teste." + formattedDate);
        screenshot();
    }
    @Quando("o usuario preeche campo senha")
    public void o_usuario_preeche_campo_senha() {
        paginaCadastro.preencherSenha("abc123@");
        screenshot();
    }
    @Quando("o usuario clica no botao CADASTRAR")
    public void o_usuario_clica_no_botao_cadastrar() {
        paginaCadastro.clicarCadastro();
    }
    @Entao("o sistema apresentara a mensagem {string}")
    public void o_sistema_apresentará_a_mensagem(String msg) {
        String msgTela = paginaCadastro.pegarNotificacao();
        Assert.assertEquals(msg,msgTela);
        screenshot();
    }

}

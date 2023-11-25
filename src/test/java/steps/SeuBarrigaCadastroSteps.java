package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.SeuBarrigaCadastroPage;
import runner.base_class.BaseSteps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SeuBarrigaCadastroSteps extends BaseSteps {

    SeuBarrigaCadastroPage pageCadastro = new SeuBarrigaCadastroPage();

    @Dado("que o usuario acessa a pagina de cadastro")
    public void que_o_usuario_acessa_a_pagina_de_cadastro() {
        pageCadastro.open();
        screenshot();
    }
    @Quando("o usuario preenche os campos com dados validos")
    public void o_usuario_preenche_os_campos_com_dados_validos() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
        String formattedDate = myDateObj.format(myFormatObj);

        String nome = "Herlon";
        String email = "herlon@teste" + formattedDate;
        String senha = "pwd123";

        scenario.log("nome: " + nome);
        scenario.log("email: " + email);
        scenario.log("senha: " + senha);

        pageCadastro.preNome(nome);
        pageCadastro.preEmail(email);
        pageCadastro.preSenha(senha);
        screenshot();

    }
    @Quando("o usuario clica em Cadastrar")
    public void o_usuario_clica_em_cadastrar() { pageCadastro.clicarCadastro(); }

    @Então("a pagina informa a mensagem {string}")
    public void a_pagina_informa_a_mensagem(String _mensagem) {
        String mensagemTela = pageCadastro.pegarNotificacao();
        Assert.assertEquals(_mensagem, mensagemTela);
        screenshot();
    }



}

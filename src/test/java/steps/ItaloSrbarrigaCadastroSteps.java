package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.ItaloSrbarrigaCadastroPage;
import runner.base_class.BaseSteps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ItaloSrbarrigaCadastroSteps extends BaseSteps {

    ItaloSrbarrigaCadastroPage paginaCadastro = new ItaloSrbarrigaCadastroPage();

    @Dado("que o usuario esta na pagina de cadastrar novo usuario no site {string}")
    public void que_o_usuario_esta_na_pagina_de_cadastrar_novo_usuario_no_site(String string) {
        paginaCadastro.abrir();
        screenshot();
    }
    @Quando("o usuario preenche os campo nome com {string}")
    public void o_usuario_preenche_os_campo_nome_com(String string) {
        String nome = "Leomar";
        paginaCadastro.preencherNome(nome);
        screenshot();
    }
    @Quando("o campo email com {string}")
    public void o_campo_email_com(String string) {
        String email = "123@gmai.com";
        paginaCadastro.preencherEmail(email);
        screenshot();
    }
    @Quando("o campo senha com {string}")
    public void o_campo_senha_com(String string) {
        String senha = "1234";
        paginaCadastro.preencherSenha(senha);
        screenshot();
    }

    @Quando("o usuario clica em Cadastrar")
    public void o_usuario_clica_em_cadastrar() {
        paginaCadastro.clicarCadatro();
    }

    @Entao("o sistema exibe a mensagem Email ja utilizado")
    public void o_sistema_exibe_a_mensagem_Email_ja_utilizado() {
        Assert.assertTrue(paginaCadastro.temMensagemDeErro("Endereço de email já utilizado"));
        screenshot();
    }

    @Quando("o usuario preenche os campos obrigatorio com dados validos")
    public void o_usuario_preenche_os_campos_obrigatorio_com_dados_validos() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
        String formattedDate = myDateObj.format(myFormatObj);

        String nome = "Alars";
        String email = "Italopegoudomick@teste." + formattedDate;
        String senha = "thanos";


        scenario.log("nome: " + nome);
        scenario.log("email: " + email);
        scenario.log("senha: " + senha);

        paginaCadastro.preencherNome(nome);
        paginaCadastro.preencherEmail(email);
        paginaCadastro.preencherSenha(senha);
        screenshot();

    }
    @Entao("o sistema exibi a mensagem {string}")
    public void o_sistema_exibi_a_mensagem(String string) {


    }


}

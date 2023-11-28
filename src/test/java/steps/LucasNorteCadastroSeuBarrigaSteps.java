package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.LucasNorteCadastroSeuBarrigaPage;
import runner.base_class.BaseSteps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LucasNorteCadastroSeuBarrigaSteps extends BaseSteps {
    /**
     * Paginas usadas nos testes
     * */
    LucasNorteCadastroSeuBarrigaPage paginaCadastro = new LucasNorteCadastroSeuBarrigaPage();

    /**
     * Fluxo Base
     * */
    @Dado("que o usuario esta na tela de cadastro, ln")
    public void que_o_usuario_esta_na_tela_de_cadastro_ln() {
        paginaCadastro.abrir();
        screenshot();
    }

    @Quando("o usuario preenche os campos obrigatorios com dados validos, ln")
    public void o_usuario_preenche_os_campos_obrigatorios_com_dados_validos_ln() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

        String nome = "Lucas teste";
        String email = "lucas@teste." + LocalDateTime.now().format(myFormatObj);
        String senha = "Abc@123";

        paginaCadastro.preencherNome(nome);
        paginaCadastro.preencherEmail(email);
        paginaCadastro.preencherSenha(senha);
        screenshot();
    }

    @E("o usuario clica no botao Cadastrar, ln")
    public void o_usuario_clica_no_botao_cadastrar_ln() {
        paginaCadastro.clicarCadatro();
    }

    @Entao("o sistema exibi a mensagem {string}, ln")
    public void o_sistema_exibi_a_mensagem_ln(String _mensagem) {
        String msgTela = paginaCadastro.pegarNotificacao();
        Assert.assertEquals(_mensagem, msgTela);
        screenshot();
    }

    /**
     * Fluxo de Excecao
     * */
    @Quando("o usuario deixa o campo nome vazio, ln")
    public void o_usuario_deixa_o_campo_nome_vazio_ln() {
    }

    @Quando("o usuario preenche os campos email e senha com dados validos, ln")
    public void o_usuario_preenche_os_campos_email_e_senha_com_dados_validos_ln() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

        String email = "lucas@teste." + LocalDateTime.now().format(myFormatObj);;
        String senha = "Abc@123";

        paginaCadastro.preencherEmail(email);
        paginaCadastro.preencherSenha(senha);
        screenshot();
    }

}

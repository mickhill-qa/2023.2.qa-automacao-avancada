package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.CadastroSeuBarrigaPage;
import pages.LoginSeuBarrigaPage;
import runner.base_class.BaseSteps;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CadastroSeuBarrigaSteps extends BaseSteps {

    CadastroSeuBarrigaPage cadastroSeuBarriga = new CadastroSeuBarrigaPage();
    LoginSeuBarrigaPage loginSeuBarriga = new LoginSeuBarrigaPage();

    @Dado("que o usuario esteja na tela de cadastro")
    public void que_o_usuario_esteja_na_tela_de_cadastro() {
        cadastroSeuBarriga.abrir();
        screenshot();
    }

    @Quando("o usuario preeche campos obrigatorios com dados validos")
    public void o_usuario_preenche_o_campo_nome_com( ){
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
        cadastroSeuBarriga.escreverNome("Teste");
        cadastroSeuBarriga.escreverEmail("ixiar7774@uorak.com" + LocalDateTime.now().format(myFormatObj));
        cadastroSeuBarriga.escreverSenha("teste1234");
        screenshot();
    }

    @Quando("o usuario preeche campos obrigatorios com dados validos informando email vinculado a outra conta")
    public void o_usuario_preenche_o_campo_nome_com_dados_validos_informando_email_vinculado_a_outra_conta( ){
        cadastroSeuBarriga.escreverNome("Teste");
        cadastroSeuBarriga.escreverEmail("ixiar7774@uorak.com");
        cadastroSeuBarriga.escreverSenha("teste1234");
        screenshot();
    }

    @E("o usuario clica no botao Cadastrar")
    public void o_usuario_clica_no_botao_Cadastrar() {
        cadastroSeuBarriga.submitFormulario();

    }

    @Entao("o sistema redireciona o usuario para a tela de login")
    public void o_sistema_redireciona_o_usuario_para_a_tela_de_login() {
        Assert.assertTrue(loginSeuBarriga.verficarSeEstouUrlLogin());
    }

    @E("o usuario deve visualizar mensagem de {string}")
    public void  o_usuario_deve_visualizar_mensagem_de(String _mensagem) {
        String msgTela = loginSeuBarriga.getAlertaNovoUsuarioInserido();
        Assert.assertEquals(_mensagem, msgTela);
        screenshot();
    }
}

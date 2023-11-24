package steps;


import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.SeuBarrigaCadastroPage;
import runner.base_class.BaseSteps;

import java.util.Random;

public class CadastroSeuBarrigaSteps extends BaseSteps {
    SeuBarrigaCadastroPage paginaCadastro = new SeuBarrigaCadastroPage();
    @Dado("que o usuario esteja na tela de cadastro")
    public void que_o_usuario_esteja_na_tela_de_cadastro() {
        paginaCadastro.abrir();
        screenshot();
    }
    @Quando("o usuario preencher os campos obrigatorio com dados validos")
    public void oUsuarioPreencherOsCamposObrigatorioComDadosValidos() {
        Random random = new Random();
        String email = "user" + random.nextInt(200) + "@teste.com";
        paginaCadastro.preencherCamposCadastro(email,"senha@123", "Test User");
    }

    @Quando("o usuario clicar em cadastrar")
    public void o_usuario_clicar_em_cadastrar() {
        paginaCadastro.clicarCadastro();
    }
    @Entao("a mensagem {string} deve ser exibida")
    public void a_mensagem_deve_ser_exibida(String message) {
        String mensagemExibida = paginaCadastro.pegarMensagemDeValidacao();
        Assert.assertEquals(mensagemExibida,message);

    }

    @Quando("o usuario preencher o campo Nome e email com dados validos")
    public void o_usuario_preencher_o_campo_nome_e_email_com_dados_validos() {
        Random random = new Random();
        String email = "user" + random.nextInt(200) + "@teste.com";
        paginaCadastro.preencherNome("Felipe");
        paginaCadastro.preencherEmail(email);
    }
    @Quando("o campo Senha com valor fora do padrao")
    public void o_campo_senha_com_valor_fora_do_padrao() {
        //padrão: uma letra maiuscula, uma minuscula, um caractere especial e 1 numero
        paginaCadastro.preencherPassword("senhaforadopadra");
    }

    @Entao("a mensagem {string} não deve ser exibida")
    public void a_mensagem_não_deve_ser_exibida(String message) {
        String mensagemExibida = paginaCadastro.pegarMensagemDeValidacao();
        Assert.assertNotEquals(mensagemExibida,message);
    }
}

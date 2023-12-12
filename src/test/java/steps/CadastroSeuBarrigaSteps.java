package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroSeuBarrigaPage;
import java.util.UUID;

public class CadastroSeuBarrigaSteps {

    CadastroSeuBarrigaPage paginaCadastro = new CadastroSeuBarrigaPage();

        @Dado("que o usuario esta na pagina de cadastro")
        public void queOUsuarioEstaNaPaginaDeCadastro() {
            paginaCadastro.abrir();
        }

    @E("o usuario preeche os campos Email e Senha")
    public void oUsuarioPreecheOsCamposEmailESenha() {
        paginaCadastro.preencherNome("Testador da Silva");
        paginaCadastro.preencherEmail("testador" + UUID.randomUUID().toString() + "@email.com");
        paginaCadastro.preencherSenha("123456");
    }


    @Quando("o usuario clica no botao CADASTRAR")
    public void oUsuarioClicaNoBotaoCADASTRAR() {
        paginaCadastro.clicarCadastrar();
    }




    @Entao("o sistema mostra uma mensagem de sucesso")
    public void oSistemaMostraUmaMensagemDeSucesso() {
        String msgSucesso = paginaCadastro.buscarMsg();
        String mensagemEsperada = "Usuário inserido com sucesso";
        Assert.assertEquals(mensagemEsperada, msgSucesso);
    }


    @Entao("o sistema mostra uma mensagem de erro informando os campos obrigatorios")
    public void oSistemaMostraUmaMensagemDeErroInformandoOsCamposObrigatorios() {
        String mensagemErro = paginaCadastro.buscarMsgErro();

        Assert.assertTrue(mensagemErro.contains("Nome é um campo obrigatório"));

        Assert.assertTrue(mensagemErro.contains("Email é um campo obrigatório"));
        
        Assert.assertTrue(mensagemErro.contains("Senha é um campo obrigatório"));

    }
}

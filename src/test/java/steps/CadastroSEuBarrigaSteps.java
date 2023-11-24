package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroSeuBarrigaPage;
import runner.base_class.BaseSteps;
import runner.support.Utils;

public class CadastroSEuBarrigaSteps extends Utils {
    CadastroSeuBarrigaPage seuBarrigaPage = new CadastroSeuBarrigaPage();
    @Dado("que o usuario esteja na tela de Cadastro")
    public void que_o_usuario_esteja_na_tela_de_cadastro() {
        seuBarrigaPage.validaTelaCadastro();
    }

    @Quando("o usuario preencher os campos {string}, {string}, {string} e clicar em Cadastrar")
    public void o_usuario_preencher_os_campos_e_clicar_em_cadastrar_com_sucesso(String nome, String email, String senha) {
        seuBarrigaPage.cadastrarSucesso(nomeRandom(nome), emailRandom(email), senhaRandom(senha));
    }

    @Entao("o sistema mostrarar a mensagem {string}")
    public void o_sistema_mostrarar_a_mensagem(String message) {
        String text = seuBarrigaPage.messageValidation(message);
        Assert.assertEquals(text, message);
        screenshot();
    }

    @Quando("preencher os campos {string}, {string}, {string} e clicar em Cadastrar")
    public void preencher_os_campos_e_clicar_em_cadastrar(String nome, String email, String senha) {
        seuBarrigaPage.cadastrarSeuBarriga(nome, email, senha);
    }
    @Entao("o sistema mostrara a {string}")
    public void o_sistema_mostrara_a(String message) {
        String text = seuBarrigaPage.messageValidation(message);
        Assert.assertEquals(text, message);
        screenshot();
    }

}

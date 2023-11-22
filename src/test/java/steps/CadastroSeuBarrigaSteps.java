package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroSeuBarrigaPage;
import runner.base_class.BaseSteps;
import io.cucumber.java.pt.*;

public class CadastroSeuBarrigaSteps extends BaseSteps {

    CadastroSeuBarrigaPage cadastroSeuBarriga = new CadastroSeuBarrigaPage();

    //Cenário de cadastro com sucesso
    @Dado("que estou no site do seu barriga")
    public void que_estou_no_site_do_seu_barriga() {
        cadastroSeuBarriga.openPage();
    }
    @Quando("clico na aba novo usuario")
    public void clico_na_aba_novo_usuario() {
        cadastroSeuBarriga.openSingup();
    }
    @E("preencho o campo nome")
    public void preencho_o_campo_nome() {
        cadastroSeuBarriga.setName("arthur");
    }

    @E("preencho o campo email com um email valido")
    public void preencho_o_campo_email_com_um_email_valido() {
        cadastroSeuBarriga.setEmail("xpto1@teste.com");
    }
    @E("preencho o campo senha com uma senha valida")
    public void preencho_o_campo_senha_com_uma_senha_valida() {
        cadastroSeuBarriga.setPassword("qa1234");
    }
    @E("clico em cadastrar")
    public void clico_em_cadastrar() {
        cadastroSeuBarriga.clickSingUp();
    }
    @Entao("sou cadastrado no sistema")
    public void sou_cadastrado_no_sistema() {
        String txtCorrect = "Usuário inserido com sucesso";
        String txt = cadastroSeuBarriga.singUpVerify();
        Assert.assertEquals(txtCorrect, txt);

    }

    //Cenário de cadastro com email invalido
    @E("preencho o campo email com um email invalido")
    public void preencho_o_campo_email_com_um_email_invalido() {

    }
    @Entao("o sistema avisa que preciso de um email valido")
    public void o_sistema_avisa_que_preciso_de_um_email_valido() {

    }
}

package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.EdiListEcorePage;
import pages.EdiLoginEcorePage;
import runner.base_class.BaseSteps;

public class EdiLoginEcoreStaps extends BaseSteps {
    EdiLoginEcorePage loginPage = new EdiLoginEcorePage();
    EdiListEcorePage validainvoiceList = new EdiListEcorePage();

    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        loginPage.abrir();
    }
    @Quando("o usuario preencher o login com credenciais validas")
    public void o_usuario_preencher_o_login_com_credenciais_validas() {
        loginPage.setInputUsername();
        loginPage.setInputPassword();
    }
    @E("o usuario clicar no botao login")
    public void o_usuario_clicar_no_botao_login() {
        loginPage.clickBtnLogin();
    }
    @Entao("o aplicativo deve redirecionar o usuario para a pagina Lista de faturas")
    public void o_aplicativo_deve_redirecionar_o_usuario_para_a_pagina_lista_de_faturas() {
        validainvoiceList.invoiceList();
    }
    @Quando("o usuario preenche os campos {string}, {string} com credenciais invalidas")
    public void o_usuario_preenche_os_campos_com_credenciais_invalidas(String Username, String Password) {
        loginPage.setInputUsername();
        loginPage.setInputPassword();
    }
    @E("o usuario clicar no botao Login")
    public void o_usuario_clicar_no_botao_login2() {
        loginPage.clickBtnLogin();
        loginPage.pressEnter();
    }
    @Entao("o sistema mostrara a mensagem de alerta {string}")
    public void o_sistema_mostrara_a_mensagem_de_alerta(String mensagem) {
        String texto = loginPage.validaMensagem(mensagem);
        Assert.assertEquals(texto, mensagem);

    }
}

package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.EdiDetailsEcorePage;
import pages.EdiListEcorePage;
import pages.EdiLoginEcorePage;
import runner.base_class.BaseSteps;

public class EdiLoginEcoreStaps extends BaseSteps {
    EdiLoginEcorePage loginPage = new EdiLoginEcorePage();
    EdiListEcorePage validainvoiceList = new EdiListEcorePage();
    EdiDetailsEcorePage validaNovaAba = new EdiDetailsEcorePage();

    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        loginPage.abrir();
        screenshot();
    }

    @Quando("o usuario preencher os campos {string} e {string}")
    public void o_usuario_preencher_os_campos_com_credenciais_invalidas(String username, String password) {
        loginPage.setInputUsername(username);
        loginPage.setInputPassword(password);

    }
    @E("o usuario clicar no botao login")
    public void oUsuarioClicarNoBotaoLogin() {
        loginPage.clickBtnLogin();
    }
    @Entao("o aplicativo deve redirecionar o usuario para a pagina Lista de faturas")
    public void o_aplicativo_deve_redirecionar_o_usuario_para_a_pagina_lista_de_faturas() {
        validaNovaAba.validPag();
        Assert.assertTrue(validainvoiceList.invoiceList());
        screenshot();
    }
    @E("o sistema mostrara a mensagem de alerta {string}")
    public void o_sistema_mostrara_a_mensagem_de_alerta(String mensagem) {
        String texto = loginPage.validaMensagem(mensagem);
        Assert.assertEquals(texto, mensagem);
        screenshot();
    }


}

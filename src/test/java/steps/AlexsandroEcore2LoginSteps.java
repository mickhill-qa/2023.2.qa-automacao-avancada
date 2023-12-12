package steps;


import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.AlexsandroEcore2LoginPage;
import pages.AlexsandroInvoiceListEcore2Page;
import runner.base_class.BaseSteps;

public class AlexsandroEcore2LoginSteps extends BaseSteps {

    AlexsandroEcore2LoginPage loginPage = new AlexsandroEcore2LoginPage();
    AlexsandroInvoiceListEcore2Page pageListFatura = new AlexsandroInvoiceListEcore2Page();

    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login()
    {
            loginPage.open();
            screenshot();
    }

    @Quando("o usuario preencher as credenciais {string} e {string}")
    public void o_usuario_preencher_as_credenciais_e(String _username, String _password)
    {
        loginPage.fillUsername(_username);
        loginPage.fillPassword(_password);
        loginPage.clickBtnLogin();
    }

    @Entao("o sistema encaminha para lista de faturas")
    public void o_sistema_encaminha_para_lista_de_faturas()
    {
        Assert.assertTrue(pageListFatura.estouAqui());
        screenshot();
    }


    @Entao("o sistema aparece a mensagem de erro: {string}")
    public void o_sistema_aparece_a_mensagem_de_erro(String _msgErro)
    {
        String msgTela = loginPage.takeMsgError();
        Assert.assertEquals(_msgErro, msgTela);
    }

}

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

public class EdiDetailsEcoreStaps extends BaseSteps {
    EdiDetailsEcorePage invoicedetails = new EdiDetailsEcorePage();
    EdiListEcorePage listEcorePage = new EdiListEcorePage();
    EdiLoginEcorePage loginPage = new EdiLoginEcorePage();

    @Dado("que o usuario esta no site")
    public void que_O_Usuario_Esta_No_Site() {
        loginPage.abrir();
    }

    @Quando("o usuario realiza o login com credenciais validas")
    public void o_Usuario_Realiza_O_Login_Com_Credenciais_Validas() {
        invoicedetails.setInputUsername();
        invoicedetails.setInputPassword();
        invoicedetails.clickbtnLogin();
    }

    @E("o usuario clica no link {string} para o primeiro item")
    public void o_Usuario_Clica_No_Link_Para_O_Primeiro_Item() {
        listEcorePage.clickInvoiceDetails(1);
    }
    @E("o sistama exibe a pagina de detalhes da fatura")
    public void o_sistama_exibe_a_pagina_de_detalhes_da_fatura() {
        invoicedetails.validPag();
        screenshot();
    }

    @Entao("as informacoes na tela devem corresponder a tabela de dados fornecida")
    public void as_Informacoes_Na_Tela_Devem_Corresponder_A_Tabela_De_Dados_Fornecida() {
        Assert.assertEquals(invoicedetails.validPag(), "Invoice Details");
        Assert.assertEquals(invoicedetails.validaHotel(), "Rendezvous Hotel");
        Assert.assertEquals(invoicedetails.invoiceNumber(), "Invoice #110 details");
        Assert.assertEquals(invoicedetails.validaInvoiceDate(), "14/01/2018");
        Assert.assertEquals(invoicedetails.validaDueDate(), "15/01/2018");
        Assert.assertEquals(invoicedetails.bookingCode(), "0875");
        Assert.assertEquals(invoicedetails.room(), "Superior Double");
        Assert.assertEquals(invoicedetails.totalStayCount(), "1");
        Assert.assertEquals(invoicedetails.totalStayAmount(), "$150");
        Assert.assertEquals(invoicedetails.checkIn(), "14/01/2018");
        Assert.assertEquals(invoicedetails.checkOut(), "15/01/2018");
        Assert.assertEquals(invoicedetails.customerDetails(), "JOHNY SMITH R2, AVENUE DU MAROC 123456");
        Assert.assertEquals(invoicedetails.depositNow(), "USD $20.90");
        Assert.assertEquals(invoicedetails.totalAmount(), "USD $209");
        Assert.assertEquals(invoicedetails.taxEvate(), "USD $19");
    }
}
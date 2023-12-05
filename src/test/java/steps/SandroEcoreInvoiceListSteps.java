package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.SandroEcoreInvoiceDetailsPage;
import pages.SandroEcoreInvoiceListPage;
import pages.SandroEcoreLoginPage;
import runner.base_class.BasePage;

import static runner.base_class.BaseSteps.screenshot;

public class SandroEcoreInvoiceListSteps extends BasePage {
    SandroEcoreLoginPage loginPage = new SandroEcoreLoginPage();
    SandroEcoreInvoiceListPage listPage = new SandroEcoreInvoiceListPage();
    SandroEcoreInvoiceDetailsPage detailsPage = new SandroEcoreInvoiceDetailsPage();

    @Dado("que o usuario esta Logado")
    public void que_o_usuario_esta_logado() {
        loginPage.abrir();
        screenshot();
        loginPage.preencherField("demouser", "abc123");
        screenshot();
        loginPage.clicarLogin();
    }

    @Dado("que o usuario clique no primeiro link da coluna Invoice Link")
    public void que_o_usuario_clique_no_primeiro_link_da_coluna_invoice_link() {
        listPage.clikLinkInvoiceDetails();
    }

    @Quando("o usuario visualizar as informações da tela Invoice Details")
    public void o_usuario_visualizar_as_informações_da_tela_invoice_details() {
        Assert.assertTrue(detailsPage.validaInvoiceDetails());
    }

    @Entao("o usuario ira validar o nome do Hotel: {string}")
    public void o_usuario_ira_validar_o_nome_do_hotel(String message) {
        Assert.assertEquals(detailsPage.validaElementInvoiceDetails(),"Rendezvous Hotel");
    }

    @Entao("o usuario ira validar o nome do Invoice Date: {string}")
    public void o_usuario_ira_validar_o_nome_do_invoice_date(String message) {
        Assert.assertEquals(detailsPage.validaInvoiceDate(), message);
    }

    @Entao("o usuario ira validar o nome do Due Date: {string}")
    public void o_usuario_ira_validar_o_nome_do_due_date(String message) {
        Assert.assertEquals(detailsPage.validaDueDate(), message);
    }

    @Entao("o usuario ira validar o nome do Invoice Number: {string}")
    public void o_usuario_ira_validar_o_nome_do_invoice_number(String message) {
        Assert.assertEquals(detailsPage.validaInvoiceNumber(), message);
    }

    @Entao("o usuario ira validar o nome do Booking Code: {string}")
    public void o_usuario_ira_validar_o_nome_do_booking_code(String message) {
        Assert.assertEquals(detailsPage.validaBookingCode(), message);
    }

    @Entao("o usuario ira validar o nome do Customer Details: {string}")
    public void o_usuario_ira_validar_o_nome_do_customer_details(String message) {
        Assert.assertEquals(detailsPage.validaCustomDetails(), message);
    }

    @Entao("o usuario ira validar o nome do Room: {string}")
    public void o_usuario_ira_validar_o_nome_do_room(String message) {
        Assert.assertEquals(detailsPage.validaRoom(), message);
    }

    @Entao("o usuario ira validar o nome do Check In: {string}")
    public void o_usuario_ira_validar_o_nome_do_check_in(String message) {
        Assert.assertEquals(detailsPage.validaCheckIn(), message);
    }

    @Entao("o usuario ira validar o nome do Check Out: {string}")
    public void o_usuario_ira_validar_o_nome_do_check_out(String message) {
        Assert.assertEquals(detailsPage.validaCheckOut(), message);
    }

    @Entao("o usuario ira validar o nome do Total Stay Count: {string}")
    public void o_usuario_ira_validar_o_nome_do_total_stay_count(String message) {
        Assert.assertEquals(detailsPage.validaTotalStayCount(), message);
    }

    @Entao("o usuario ira validar o nome do Total Stay Amount Hotel: {string}")
    public void o_usuario_ira_validar_o_nome_do_total_stay_amount_hotel(String message) {
        Assert.assertEquals(detailsPage.validaTotalStayAmount(), message);
    }

    @Entao("o usuario ira validar o nome do Deposit Now: {string}")
    public void o_usuario_ira_validar_o_nome_do_deposit_now(String message) {
        Assert.assertEquals(detailsPage.validaDepositNow(), message);
    }

    @Entao("o usuario ira validar o nome do Tax & VAT: {string}")
    public void o_usuario_ira_validar_o_nome_do_tax_vat(String message) {
        Assert.assertEquals(detailsPage.validaTaxVat(), message);
    }

    @Entao("o usuario ira validar o nome do Total Amount: {string}")
    public void o_usuario_ira_validar_o_nome_do_total_amount(String message) {
        Assert.assertEquals(detailsPage.validaTotalAmount(), message);
    }

}

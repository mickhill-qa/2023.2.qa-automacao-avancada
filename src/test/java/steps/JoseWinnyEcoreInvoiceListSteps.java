package steps;

import io.cucumber.java.pt.*;
import pages.JoseWinnyEcoreInvoiceDetailsPage;
import pages.JoseWinnyEcoreInvoiceListPage;
import pages.JoseWinnyEcoreLoginPage;
import runner.base_class.BaseSteps;

public class JoseWinnyEcoreInvoiceListSteps extends BaseSteps {
    JoseWinnyEcoreLoginPage loginPage = new JoseWinnyEcoreLoginPage();
    JoseWinnyEcoreInvoiceListPage invoiceListPage = new JoseWinnyEcoreInvoiceListPage();
    JoseWinnyEcoreInvoiceDetailsPage invoiceDetailsPage = new JoseWinnyEcoreInvoiceDetailsPage();

    @E("preenche as credenciais validas")
    public void preencheAsCredenciaisValidas() {
        loginPage.preencherUsername("demouser");
        loginPage.preencherPassword("abc123");
        loginPage.clicarBtnLogin();
    }
    @Quando("o usuario clica no Invoice Link")
    public void oUsuarioClicaNoInvoiceLink() {
        invoiceListPage.clicarNoPrimeiroLink();
    }

    @Então("o sistema exibe a pagina Invoice Details")
    public void oSistemaExibeAPaginaInvoiceDetails() {

        invoiceDetailsPage.validarMudancaDePagina();
    }

    @E("a pagina Invoice Details exibe o campo Hotel Name com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoHotelNameCom(String _nome) {
        invoiceDetailsPage.validarHotelName(_nome);
    }

    @E("a pagina Invoice Details exibe o campo Invoice Number com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoInvoiceNumberCom(String _numero) {
//        invoiceDetailsPage.validarNumeroDeInvoice(_numero);
    }

    @E("a pagina Invoice Details exibe o campo Invoice Date com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoInvoiceDateCom(String arg0) {
    }

    @E("a pagina Invoice Details exibe o campo Due Date com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoDueDateCom(String arg0) {
    }

    @E("a pagina Invoice Details exibe o campo Booking Code com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoBookingCodeCom(String arg0) {
    }

    @E("a pagina Invoice Details exibe o campo Room com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoRoomCom(String arg0) {
    }

    @E("a pagina Invoice Details exibe o campo Total Stay Count com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoTotalStayCountCom(String arg0) {
    }

    @E("a pagina Invoice Details exibe o campo Total Stay Amount com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoTotalStayAmountCom(String arg0) {
    }

    @E("a pagina Invoice Details exibe o campo Check In com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoCheckInCom(String arg0) {
    }

    @E("a pagina Invoice Details exibe o campo Check Out com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoCheckOutCom(String arg0) {
    }

    @E("a pagina Invoice Details exibe o campo Customer Details com {string}, {string} e {string}")
    public void aPaginaInvoiceDetailsExibeOCampoCustomerDetailsComE(String arg0, String arg1, String arg2) {
    }

    @E("a pagina Invoice Details exibe o campo Deposit Now com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoDepositNowCom(String arg0) {
    }

    @E("a pagina Invoice Details exibe o campo Tax & VATe com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoTaxVATeCom(String arg0) {
    }

    @E("a pagina Invoice Details exibe o campo Total Amount com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoTotalAmountCom(String arg0) {
    }

}

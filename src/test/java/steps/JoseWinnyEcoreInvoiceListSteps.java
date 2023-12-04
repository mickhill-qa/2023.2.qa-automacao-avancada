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
        invoiceListPage.mudarAba();
        invoiceDetailsPage.validarMudancaDePagina();
    }

    @E("a pagina Invoice Details exibe o campo Hotel Name com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoHotelNameCom(String _nome) throws InterruptedException {
        invoiceDetailsPage.validarHotelName(_nome);
    }

    @E("a pagina Invoice Details exibe o campo Invoice Number com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoInvoiceNumberCom(String _numero) {
        invoiceDetailsPage.validarNumeroDeInvoice(_numero);
    }

    @E("a pagina Invoice Details exibe o campo Invoice Date com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoInvoiceDateCom(String _data) {
        invoiceDetailsPage.validarInvoiceDate(_data);
    }

    @E("a pagina Invoice Details exibe o campo Due Date com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoDueDateCom(String _data) {
        invoiceDetailsPage.validarDueDate(_data);
    }

    @E("a pagina Invoice Details exibe o campo Booking Code com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoBookingCodeCom(String _bookingCode) {
        invoiceDetailsPage.validarBookingCode(_bookingCode);
    }

    @E("a pagina Invoice Details exibe o campo Room com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoRoomCom(String _room) {
        invoiceDetailsPage.validarRoom(_room);
    }

    @E("a pagina Invoice Details exibe o campo Total Stay Count com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoTotalStayCountCom(String _count) {
        invoiceDetailsPage.validarTotalStayCount(_count);
    }

    @E("a pagina Invoice Details exibe o campo Total Stay Amount com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoTotalStayAmountCom(String _amount) {
        invoiceDetailsPage.validarTotalStayAmount(_amount);
    }

    @E("a pagina Invoice Details exibe o campo Check In com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoCheckInCom(String _data) {
        invoiceDetailsPage.validarCheckIn(_data);
    }

    @E("a pagina Invoice Details exibe o campo Check Out com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoCheckOutCom(String _data) {
        invoiceDetailsPage.validarCheckOut(_data);
    }

    @E("a pagina Invoice Details exibe o campo Customer Details com {string}, {string} e {string}")
    public void aPaginaInvoiceDetailsExibeOCampoCustomerDetailsComE(String _linha1, String _linha2, String _linha3) {
        invoiceDetailsPage.validarCustomerDetails(_linha1);
        invoiceDetailsPage.validarCustomerDetails(_linha2);
        invoiceDetailsPage.validarCustomerDetails(_linha3);
    }

    @E("a pagina Invoice Details exibe o campo Deposit Now com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoDepositNowCom(String _valor) {
        invoiceDetailsPage.validarDepositNow(_valor);
    }

    @E("a pagina Invoice Details exibe o campo Tax & VATe com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoTaxVATeCom(String _valor) {
        invoiceDetailsPage.validarTaxEVate(_valor);
    }

    @E("a pagina Invoice Details exibe o campo Total Amount com {string}")
    public void aPaginaInvoiceDetailsExibeOCampoTotalAmountCom(String _valor) {
        invoiceDetailsPage.validarTotalAmount(_valor);
    }

}

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
        screenshot();
    }
    @Quando("o usuario clica no Invoice Link")
    public void oUsuarioClicaNoInvoiceLink() {
        invoiceListPage.clicarNoPrimeiroLink();
        screenshot();
    }

    @Então("o sistema exibe a Invoice Details")
    public void oSistemaExibeAInvoiceDetails() {
        invoiceListPage.mudarAba();
        invoiceDetailsPage.validarMudancaDePagina();
        screenshot();
    }

    @E("a Invoice Details exibe o campo Hotel Name com {string}")
    public void aInvoiceDetailsExibeOCampoHotelNameCom(String _nome) throws InterruptedException {
        invoiceDetailsPage.validarHotelName(_nome);
    }

    @E("a Invoice Details exibe o campo Invoice Number com {string}")
    public void aInvoiceDetailsExibeOCampoInvoiceNumberCom(String _numero) {
        invoiceDetailsPage.validarNumeroDeInvoice(_numero);
    }

    @E("a Invoice Details exibe o campo Invoice Date com {string}")
    public void aInvoiceDetailsExibeOCampoInvoiceDateCom(String _data) {
        invoiceDetailsPage.validarInvoiceDate(_data);
    }

    @E("a Invoice Details exibe o campo Due Date com {string}")
    public void aInvoiceDetailsExibeOCampoDueDateCom(String _data) {
        invoiceDetailsPage.validarDueDate(_data);
    }

    @E("a Invoice Details exibe o campo Booking Code com {string}")
    public void aInvoiceDetailsExibeOCampoBookingCodeCom(String _bookingCode) {
        invoiceDetailsPage.validarBookingCode(_bookingCode);
    }

    @E("a Invoice Details exibe o campo Room com {string}")
    public void aInvoiceDetailsExibeOCampoRoomCom(String _room) {
        invoiceDetailsPage.validarRoom(_room);
    }

    @E("a Invoice Details exibe o campo Total Stay Count com {string}")
    public void aInvoiceDetailsExibeOCampoTotalStayCountCom(String _count) {
        invoiceDetailsPage.validarTotalStayCount(_count);
    }

    @E("a Invoice Details exibe o campo Total Stay Amount com {string}")
    public void aInvoiceDetailsExibeOCampoTotalStayAmountCom(String _amount) {
        invoiceDetailsPage.validarTotalStayAmount(_amount);
    }

    @E("a Invoice Details exibe o campo Check In com {string}")
    public void aInvoiceDetailsExibeOCampoCheckInCom(String _data) {
        invoiceDetailsPage.validarCheckIn(_data);
    }

    @E("a Invoice Details exibe o campo Check Out com {string}")
    public void aInvoiceDetailsExibeOCampoCheckOutCom(String _data) {
        invoiceDetailsPage.validarCheckOut(_data);
    }

    @E("a Invoice Details exibe o campo Customer Details com {string}, {string} e {string}")
    public void aInvoiceDetailsExibeOCampoCustomerDetailsComE(String _linha1, String _linha2, String _linha3) {
        invoiceDetailsPage.validarCustomerDetails(_linha1);
        invoiceDetailsPage.validarCustomerDetails(_linha2);
        invoiceDetailsPage.validarCustomerDetails(_linha3);
    }

    @E("a Invoice Details exibe o campo Deposit Now com {string}")
    public void aInvoiceDetailsExibeOCampoDepositNowCom(String _valor) {
        invoiceDetailsPage.validarDepositNow(_valor);
    }

    @E("a Invoice Details exibe o campo Tax & VATe com {string}")
    public void aInvoiceDetailsExibeOCampoTaxVATeCom(String _valor) {
        invoiceDetailsPage.validarTaxEVate(_valor);
    }

    @E("a Invoice Details exibe o campo Total Amount com {string}")
    public void aInvoiceDetailsExibeOCampoTotalAmountCom(String _valor) {
        invoiceDetailsPage.validarTotalAmount(_valor);
    }

}

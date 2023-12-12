package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.YohansEcoreInvoiceDetailsPage;
import pages.YohansEcoreInvoiceListPage;
import runner.base_class.BaseSteps;

public class YohansEcoreInvoiceDetailsSteps extends BaseSteps {
    YohansEcoreInvoiceDetailsPage invoiceDetailsPage = new YohansEcoreInvoiceDetailsPage();
    YohansEcoreInvoiceListPage invoiceListPage = new YohansEcoreInvoiceListPage();


    @Quando("o usuario clicar no Invoice Link")
    public void o_usuario_clicar_no_invoice_link() {
        invoiceListPage.clickLinkInvoiceDetails(1);
    }
    @Quando("o sistema exibi a pagina Invoice Details")
    public void o_sistema_exibi_a_pagina_invoice_details() {
        invoiceDetailsPage.switchContext();
        Assert.assertTrue(invoiceDetailsPage.isInvoiceDetailsPage());
    }
    @Entao("a pagina Invoice-Details exibe o campo Hotel Name com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_hotel_name_com(String string) {
        String textOnPage = invoiceDetailsPage.getHotelNameText();
        Assert.assertEquals(string, textOnPage);
    }
    @Entao("a pagina Invoice-Details exibe o campo Invoice Date com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_date_com(String string) {
        String textOnPage = invoiceDetailsPage.getInvoiceDateText();
        string = "Invoice Date: " + string;
        Assert.assertEquals(string, textOnPage);
    }

    @Entao("a pagina Invoice-Details exibe o campo Due Date com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_due_date_com(String string) {
        String textOnPage = invoiceDetailsPage.getDueDateText();
        string = "Due Date: " + string;
        Assert.assertEquals(string, textOnPage);
    }
    @Entao("a pagina Invoice-Details exibe o campo Invoice Number com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_number_com(String string) {
        String textOnPage = invoiceDetailsPage.getInvoiceNumberText();
        Assert.assertTrue(textOnPage.contains(string));
    }
    @Entao("a pagina Invoice-Details exibe o campo Booking Code com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_booking_code_com(String string) {
        String textOnPage = invoiceDetailsPage.getBookingCodeText();
        Assert.assertEquals(string, textOnPage);
    }
    @Entao("a pagina Invoice-Details exibe o campo Customer Details com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_customer_details_com(String string) {
        String textOnPage = invoiceDetailsPage.getCustomerDetailsText();
        String textOnPageFormated = textOnPage.replaceAll("\\n", " ");
        Assert.assertEquals(string, textOnPageFormated);
    }
    @Entao("a pagina Invoice-Details exibe o campo Room com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_room_com(String string) {
        String textOnPage = invoiceDetailsPage.getRoomText();
        Assert.assertEquals(string, textOnPage);
    }
    @Entao("a pagina Invoice-Details exibe o campo Check In com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_check_in_com(String string) {
        String textOnPage = invoiceDetailsPage.getCheckInText();
        Assert.assertEquals(string, textOnPage);
    }
    @Entao("a pagina Invoice-Details exibe o campo Check Out com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_check_out_com(String string) {
        String textOnPage = invoiceDetailsPage.getCheckOutText();
        Assert.assertEquals(string, textOnPage);
    }
    @Entao("a pagina Invoice-Details exibe o campo Total Stay Count com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_count_com(String string) {
        String textOnPage = invoiceDetailsPage.getTotalStayCountText();
        Assert.assertEquals(string, textOnPage);
    }
    @Entao("a pagina Invoice-Details exibe o campo Total Stay Amount com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_amount_com(String string) {
        String textOnPage = invoiceDetailsPage.getTotalStayAmountText();
        Assert.assertEquals(string, textOnPage);
    }
    @Entao("a pagina Invoice-Details exibe o campo Deposit Now com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_deposit_now_com(String string) {
        String textOnPage = invoiceDetailsPage.getDepositNowText();
        Assert.assertEquals(string, textOnPage);
    }
    @Entao("a pagina Invoice-Details exibe o campo Tax & VATe com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_tax_va_te_com(String string) {
        String textOnPage = invoiceDetailsPage.getTaxEVatText();
        Assert.assertNotEquals(textOnPage, string);
    }
    @Entao("a pagina Invoice-Details exibe o campo Total Amount com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_amount_com(String string) {
        String textOnPage = invoiceDetailsPage.getTotalAmountText();
        Assert.assertNotEquals(textOnPage, string);
    }

}

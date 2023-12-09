package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.LucasNorteEcoreInvoiceDetailsPage;
import pages.LucasNorteEcoreInvoiceListPage;
import runner.base_class.BaseSteps;

public class LucasNorteEcoreInvoiceDetailsSteps extends BaseSteps {

    LucasNorteEcoreInvoiceListPage paginaListaFatura = new LucasNorteEcoreInvoiceListPage();
    LucasNorteEcoreInvoiceDetailsPage paginaDetalheFatura = new LucasNorteEcoreInvoiceDetailsPage();

    @Quando("o cliente clica no Invoice Link, ln")
    public void o_cliente_clicar_no_invoice_link_ln() {
        paginaListaFatura.clickInvoiceDetails(1);
    }
    @Quando("o sistama exibe a pagina Invoice Details, ln")
    public void o_sistama_exibe_a_pagina_invoice_details_ln() {
        paginaDetalheFatura.paginaInvoiceDetails();
        screenshot();
    }
    @Entao("a pagina Invoice Details exibe o campo Hotel Name com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_hotel_name_com_ln(String _hotelName) {
        String textoNatela = paginaDetalheFatura.getTextHotelName();
        Assert.assertEquals(_hotelName, textoNatela);
    }
    @Entao("a pagina Invoice Details exibe o campo Invoice Date com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_date_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Due Date com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_due_date_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Invoice Number com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_number_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Booking Code com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_booking_code_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Customer Details com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_customer_details_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Room com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_room_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Check In com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_check_in_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Check Out com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_check_out_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Total Stay Count com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_count_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Total Stay Amount com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_amount_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Deposit Now com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_deposit_now_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Tax & VATe com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_tax_va_te_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a pagina Invoice Details exibe o campo Total Amount com {string}, ln")
    public void a_pagina_invoice_details_exibe_o_campo_total_amount_com_ln(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

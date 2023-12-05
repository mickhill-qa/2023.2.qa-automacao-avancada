package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.JoaquimNetoInvoiceDetailsPage;
import pages.JoaquimNetoInvoiceListEcorePage;
import runner.base_class.BaseSteps;

public class JoaquimNetoEcoreFaturasSteps extends BaseSteps {

    JoaquimNetoInvoiceListEcorePage paginaListaFatura = new JoaquimNetoInvoiceListEcorePage();

    JoaquimNetoInvoiceDetailsPage paginaDetalheFatura = new JoaquimNetoInvoiceDetailsPage();


    @Quando("o usuário clica em Invoice Details")
    public void o_usuário_clica_em_invoice_details() {
        paginaListaFatura.clicarbtnInvoiceDet();
    }

    @Quando("o sistama exibe a pagina Invoice Details")
    public void o_sistama_exibe_a_pagina_invoice_details() {
        Assert.assertTrue(paginaDetalheFatura.estouAqui());
    }

    @Entao("a pagina Invoice Details exibe o campo Hotel Name com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_hotel_name_com(String string3) {
        String hotelName3 = JoaquimNetoInvoiceDetailsPage.pegarhotelName;
        Assert.assertEquals(string3,hotelName3);
    }

    @Entao("a pagina Invoice Details exibe o campo Invoice Date com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_date_com(String string4) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Due Date com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_due_date_com(String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Invoice Number com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_number_com(String string6) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Booking Code com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_booking_code_com(String string7) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Customer Details com {string},{string}, {string}")
    public void a_pagina_invoice_details_exibe_o_campo_customer_details_com(String string8, String string28, String string38) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Room com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_room_com(String string9) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Check In com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_check_in_com(String string10) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Check Out com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_check_out_com(String string11) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Total Stay Count com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_count_com(String string12) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Total Stay Amount com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_amount_com(String string13) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Deposit Now com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_deposit_now_com(String string14) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Tax & VATe com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_tax_va_te_com(String string15) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("a pagina Invoice Details exibe o campo Total Amount com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_amount_com(String string16) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

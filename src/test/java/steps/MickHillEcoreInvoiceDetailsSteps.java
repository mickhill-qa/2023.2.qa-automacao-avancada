package steps;

import io.cucumber.java.pt.*;
import pages.MickHillInvoiceDetailsEcorePage;
import pages.MickHillInvoiceListEcorePage;
import runner.base_class.BaseSteps;

public class MickHillEcoreInvoiceDetailsSteps extends BaseSteps
{
    /**
     * Paginas
     * */
    MickHillInvoiceListEcorePage paginaListaFatura = new MickHillInvoiceListEcorePage();
    MickHillInvoiceDetailsEcorePage paginaDetalheFatura = new MickHillInvoiceDetailsEcorePage();

    @Quando("o cliente clicar no Invoice Link")
    public void o_cliente_clicar_no_invoice_link()
    {
        paginaListaFatura.clickInvoiceDetails(1);
        paginaDetalheFatura.estouAqui();
    }

    @Quando("o sistama exibe a pagina Invoice Details")
    public void o_sistama_exibe_a_pagina_invoice_details()
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Hotel Name com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_hotel_name_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Invoice Date com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_date_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Due Date com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_due_date_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Invoice Number com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_number_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Booking Code com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_booking_code_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Customer Details com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_customer_details_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Room com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_room_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Check In com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_check_in_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Check Out com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_check_out_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Total Stay Count com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_count_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Total Stay Amount com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_amount_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Deposit Now com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_deposit_now_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Tax & VATe com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_tax_va_te_com(String string)
    {
    }

    @Entao("a pagina Invoice Details exibe o campo Total Amount com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_amount_com(String string)
    {
    }
}

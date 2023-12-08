package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.ItaloEcoreInvoiceDetailsPage;
import pages.ItaloEcoreInvoiceListPage;
import runner.base_class.BaseSteps;


public class ItaloEcoreInvoiceDetailsSteps extends BaseSteps {
    ItaloEcoreInvoiceListPage paginaListaFatura = new ItaloEcoreInvoiceListPage();
    ItaloEcoreInvoiceDetailsPage paginaDetalheFatura = new ItaloEcoreInvoiceDetailsPage();

    @Quando("o usuario clicar no Invoice Link")
    public void o_usuario_clicar_no_invoice_linki()
    {
        paginaListaFatura.clickInvoiceDetails(1);
    }

    @Quando("o sistama mostra a pagina Invoice Details")
    public void o_sistama_mostra_a_pagina_invoice_detailsi()
    {
        paginaDetalheFatura.estouAqui();
        screenshot();
    }

    @Entao("a pagina Invoice Details mostra o campo Hotel Name com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_hotel_name_com(String _hotelName)
    {
        String textoNatela = paginaDetalheFatura.getTextHotelName();
        Assert.assertEquals(_hotelName, textoNatela);
    }

    @Entao("a pagina Invoice Details mostra o campo Invoice Date com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_invoice_date_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Due Date com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_due_date_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Invoice Number com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_invoice_number_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Booking Code com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_booking_code_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Customer Details com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_customer_details_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Room com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_room_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Check In com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_check_in_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Check Out com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_check_out_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Total Stay Count com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_total_stay_count_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Total Stay Amount com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_total_stay_amount_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Deposit Now com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_deposit_now_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Tax & VATe com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_tax_va_te_com(String string)
    {
    }

    @Entao("a pagina Invoice Details mostra o campo Total Amount com {string}")
    public void a_pagina_invoice_details_mostra_o_campo_total_amount_com(String string)
    {
    }
}

package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.MarcelaInvoiceDetailsEcorePage;
import pages.MarcelaInvoiceListEcorePage;
import runner.base_class.BaseSteps;


public class MarcelaEcoreInvoiceDetailsSteps extends BaseSteps {

    MarcelaInvoiceListEcorePage paginaListaFatura = new MarcelaInvoiceListEcorePage();
    MarcelaInvoiceDetailsEcorePage paginaDetalheFatura = new MarcelaInvoiceDetailsEcorePage();

    @Quando("o cliente clicar no Invoice Link")
    public void o_cliente_clicar_no_invoice_link()
    {
        paginaListaFatura.clickInvoiceDetails(1);
    }

    @Quando("o sistema exibe a pagina Invoice Details")
    public void o_sistema_exibe_a_pagina_invoice_details()
    {
        paginaDetalheFatura.estouAqui();
        screenshot();
    }

    @Entao("a pagina Invoice Details exibe o campo Hotel Name com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_hotel_name_com(String _hotelName)
    {
        String textoNatela = paginaDetalheFatura.getTextHotelName();
        Assert.assertEquals(_hotelName, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Invoice Date com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_date_com(String _invoiceDate)
    {
        String textoNatela = paginaDetalheFatura.getInvoiceDate();
        Assert.assertEquals(_invoiceDate, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Due Date com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_due_date_com(String _dueDate)
    {
        String textoNatela = paginaDetalheFatura.getDueDate();
        Assert.assertEquals(_dueDate, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Invoice Number com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_number_com(String _invoiceNumber)
    {
        String textoNatela = paginaDetalheFatura.getInvoiceNumber();
        Assert.assertEquals(_invoiceNumber, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Booking Code com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_booking_code_com(String _bookingCode)
    {
        String textoNatela = paginaDetalheFatura.getBookingCode();
        Assert.assertEquals(_bookingCode, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Customer Details com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_customer_details_com(String _customerDetails)
    {
        String textoNatela = paginaDetalheFatura.getCustomerDetails();
        Assert.assertEquals(_customerDetails, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Room com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_room_com(String _room)
    {
        String textoNatela = paginaDetalheFatura.getRoom();
        Assert.assertEquals(_room, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Check In com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_check_in_com(String _checkIn)
    {
        String textoNatela = paginaDetalheFatura.getCheckIn();
        Assert.assertEquals(_checkIn, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Check Out com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_check_out_com(String _checkOut)
    {
        String textoNatela = paginaDetalheFatura.getCheckOut();
        Assert.assertEquals(_checkOut, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Total Stay Count com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_count_com(String _totalStayCount)
    {
        String textoNatela = paginaDetalheFatura.getTotalStayCount();
        Assert.assertEquals(_totalStayCount, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Total Stay Amount com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_amount_com(String _totalStayAmount)
    {
        String textoNatela = paginaDetalheFatura.getTotalStayAmount();
        Assert.assertEquals(_totalStayAmount, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Deposit Nowt com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_deposit_nowt_com(String _depositNowt)
    {
        String textoNatela = paginaDetalheFatura.getDepositNowt();
        Assert.assertEquals(_depositNowt, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Tax & VAT com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_tax_vat_com(String _taxVat)
    {
        String textoNatela = paginaDetalheFatura.getTaxVat();
        Assert.assertEquals(_taxVat, textoNatela);
    }

    @Entao("a pagina Invoice Details exibe o campo Total Amount com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_amount_com(String _totalAmount)
    {
        String textoNatela = paginaDetalheFatura.getTotalAmount();
        Assert.assertEquals(_totalAmount, textoNatela);
    }

}

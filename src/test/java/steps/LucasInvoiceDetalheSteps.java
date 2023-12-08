package steps;

import org.junit.Assert;
import pages.LucasRHomePage;
import pages.LucasRInvoiceDetailPage;
import runner.base_class.BaseSteps;
import io.cucumber.java.pt.*;

import java.util.Arrays;

public class LucasInvoiceDetalheSteps extends BaseSteps {

    LucasRHomePage HomeUsuario = new LucasRHomePage();
    LucasRInvoiceDetailPage InvoiceDetail = new LucasRInvoiceDetailPage();
    @Quando("o usuario clicar detalhe da fatura")
    public void o_usuario_clicar_detalhe_da_fatura() {
        HomeUsuario.clickInvoiceDetail();
        screenshot();
    }
    @E("o sistema exibe a pagina Invoice Details")
    public void o_sistema_exibe_a_pagina_invoice_details() {
        Assert.assertEquals("Invoice Details", InvoiceDetail.getTituloDetalheFatura());
    }
    @Entao("a pagina Invoice Details exibe o campo Hotel Name com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_hotel_name_com(String _nameHotel) {
        String textoNameHotel = InvoiceDetail.getNameHotel();
        Assert.assertEquals(_nameHotel, textoNameHotel);
    }
    @E("a pagina Invoice Details exibe o campo Invoice Date com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_date_com(String _invoiceDate) {
        String textoInvoiceDate = InvoiceDetail.getDateInvoice();
        Assert.assertEquals("Invoice Date: "+_invoiceDate, textoInvoiceDate);
    }
    @E("a pagina Invoice Details exibe o campo Due Date com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_due_date_com(String _dueDate) {
        String textoDueDate = InvoiceDetail.getDueDate();
        Assert.assertEquals("Due Date: "+_dueDate, textoDueDate);
    }
   @E("a pagina Invoice Details exibe o campo Invoice Number com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_invoice_number_com(String _numberInvoice) {
        String textoNumberInvoice = InvoiceDetail.getNumberInvoice();
        Assert.assertEquals("Invoice #"+_numberInvoice+" details", textoNumberInvoice);
    }
    @E("a pagina Invoice Details exibe o campo Booking Code com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_booking_code_com(String _numberBooking) {
        String textoNumberBooking = InvoiceDetail.getNumberBooking();
        Assert.assertEquals("Booking Code"+_numberBooking, textoNumberBooking);
    }
    @E("a pagina Invoice Details exibe o campo Customer Details com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_customer_details_com(String _customDetail) {
        String textoCustomDetails = Arrays.toString(InvoiceDetail.getCustomDetails());
        Assert.assertEquals("["+_customDetail+"]", textoCustomDetails);
    }
    @E("a pagina Invoice Details exibe o campo Room com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_room_com(String _room) {
        String textoRoom = InvoiceDetail.getRoom();
        Assert.assertEquals("Room " +_room, textoRoom);
    }
    @E("a pagina Invoice Details exibe o campo Check In com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_check_in_com(String _checkIn) {
        String textoCheckIn = InvoiceDetail.getChekIn();
        Assert.assertEquals("Check-In "+_checkIn, textoCheckIn);
    }
    @E("a pagina Invoice Details exibe o campo Check Out com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_check_out_com(String _checkout) {
        String textoCheckOut = InvoiceDetail.getCheckOut();
        Assert.assertEquals("Check-Out "+_checkout, textoCheckOut);
    }
    @E("a pagina Invoice Details exibe o campo Total Stay Count com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_count_com(String _stayCount) {
        String textoStayCount = InvoiceDetail.getStayCount();
        Assert.assertEquals(_stayCount, textoStayCount );
    }
    @E("a pagina Invoice Details exibe o campo Total Stay Amount com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_stay_amount_com(String _stayAmount) {
        String textoStayAmount = InvoiceDetail.getStayAmount();
        Assert.assertEquals("$"+_stayAmount, textoStayAmount);
    }
    @E("a pagina Invoice Details exibe o campo Deposit Now com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_deposit_now_com(String _depositNow) {
        String textoDepositNow = InvoiceDetail.getDepositNow();
        Assert.assertEquals("USD $"+_depositNow, textoDepositNow);
    }
    @E("a pagina Invoice Details exibe o campo Tax & VATe com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_tax_va_te_com(String _taxVat) {
        String textoTaxVat = InvoiceDetail.getStayTaxVat();
        Assert.assertEquals("USD $"+_taxVat, textoTaxVat);
    }
    @E("a pagina Invoice Details exibe o campo Total Amount com {string}")
    public void a_pagina_invoice_details_exibe_o_campo_total_amount_com(String _totalAmount) {
        String textoTotalAmount = InvoiceDetail.getStayTotalAmount();
        Assert.assertEquals("USD $"+_totalAmount, textoTotalAmount);
    }



}

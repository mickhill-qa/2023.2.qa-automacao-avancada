package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.IngridInvoiceEcorePage;
import pages.IngridLoginEcorePage;
import runner.base_class.BaseSteps;

public class IngridEcoreInvoiceSteps extends BaseSteps {
    IngridInvoiceEcorePage invoicePage = new IngridInvoiceEcorePage();
    IngridLoginEcorePage loginPage = new IngridLoginEcorePage();

    @Dado("que o usuario logado esta na pagina de listagem de Invoice")
    public void given_logged_user_in_invoice_list_page(){
        loginPage.open();
        loginPage.sendUsername("demouser");
        loginPage.sendPassword("abc123");
        loginPage.clickBtnLogin();

        Assert.assertTrue(invoicePage.isInvoiceListUrl());
    }

    @Quando("o usuario clicar no link do hotel")
    public void when_user_click_hotel_link(){
        invoicePage.clickInvoiceDetailsLink();
    }

    @Entao("o sistema redireciona o usuario para a pagina de detalhes")
    public void then_system_shows_invoice_details_to_user(){
        invoicePage.switchToInvoiceDetailsPage();
        invoicePage.isInvoiceDetailsUrl();
    }

    @Entao("mostra {string} no campo Hotel name")
    public void show_hotel_name(String _hotelName){
        String hotelName = invoicePage.getHotelName();
        Assert.assertEquals(hotelName, _hotelName);
    }

    @Entao("mostra {string} no campo Invoice date")
    public void show_invoice_date(String _invoiceDate){
        String invoiceDate = invoicePage.getInvoiceDate();
        Assert.assertEquals(invoiceDate, _invoiceDate);
    }

    @Entao("mostra {string} no campo Due Date")
    public void show_due_date(String _dueDate){
        String dueDate = invoicePage.getDueDate();
        Assert.assertEquals(dueDate, _dueDate);
    }

    @Entao("mostra {string} no campo Invoice Number")
    public void show_invoice_number(String _invoiceNumber){
        String invoiceNumber = invoicePage.getInvoiceNumber();
        Assert.assertEquals(invoiceNumber, _invoiceNumber);
    }

    @Entao("mostra {string} no campo Booking Code")
    public void show_booking_code(String _bookingCode){
         String bookingCode = invoicePage.getBookingDetails().get("Booking Code");
         Assert.assertNotNull(bookingCode);
         Assert.assertEquals(_bookingCode, bookingCode);

    }

    @Entao("mostra {string} no campo Customer Details")
    public void show_customer_details(String _customerDestails){
        String customerDestails = invoicePage.getCustomerDetails();
        Assert.assertEquals(customerDestails,_customerDestails);
    }

    @Entao("mostra {string} no campo Room")
    public void show_room(String _room){
        String roomInfo = invoicePage.getBookingDetails().get("Room");
        Assert.assertNotNull(roomInfo);
        Assert.assertEquals(_room, roomInfo);
    }

    @Entao("mostra {string} no campo Total Stay Count")
    public void show_total_stay_count(String _totalStayCount){
        String stayCountInfo = invoicePage.getBookingDetails().get("Total Stay Count");
        Assert.assertNotNull(stayCountInfo);
        Assert.assertEquals(_totalStayCount, stayCountInfo);
    }

    @Entao("mostra {string} no campo Total Stay Amount")
    public void show_total_stay_amount(String _totalStayAmount){
        String stayAmount = invoicePage.getBookingDetails().get("Total Stay Amount");
        Assert.assertNotNull(stayAmount);
        Assert.assertEquals(_totalStayAmount, stayAmount);
    }

    @Entao("mostra {string} no campo Check In")
    public void show_check_in(String _checkIn){
        String checkIn = invoicePage.getBookingDetails().get("Check-In");
        Assert.assertNotNull(checkIn);
        Assert.assertEquals(_checkIn, checkIn);
    }

    @Entao("mostra {string} no campo Check Out")
    public void show_check_out(String _checkOut){
         String ckeckOut = invoicePage.getBookingDetails().get("Check-Out");
         Assert.assertNotNull(ckeckOut);
         Assert.assertEquals(_checkOut, ckeckOut);
    }

    @Entao("mostra {string} no campo Deposit Nowt")
    public void show_deposit_nowt(String _depositNowt){
         String depositNowt = invoicePage.getBillingDetails().get("Deposit Nowt");
         Assert.assertNotNull(depositNowt);
         Assert.assertEquals(_depositNowt, depositNowt);
    }
    @Entao("mostra {string} no campo Tax & VAT")
    public void show_tax_and_vat(String _taxAndVat){
         String taxAndVat = invoicePage.getBillingDetails().get("Tax&VAT");
         Assert.assertNotNull(taxAndVat);
         Assert.assertTrue(_taxAndVat.contains(taxAndVat));
    }

    @Entao("mostra {string} no campo Total Amount")
    public void show_total_Amount(String _totalAmount){
        String totalAmount = invoicePage.getBillingDetails().get("Total Amount");
        Assert.assertNotNull(totalAmount);
        Assert.assertTrue(_totalAmount.contains(totalAmount));
    }
}

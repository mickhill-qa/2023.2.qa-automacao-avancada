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
        //TODO Do Brooking Code step
    }

    @Entao("mostra {string} no campo Customer Details")
    public void show_customer_details(String _customerDestails){
        String customerDestails = invoicePage.getCustomerDetails();
        Assert.assertEquals(customerDestails,_customerDestails);
    }

    @Entao("mostra {string} no campo Room")
    public void show_room(String _room){
        //TODO Do Room step
    }

    @Entao("mostra {string} no campo Total Stay Count")
    public void show_total_stay_count(String _totalStayCount){
        //TODO Do step
    }

    @Entao("mostra {string} no campo Total Stay Amount")
    public void show_total_stay_amount(String _totalStayAmount){
        //TODO Do step
    }

    @Entao("mostra {string} no campo Check In")
    public void show_check_in(String _checkIn){
        //TODO Do step
    }

    @Entao("mostra {string} no campo Check Out")
    public void show_check_out(String _checkOut){
        //TODO Do step
    }

    @Entao("mostra {string} no campo Deposit Now")
    public void show_deposit_now(String _depositNom){
        //TODO Do step
    }
    @Entao("mostra {string} no campo Tax & VAT")
    public void show_tax_and_vat(String _taxAndVat){
        //TODO Do step
    }

    @Entao("mostra {string} no campo Total Amount")
    public void show_total_Amount(String _totalAmount){
        //TODO Do step
    }
}

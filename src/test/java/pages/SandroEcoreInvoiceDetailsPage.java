package pages;

import org.openqa.selenium.By;
import runner.support.Actions;

public class SandroEcoreInvoiceDetailsPage extends Actions {
    String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/invoice/0";
    private By invoiceNumber = By.cssSelector("h6.mt-2");
    private By validaInvoiceDetails = By.cssSelector("h2");
    private By hotel = By.cssSelector("h4");
    private By invoiceDate = By.cssSelector("section ul > li:nth-child(1)");
    private By dueDate = By.cssSelector("ul > li:nth-child(2)");
    private By bookingDetails = By.cssSelector(".table > tbody:nth-child(1) > tr > td:nth-child(2)");
    private By customerDetails = By.cssSelector("div > div");
    private By billingDetails = By.cssSelector(".table > tbody:nth-child(2) > tr > td");

    public Boolean validaInvoiceDetails() {
        String urlAtual = get_url();
        if (urlAtual.contains(url))
            return true;
        else
            return false;
    }

    public String validaElementInvoiceDetails(){
        String element = get_text(hotel);
        return element;
    }

    public String validaInvoiceDate(){
        return getPositionText(get_text(invoiceDate), ": ", 1) ;
    }

    public String validaDueDate(){
        return getPositionText(get_text(dueDate), ": ", 1) ;
    }

    public String validaInvoiceNumber(){
        return getPositionTextStringExpecific(get_text(invoiceNumber), " ",1, 1);
    }

    public String validaBookingCode(){
        return get_text_index(bookingDetails, 0);
    }

    public String validaRoom(){
        return get_text_index(bookingDetails, 1);
    }

    public String  validaTotalStayCount() {
        return get_text_index(bookingDetails, 2);
    }

    public String  validaTotalStayAmount() {
        return get_text_index(bookingDetails, 3);
    }

    public String validaCheckIn(){
        return get_text_index(bookingDetails, 4);
    }

    public String  validaCheckOut() {
        return get_text_index(bookingDetails, 5);
    }

    public String validaCustomDetails(){
        return get_text(customerDetails).replace("\n", " ");
    }

    public String  validaDepositNow() {
        return get_text_index(billingDetails, 0);
    }

    public String  validaTaxVat() {
        return get_text_index(billingDetails, 1);
    }

    public String  validaTotalAmount() {
        return get_text_index(billingDetails, 2);
    }





}

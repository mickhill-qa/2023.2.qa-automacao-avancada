package steps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AutomationExampleInvoiceListPage;
import pages.AutomationExampleLoginPage;

public class InvoiceDetailsSteps {
    AutomationExampleLoginPage loginPage = new AutomationExampleLoginPage();
    AutomationExampleInvoiceListPage invoiceListPage = new AutomationExampleInvoiceListPage();
    @Given("that the user is logged into the system and the user is on the Invoice List screen")
    public void that_the_user_is_logged_into_the_system_and_the_user_is_on_the_invoice_list_screen() {
        loginPage.abrir();
        loginPage.fillUsernameAndPasswordFields("demouser", "abc123");
        loginPage.clickButton();
    }
    @When("the user clicks on the first invoice details link displayed on the screen")
    public void the_user_clicks_on_the_first_invoice_details_link_displayed_on_the_screen() {
        invoiceListPage.clickFirstInvoiceLink();
    }
    @Then("the user should be redirected to the invoice details screen")
    public void the_user_should_be_redirected_to_the_invoice_details_screen() {
        invoiceListPage.switchWindow();
    }
    @Then("the system should match the data provided in the table.")
    public void the_system_should_match_the_data_provided_in_the_table() {
        String nameHotel = invoiceListPage.getHotelName();
        Assert.assertEquals(nameHotel, "Rendezvous Hotel");

        String invoiceDate = invoiceListPage.getInvoiceDate();
        Assert.assertEquals(invoiceDate, "Invoice Date: 14/01/2018");

        String dueDate = invoiceListPage.getDueDate();
        Assert.assertEquals(dueDate, "Due Date: 15/01/2018");

        String invoiceNumber = invoiceListPage.getInvoiceNumber();
        Assert.assertEquals(invoiceNumber, "Invoice #110 details");

        String bookingCode = invoiceListPage.getBookingCode();
        Assert.assertEquals(bookingCode,"0875");

        String customerDetails = invoiceListPage.getCustomerDetails();
        Assert.assertEquals(customerDetails, "JOHNY SMITH" + "\n" +"R2, AVENUE DU MAROC" + "\n" +"123456");

        String room = invoiceListPage.getRoom();
        Assert.assertEquals(room, "Superior Double");

        String chekIn = invoiceListPage.getChekin();
        Assert.assertEquals(chekIn,"14/01/2018");

        String checkOut = invoiceListPage.getCheckout();
        Assert.assertEquals(checkOut,"15/01/2018");

        String totalStayCount = invoiceListPage.getTotalStayCount();
        Assert.assertEquals(totalStayCount,"1");

        String totalStayAmount = invoiceListPage.getTotalStayAmount();
        Assert.assertEquals(totalStayAmount,"$150");

        String depositNow = invoiceListPage.getDepositNow();
        Assert.assertEquals(depositNow,"USD $20.90");

        String taxEVAT = invoiceListPage.getTaxEVAT();
        Assert.assertEquals(taxEVAT,"USD $19");

        String totalAmount = invoiceListPage.getTotalAmount();
        Assert.assertEquals(totalAmount,"USD $209");


    }
}

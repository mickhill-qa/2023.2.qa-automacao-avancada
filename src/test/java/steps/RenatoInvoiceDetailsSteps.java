package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RenatoInvoiceDetailsPage;
import pages.RenatoInvoicePage;
import pages.RenatoLoginPage;
import runner.base_class.BaseSteps;

public class RenatoInvoiceDetailsSteps extends BaseSteps {

    RenatoInvoicePage renatoInvoicePage = new RenatoInvoicePage();
    RenatoLoginPage renatoLoginPage = new RenatoLoginPage();
    RenatoInvoiceDetailsPage renatoInvoiceDetailsPage = new RenatoInvoiceDetailsPage();

    @Given("Have a successful login with the credentials provided")
    public void have_a_successful_login_with_the_credentials_provided() {
        renatoLoginPage.open("https://automation-sandbox-python-mpywqjbdza-uc.a.run.app");
        renatoLoginPage.fillTheFields("demouser", "abc123");
    }
    @Given("Page Invoice List is shown")
    public void page_invoice_list_is_shown() {
        Assert.assertEquals("Invoice List", renatoInvoicePage.validateTheInvoiceListPage());
    }
    @When("Click the Invoice Details link for the first item presented in the screen")
    public void click_the_invoice_details_link_for_the_first_item_presented_in_the_screen() {
        renatoInvoicePage.clickBtnInvoiceDetails();
    }
    @Then("The application opens the Invoice Details screen")
    public void the_application_opens_the_invoice_details_screen() {
        renatoInvoiceDetailsPage.validateTheInvoiceDetailsPage();
        Assert.assertEquals(renatoInvoiceDetailsPage.getUrl(),
                "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/invoice/0");
    }

    @Then("Validate the information presented")
    public void validate_the_information_presented()  {
        Assert.assertEquals("Rendezvous Hotel", renatoInvoiceDetailsPage.validateHotelName());
//        Assert.assertEquals("14/01/2018", renatoInvoiceDetailsPage.validateInvoiceDate());
//        Assert.assertEquals("15/01/2018", renatoInvoiceDetailsPage.validateDueDate());
//        Assert.assertEquals("110", renatoInvoiceDetailsPage.validateInvoiceNumber());
//        Assert.assertEquals("0875", renatoInvoiceDetailsPage.validateBookingCode());
//        Assert.assertEquals("JOHNY SMITH R2, AVENUE DU MAROC 123456",
//                renatoInvoiceDetailsPage.validateCustomerDetails());
//        Assert.assertEquals("Superior Double", renatoInvoiceDetailsPage.validateRoom());
//        Assert.assertEquals("14/01/2018", renatoInvoiceDetailsPage.validateCheckIn());
//        Assert.assertEquals("15/01/2018", renatoInvoiceDetailsPage.validateCheckOut());
//        Assert.assertEquals("1", renatoInvoiceDetailsPage.validateTotalStayCount());
//        Assert.assertEquals("$150", renatoInvoiceDetailsPage.validateTotalStayAmount());
//        Assert.assertEquals("USD $20.90", renatoInvoiceDetailsPage.validateDepositNow());
//        Assert.assertEquals("USD $19.00", renatoInvoiceDetailsPage.validateTaxVat());
//        Assert.assertEquals("USD $209.00", renatoInvoiceDetailsPage.validateTotalAmount());
    }
}

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
        renatoLoginPage.fillTheFields("demouser","abc123");
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

    @Then("validate the hotel name information")
    public void validate_the_hotel_name_information() {
        Assert.assertEquals("Rendezvous Hotel", renatoInvoiceDetailsPage.validateHotelName());
    }
    @Then("validate the Invoice Date information")
    public void validate_the_invoice_date_information() {
        Assert.assertEquals("14/01/2018", renatoInvoiceDetailsPage.validateInvoiceDate());
//        Assert.assertTrue(renatoInvoiceDetailsPage.validateInvoiceDate().contains("14/01/2018"));
    }
    @Then("validate the Due Date information")
    public void validate_the_due_date_information() {
        Assert.assertEquals("15/01/2018", renatoInvoiceDetailsPage.validateDueDate());
//        Assert.assertTrue(renatoInvoiceDetailsPage.validateDueDate().contains("15/01/2018"));
    }
    @Then("validate the Invoice Number information")
    public void validate_the_invoice_number_information() {
        Assert.assertTrue(renatoInvoiceDetailsPage.validateInvoiceNumber().contains("110"));
    }
    @Then("validate the Booking Code information")
    public void validate_the_booking_code_information() {
        Assert.assertEquals("0875", renatoInvoiceDetailsPage.validateBookingCode());
    }
    @Then("validate the Customer Details information")
    public void validate_the_customer_details_information() {
        Assert.assertEquals("JOHNY SMITH\n" +
                "R2, AVENUE DU MAROC\n" +
                "123456", renatoInvoiceDetailsPage.validateCustomerDetails());
    }
    @Then("validate the Room information")
    public void validate_the_room_information() {
        Assert.assertEquals("Superior Double", renatoInvoiceDetailsPage.validateRoom());
    }
    @Then("validate the Check In information")
    public void validate_the_check_in_information() {
        Assert.assertEquals("14/01/2018", renatoInvoiceDetailsPage.validateCheckIn());
    }
    @Then("validate the Check Out information")
    public void validate_the_check_out_information() {
        Assert.assertEquals("15/01/2018", renatoInvoiceDetailsPage.validateCheckOut());
    }
    @Then("validate the Total Stay Count information")
    public void validate_the_total_stay_count_information() {
        Assert.assertEquals("1", renatoInvoiceDetailsPage.validateTotalStayCount());
    }
    @Then("validate the Total Stay Amount information")
    public void validate_the_total_stay_amount_information() {
        Assert.assertEquals("$150", renatoInvoiceDetailsPage.validateTotalStayAmount());
    }
    @Then("validate the Deposit Now information")
    public void validate_the_deposit_now_information() {
        Assert.assertEquals("USD $20.90", renatoInvoiceDetailsPage.validateDepositNow());
    }
    @Then("validate the Tax Vat information")
    public void validate_the_tax_vat_information() {
        Assert.assertTrue(renatoInvoiceDetailsPage.validateTaxVat().contains("USD $19"));
    }
    @Then("validate the Total Amount information")
    public void validate_the_total_amount_information() {
        Assert.assertEquals("USD $209", renatoInvoiceDetailsPage.validateTotalAmount());
    }

}

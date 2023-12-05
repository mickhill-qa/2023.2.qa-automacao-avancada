package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EdInvoicEcorePage;
import pages.EdLoginEcorePage;
import runner.base_class.BaseSteps;


public class EdEcoreLoginSteps extends BaseSteps {

    EdLoginEcorePage loginPage = new EdLoginEcorePage();
    EdInvoicEcorePage invoiceListPage = new EdInvoicEcorePage();

    @Given("the login page is loaded")
    public void the_login_page_is_loaded() {
        loginPage.open();
    }

    @When("the user inserts valid credentials and clicks on the login button")
    public void the_user_inserts_valid_credentials() {
        loginPage.fillUsernameField("demouser");
        loginPage.fillPasswordField("abc123");
        loginPage.LoginBtnClick();
    }
    @Then("the system will redirect the user to the invoice list")
    public void the_system_will_redirect_the_user_to_the_invoice_list() {
            Assert.assertTrue(invoiceListPage.ValidInvoiceListPage());
    }
}

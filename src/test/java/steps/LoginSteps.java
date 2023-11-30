package steps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AutomationExampleInvoiceListPage;
import pages.AutomationExampleLoginPage;
import runner.base_class.BasePage;
import runner.base_class.BaseSteps;

public class LoginSteps extends BaseSteps {
    AutomationExampleLoginPage loginPage = new AutomationExampleLoginPage();
    AutomationExampleInvoiceListPage listPage = new AutomationExampleInvoiceListPage();
    @Given("that the user is on the login page")
    public void that_the_user_is_on_the_login_page() {
        loginPage.abrir();
    }
    @When("the user fills in the fields username and password with valid data")
    public void the_user_fills_in_the_fields_username_and_password_with_valid_data() {
        loginPage.fillUsernameAndPasswordFields("demouser", "abc123");
    }
    @And("click the login button")
    public void clickTheLoginButton() {
        loginPage.clickButton();
    }
    @Then("application should redirect the user to the Page Invoice List")
    public void application_should_redirect_the_user_to_the_page_invoice_list() {
        String tittle = listPage.getTittleInvoiceList();
        Assert.assertEquals(tittle, "Invoice List");
        screenshot();
    }
    @Then("the application shows the message: {string}")
    public void the_application_shows_the_message(String _wrongMessage) {
        String _currentMessage = loginPage.getNotification();
        Assert.assertEquals(_currentMessage, _wrongMessage);
    }
    @When("the user fills in the fields username {string} and password {string} with invalid data")
    public void theUserFillsInTheFieldsUsernameAndPasswordWithInvalidData(String arg0, String arg1) {
        loginPage.fillUsernameAndPasswordFields(arg0, arg1);
    }
}

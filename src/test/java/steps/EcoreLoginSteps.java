package steps;


import io.cucumber.java.en.*;
import pages.EcoreLoginPage;
import runner.base_class.BaseSteps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EcoreLoginSteps extends BaseSteps {

    EcoreLoginPage pageLogin = new EcoreLoginPage();

    @Given("for the user to access the login page")
    public void for_the_user_to_access_the_login_page() {
        pageLogin.open();
        screenshot();
    }
    @When("the user the fields with valid data")
    public void the_user_the_fields_with_valid_data() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
        String formattedDate = myDateObj.format(myFormatObj);

        String name = "demouser";
        String password = "abc123";

        scenario.log("name: " + name);
        scenario.log("password: " + password);

        pageLogin.tofillinName(name);
        pageLogin.tofillinPassword(password);
        screenshot();
    }

    @When("the user clicks on Login")
    public void the_user_clicks_on_login() { pageLogin.clickLogin(); screenshot();}


    @Then("the page is logged in")
    public void the_page_is_logged_in() {

    }

}

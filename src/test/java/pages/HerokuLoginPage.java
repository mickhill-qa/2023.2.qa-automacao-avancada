package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class HerokuLoginPage extends BasePage{
    private String url = "https://the-internet.herokuapp.com/login";
    private By inputUsername = By.name("username");
    private By inputPassword = By.name("password");
    private By loginBtn = By.cssSelector("i.fa.fa-2x.fa-sign-in");
    private By errorMessage = By.id("flash");



    public void getUrl()
    {
        driver.get(url);
    }

    public void fillUsername(String _username)
    {

        driver.findElement(inputUsername).sendKeys(_username);
    }

    public void fillPassword(String _password)
    {

        driver.findElement(inputPassword).sendKeys(_password);
    }
    public void loginBtnClick(){
        driver.findElement(loginBtn).click();
    }
    public boolean errorMessageIsShown() {
        String errorMessageText = driver.findElement(errorMessage).getText();
        return errorMessageText.contains("The provided credentials are invalid");
    }

    public boolean securePageIsLoaded(){
        String expectedUrl = "https://the-internet.herokuapp.com/secure";
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.equals(expectedUrl);
    }
    public boolean errorMessageRequiresAllFields() {
        String errorMessageText = driver.findElement(errorMessage).getText();
        return errorMessageText.contains("All the fields are required");
    }

}

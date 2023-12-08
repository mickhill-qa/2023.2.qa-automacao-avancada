package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class AlexsandroEcore2LoginPage extends BasePage {

    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
    private By inpUsername = By.name("username");
    private By inpPassword = By.name("password");
    private By btnLogin = By.id("btnLogin");
    private By textAlertError = By.cssSelector("[role='alert']");
    public void open() { driver.get(url); }
    public void fillUsername(String _username) { driver.findElement(inpUsername).sendKeys(_username); }
    public void fillPassword(String _password) { driver.findElement(inpPassword).sendKeys(_password);}
    public void clickBtnLogin() { driver.findElement(btnLogin).click(); }
    public String takeMsgError() {
        waitElementVisible(textAlertError, 5);
        return driver.findElement(textAlertError).getText();
    }

}

package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class FelipeAutomationExampleLoginPage extends BasePage {
    //mapping
    private String urlLogin = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/";
    private By inputUsername = By.cssSelector("input[name='username']");
    private By inputPassword = By.cssSelector("input[name='password']");
    private By loginButton = By.id("btnLogin");
    private By notificationText = By.cssSelector("div[role='alert']");

    //acctions
    public void abrir() {
        driver.get(urlLogin);
    }
    public void fillUsernameAndPasswordFields(String username, String password){
        driver.findElement(inputUsername).sendKeys(username);
        driver.findElement(inputPassword).sendKeys(password);
    }
    public void clickButton(){
        driver.findElement(loginButton).click();
    }
    public String getNotification() {
        waitElementVisible(notificationText, 5);
        return driver.findElement(notificationText).getText();
    }
}

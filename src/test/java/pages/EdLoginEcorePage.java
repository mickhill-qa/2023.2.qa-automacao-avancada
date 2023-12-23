package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class EdLoginEcorePage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
    private By UsernameInput = By.name("username");
    private By UsernamePassword = By.name("password");
    private By LoginBtn = By.id("btnLogin");
    private By FailedLoginMessage = By.className("alert-danger");

    public void open(){
        driver.get(url);
    }

    public void fillUsernameField(String _username) {
        driver.findElement(UsernameInput).sendKeys(_username);
    }
    public void fillPasswordField(String _password)
    {

        driver.findElement(UsernamePassword).sendKeys(_password);
    }
    public void LoginBtnClick()
    {
        driver.findElement(LoginBtn).click();
    }

    public String getFailedLoginMessage() {
        return driver.findElement(FailedLoginMessage).getText();
    }
}
package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;
import org.openqa.selenium.Keys;

public class LoginPage extends BasePage {

    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/";
    private By inputUsename = By.cssSelector("input[name='username']");
    private By inputPassword = By.cssSelector("input[name='password']");
    private By buttonLogin = By.cssSelector("#btnLogin");

    public void abrir() {
        driver.get(url);
    }

    public void preencherUsername(String _username) {
        driver.findElement(inputUsename).sendKeys(_username);
    }

    public void preencherPassword(String _password) {
        driver.findElement(inputPassword).sendKeys(_password);
    }

    public void submeterLogin(){
        driver.findElement(buttonLogin).click();
    }
}

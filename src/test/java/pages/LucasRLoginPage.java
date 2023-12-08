package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class LucasRLoginPage extends BasePage {

    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/";
    private By inputUsename = By.cssSelector("input[name='username']");
    private By inputPassword = By.cssSelector("input[name='password']");
    private By buttonLogin = By.cssSelector("#btnLogin");
    private By alertUsuarioIncorreto = By.xpath("//div[@role='alert']");
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

    public String getAlertaLoginSenhaIncoreto() {
        waitElementVisible(alertUsuarioIncorreto, 10);
        return driver.findElement(alertUsuarioIncorreto).getText();
    }
}

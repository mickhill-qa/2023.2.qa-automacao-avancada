package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class MickHillLoginEcorePage extends BasePage
{
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
    private By inputUsername = By.name("username");
    private By inputPassword = By.name("password");
    private By btnLogin = By.id("btnLogin");
    private By textAlertaErro = By.cssSelector("[role='alert']");

    public void abrir ()
    {
        driver.get(url);
    }

    public void preencherUsername(String _username)
    {
        driver.findElement(inputUsername).sendKeys(_username);
    }

    public void preencherPassword(String _password)
    {
        driver.findElement(inputPassword).sendKeys(_password);
    }

    public void clicarBtnLogin()
    {
        driver.findElement(btnLogin).click();
    }

    public String pegarMensagemDeErro()
    {
        waitElementVisible(textAlertaErro,5);
        return driver.findElement(textAlertaErro).getText();
    }
}

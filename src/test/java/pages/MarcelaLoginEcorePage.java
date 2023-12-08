package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class MarcelaLoginEcorePage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
    private By inputUsername = By.name("username");
    private By inputPassword = By.name("password");
    private By btnLogin = By.id("btnLogin");
    private By mensagemRetorno = By.xpath("/html/body/div/div[1]");

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

    public boolean credenciaisInvalidas() {
        String mensagemExibida = driver.findElement(mensagemRetorno).getText();
        if (mensagemExibida.contains("Wrong username or password")) {
            return true;
        } else {
            return false;
        }
    }
}

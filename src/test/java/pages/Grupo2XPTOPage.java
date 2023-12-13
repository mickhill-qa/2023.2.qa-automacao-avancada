package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

public class Grupo2XPTOPage extends BasePage {
    private String url = "https://the-internet.herokuapp.com/login";
    private By username = By.id("username");
    private By password = By.id("password");
    private By errorMessage = By.id("flash");

    public void abrir(){
        driver.get(url);
    }

    public void preencherUsername(String _username){
        driver.findElement(username).sendKeys(_username);
    }

    public void preencherPassword(String _password){
        driver.findElement(password).sendKeys(_password);
    }

    public void clicarEnter() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    public String pegarMensagemDeErro()
    {
        waitElementVisible(errorMessage,5);
        return driver.findElement(errorMessage).getText();
    }
}

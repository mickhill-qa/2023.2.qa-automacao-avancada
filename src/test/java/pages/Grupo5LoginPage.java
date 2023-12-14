package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

public class Grupo5LoginPage extends BasePage
{
    private String url = "https://the-internet.herokuapp.com/login";
    private By inputUsername = By.id("username");
    private By inputPassword = By.id("password");
    private By btnLogin = By.xpath("//button[@class='radius'][contains(.,'Login')]");
    private By mensagemRetornada = By.id("flash");

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

    public String pegarMensagemRetornada()
    {
        waitElementVisible(mensagemRetornada,5);
        String msgRetorno = driver.findElement(mensagemRetornada).getText();
        String msgTratada = msgRetorno.trim().replaceAll("\\s+$", "")
                .replaceAll("×$", "").replaceAll("\\n$", "");
        return msgTratada;
    }

    public Boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }

    public void pressionarEnter() {
        actions.sendKeys(Keys.ENTER).perform();
    }
}

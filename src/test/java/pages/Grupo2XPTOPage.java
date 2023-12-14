package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

public class Grupo2XPTOPage extends BasePage {
    private String urlPaginaLogin = "https://the-internet.herokuapp.com/login";
    private By username = By.id("username");
    private By password = By.id("password");
    private By message = By.id("flash");
    private String urlPaginaHome = "https://the-internet.herokuapp.com/secure";
    private By btnLogout = By.xpath("//*[@id='content']/div/a");

    public void abrir(){
        driver.get(urlPaginaLogin);
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

    public String pegarMensagem() {
        waitElementVisible(message,5);
        return driver.findElement(message).getText().split("\n")[0];
    }

    public Boolean verificarSeEstouNaPaginaHome() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(urlPaginaHome);
    }

    public Boolean verificarSeEstouNaPaginaLogin() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(urlPaginaLogin);
    }

    public void clicarLogout(){
        driver.findElement(btnLogout).click();
    }

}

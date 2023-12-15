package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Grupo2XPTOPage extends BasePage {
    private String urlPaginaLogin = "https://the-internet.herokuapp.com/login";
    private By username = By.id("username");
    private By password = By.id("password");
    private By message = By.id("flash");
    private By btnLogin = By.cssSelector("i.fa.fa-2x.fa-sign-in");
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
    	  driver.findElement(btnLogin).click();
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


}

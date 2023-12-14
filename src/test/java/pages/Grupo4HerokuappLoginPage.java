package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Grupo4HerokuappLoginPage extends BasePage {

    private String url = "https://the-internet.herokuapp.com/login";
    private By campoUserName = By.id("username");
    private By campoPassword = By.cssSelector("password");
    private By botaoLogin = By.xpath("//*[@id=\"login\"]/button/i");
    private By mensagemErro = By.id("flash");

    public void abreNavegador() {
        driver.get(url);
    }
    public void preencheUsername(String _username) {
        driver.findElement(campoUserName).sendKeys(_username);
    }
    public void preenchePassword(String _password) {
        driver.findElement(campoPassword).sendKeys(_password);
    }
    public void clicaLogin(){
        driver.findElement(botaoLogin).click();
    }
    public String pegarUrl() { return driver.getCurrentUrl(); }

    //Função para localizar e obter mensagem de erro no logoin
    public String validaErroLogin(){
        waitElementVisible(mensagemErro, 5);
        return driver.findElement(mensagemErro).getText();
    }
}
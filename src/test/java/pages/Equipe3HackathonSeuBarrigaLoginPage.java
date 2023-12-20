package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Equipe3HackathonSeuBarrigaLoginPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/logout";

    private By campo_email = By.id("email");

    private By campo_senha = By.id("senha");

    private By botao_login = By.cssSelector("button[class*='btn-primary']");

    public void entrar () {
        driver.get(url);
    }

    public void fillUsername(String _username)
    {
        driver.findElement(campo_email).sendKeys(_username);
    }
    public void fillPassword(String _password)
    {

        driver.findElement(campo_senha).sendKeys(_password);
    }
    public void loginBtnClick(){
        driver.findElement(botao_login).click();
    }
    public boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }
    public void preencherSenha(String _senha)
    {
        driver.findElement(campo_senha).sendKeys(_senha);
    }
    public void preencherEmail(String _email)
    {
        driver.findElement(campo_email).sendKeys(_email);
    }
    public void botao_login (){
        driver.findElement(botao_login).click();
    }

    public boolean homePageIsLoaded(){
        String expectedUrl = "https://seubarriga.wcaquino.me/logar";
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.equals(expectedUrl);
    }
    public boolean homePageIsLoaded2(){
        String expectedUrl = "https://seubarriga.wcaquino.me/logout";
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.equals(expectedUrl);
    }
}

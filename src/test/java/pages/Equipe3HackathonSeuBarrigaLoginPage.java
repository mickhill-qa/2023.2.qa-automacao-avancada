package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Equipe3HackathonSeuBarrigaLoginPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/logout";

    private By campo_email = By.cssSelector("input[id='email']");

    private By campo_senha = By.cssSelector("input[id='senha']");

    private By botao_login = By.cssSelector("button[class*='btn-primary']");

    private By home_page_verification = By.cssSelector("div[class*='alert-success']");

    public void entrar () {
        driver.get(url);
    }

    public boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }

    public void fillUsername(String _username) {
        driver.findElement(campo_email).sendKeys(_username);
    }

    public void fillPassword(String _password) {
        driver.findElement(campo_senha).sendKeys(_password);
    }

    public void botao_login (){
        driver.findElement(botao_login).click();
    }

    public void verificação_login_sucess () {

    }


}

package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Equipe3HackathonSeuBarrigaLoginPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/logout";

    private By campo_email = By.cssSelector("input[id='email']");

    private By campo_senha = By.cssSelector("input[id='senha']");

    private By botao_login = By.cssSelector("button[class*='btn-primary']");

    private By home_page_verification = By.cssSelector("div[class*='alert-success']");

    private  By no_sucess_verification = By.cssSelector("div[class*='alert-danger']");

    public void entrar () {
        driver.get(url);
    }

    public boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }

    public void fillUsername(String _username) {
        waitElementVisible(campo_email, 30);
        driver.findElement(campo_email).sendKeys(_username);
    }

    public void fillPassword(String _password) {
        waitElementVisible(campo_senha, 30);
        driver.findElement(campo_senha).sendKeys(_password);
    }

    public void botao_login (){
        waitElementVisible(botao_login, 30);
        driver.findElement(botao_login).click();
    }

    public boolean verificação_login_sucess () {
        waitElementVisible(home_page_verification, 30);
        String verif = "Bem vindo, Luana Vieira Lins!";
        String texto = driver.findElement(home_page_verification).getText();
        Assert.assertEquals(verif, texto);
        return true;
    }

    public boolean email_senha_obrigatorio(String mensagem){
        waitElementVisible(no_sucess_verification, 30);
        String verif = mensagem;
        String texto = driver.findElement(no_sucess_verification).getText();
        Assert.assertEquals(verif, texto);
        return true;
    }

    public boolean no_sucess (){
        waitElementVisible(no_sucess_verification, 30);
        String verif = "Problemas com o login do usuário";
        String texto = driver.findElement(no_sucess_verification).getText();
        Assert.assertEquals(verif, texto);
        return true;
    }


}

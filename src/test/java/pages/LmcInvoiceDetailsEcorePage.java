package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class LmcInvoiceDetailsEcorePage extends BasePage {

    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
    private By inputUsername = By.name("username");
    private By inputPassword = By.name("password");
    private By btnLogin = By.id("btnLogin");
    private By verificacao1 = By.cssSelector("h2[class='mt-5']");
    private By verificacao2 = By.cssSelector("div[class*='mt-3']");



    public void abrir () throws InterruptedException {
        driver.get(url);
        Thread.sleep(1000);
        verificarSeEstouNapagina();
        loginsucess();
        botao_logar();
        verificacao_sucess();
    }

    public boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }

    public void loginsucess() throws InterruptedException {
        driver.findElement(inputUsername).sendKeys("demouser");
        Thread.sleep(1000);
        driver.findElement(inputPassword).sendKeys("abc123");
        Thread.sleep(2000);
    }

    public void botao_logar() throws InterruptedException {
        driver.findElement(btnLogin).click();
        Thread.sleep(3000);
    }

    public boolean verificacao_sucess() throws InterruptedException {
        String verif = "Invoice List";
        String texto = driver.findElement(verificacao1).getText();
        Assert.assertEquals(verif, texto);
        Thread.sleep(1000);
        driver.findElement(verificacao2);
        Thread.sleep(1000);
        return true;
    }



}

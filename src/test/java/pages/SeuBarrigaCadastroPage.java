package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

import static org.junit.Assert.assertEquals;

public class SeuBarrigaCadastroPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/cadastro";
    private By campoNome = By.id("nome");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnCadastrar = By.className("btn btn-primary");

    public void abrir() {
        driver.get(url);
    }

    public void preencherCampoNome(String _texto) {
        driver.findElement(campoNome).sendKeys(_texto);
    }
    public void preencherCampoEmail(String _texto) {
        driver.findElement(campoEmail).sendKeys(_texto);
    }
    public void preencherCampoSenha(String _texto) {
        driver.findElement(campoSenha).sendKeys(_texto);
    }

    public void validaMsgCadastro(){


        String Sucesso = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        assertEquals("Usuário inserido com sucesso", Sucesso);

        String FaltaCampoSenha = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        assertEquals("Usuário inserido com sucesso", FaltaCampoSenha);


    }

    public void clicarBtnCadastrar() {
        driver.findElement(btnCadastrar).click();
    }
}

package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

import static org.junit.Assert.assertEquals;

public class SeuBarrigaCadastroPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/cadastro";
    private By campoNome = By.id("nome");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnCadastrar = By.xpath("/html/body/div[2]/form/input");

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
    public void clicarBtnCadastrar() {
        driver.findElement(btnCadastrar).click();
    }
    public void validaMsgCadastroSucesso(){

        String Sucesso = driver.findElement(By.xpath("/html/body/div[1]")).getText();

        assertEquals("Usuário inserido com sucesso", Sucesso);

    }

    public void validaMsgCadastro(){

        String FaltaCampoSenha = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        assertEquals("Senha é um campo obrigatório", FaltaCampoSenha);

    }

}

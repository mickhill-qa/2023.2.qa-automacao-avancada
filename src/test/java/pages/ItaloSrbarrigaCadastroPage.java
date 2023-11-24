package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class ItaloSrbarrigaCadastroPage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/cadastro";
    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btnCadastrar = By.cssSelector("input[value='Cadastrar']");
    private By errorMessage = By.xpath("/html/body/div[1]");

    public void abrir() {
        driver.get(url);
    }
    public void preencherNome(String _nome) {
        driver.findElement(inputNome).sendKeys(_nome);
    }

    public void preencherEmail(String _email) {
        driver.findElement(inputEmail).sendKeys(_email);
    }

    public void preencherSenha(String _senha) {
        driver.findElement(inputSenha).sendKeys(_senha);
    }

    public void clicarCadatro() {
        driver.findElement(btnCadastrar).click();
    }

    public boolean temMensagemDeErro(String mensagem){
        if (driver.findElement((errorMessage)).isDisplayed()){
            String mensagemDeErro = driver.findElement((errorMessage)).getText();
            if(mensagemDeErro.equals(mensagem)){
                return true;
            }
            return false;
        }
        return false;
    }

}

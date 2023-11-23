package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class SeuBarrigaCadastroPage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/cadastro";
    private String urlVariavel = "https://seubarriga.wcaquino.me/cadastrarUsuario";
    private By errorMessage = By.xpath("/html/body/div[1]");
    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By botaoCadastrar = By.cssSelector("body > div.jumbotron.col-lg-4 > form > input");

    public void abrir() {
        driver.get(url);
    }

    public void preencherCampoNome(String nome){
        driver.findElement(inputNome).sendKeys(nome);
    }
    public void preencherCampoEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }
    public void preencherCampoSenha(String senha){
        driver.findElement(inputSenha).sendKeys(senha);
    }

    public void clicarBotaoCadastrar() {
        driver.findElement(botaoCadastrar).click();
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
    public Boolean ehPaginaCadastro(){
        return driver.getCurrentUrl().equals(this.urlVariavel)  || driver.getCurrentUrl().equals(this.url);
    }
}

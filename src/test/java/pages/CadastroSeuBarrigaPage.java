package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class CadastroSeuBarrigaPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/cadastro";

    private By inputNome = By.id("nome");

    private By inputEmail = By.id("email");

    private By inputSenha = By.id("senha");

    private By btnCadastrar = By.cssSelector("body > div.jumbotron.col-lg-4 > form > input");

    private By msgDeSucesso = By.cssSelector("body > div.alert.alert-success");

    private By msgErroNome = By.cssSelector("body > div:nth-child(2)");

    private By msgErroEmail = By.cssSelector("body > div:nth-child(3)");

    private By msgErroSenha = By.cssSelector("body > div:nth-child(4)");

    public void abrir(){
        driver.get(url);
    }

    public void preencherNome(String _nome){
        driver.findElement(inputNome).sendKeys(_nome);
    }

    public void preencherEmail(String _email){
        driver.findElement(inputEmail).sendKeys(_email);
    }

    public void preencherSenha(String _senha){
        driver.findElement(inputSenha).sendKeys(_senha);
    }

    public void clicarCadastrar(){
        driver.findElement(btnCadastrar).click();
    }

    public String buscarMsg(){
        return driver.findElement(msgDeSucesso).getText();
    }

    public String buscarMsgErro() {
        String ErroNome = driver.findElement(msgErroNome).getText();
        String ErroEmail = driver.findElement(msgErroEmail).getText();
        String ErroSenha = driver.findElement(msgErroSenha).getText();

        StringBuilder mensagemErro = new StringBuilder();
        mensagemErro.append("Nome é um campo obrigatório").append(msgErroNome).append("\n");
        mensagemErro.append("Email é um campo obrigatório").append(msgErroEmail).append("\n");
        mensagemErro.append("Senha é um campo obrigatório").append(msgErroSenha);

        return mensagemErro.toString();
    }

}



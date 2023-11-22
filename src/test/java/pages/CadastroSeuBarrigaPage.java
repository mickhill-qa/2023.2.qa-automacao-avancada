package pages;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class CadastroSeuBarrigaPage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/cadastro";
    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btnCadastrar = By.xpath("/html/body/div[2]/form/input");
    private By mensagemRetorno = By.xpath("/html/body/div[1]");

    public void abrir() {
        driver.get(url);
    }

    public void preencherCampoNome(String _texto) {
        driver.findElement(inputNome).sendKeys(_texto);
    }

    public void preencherCampoEmail(String _texto) {
        driver.findElement(inputEmail).sendKeys(_texto);
    }

    public void preencherCampoSenha(String _texto) {
        driver.findElement(inputSenha).sendKeys(_texto);
    }

    public void clicarBtnCadastrar() {
        driver.findElement(btnCadastrar).click();
    }

    public boolean verificarMensagemSucesso() {
        String mensagemExibida = driver.findElement(mensagemRetorno).getText();
         if (mensagemExibida.contains("Usuário inserido com sucesso")) {
             return true;
            } else {
                return false;
         }
    }
    public boolean emailObrigatorio() {
        String mensagemExibida = driver.findElement(mensagemRetorno).getText();
        if (mensagemExibida.contains("Email é um campo obrigatório")) {
            return true;
           } else {
                return false;
        }
    }
}

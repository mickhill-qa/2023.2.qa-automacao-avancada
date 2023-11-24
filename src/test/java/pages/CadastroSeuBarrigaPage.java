package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class CadastroSeuBarrigaPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/cadastro";

    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");

    private By btnCadastrar = By.cssSelector("input[value='Cadastrar']");
    private By textMensagem = By.cssSelector("div[role='alert']");

    public void abrir() {
        driver.get(url);
    }
}

package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class LoginSeuBarrigaPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/cadastrarUsuario";
    private By alertUsuarioCadastrado = By.cssSelector("div[role='alert']");

    public Boolean verficarSeEstouUrlLogin() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);

    }

    public String getAlertaNovoUsuarioInserido() {
       return driver.findElement(alertUsuarioCadastrado).getText();
    }
}

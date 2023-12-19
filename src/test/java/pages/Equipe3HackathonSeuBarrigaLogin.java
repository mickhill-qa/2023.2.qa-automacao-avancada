package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Equipe3HackathonSeuBarrigaLogin extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/logout";

    private By campo_email = By.cssSelector("input[id='email']");

    private By campo_senha = By.cssSelector("input[id='senha']");

    private By botao_login = By.cssSelector("button[class*='btn-primary']");

    public void entrar () {
        driver.get(url);
    }

    


}

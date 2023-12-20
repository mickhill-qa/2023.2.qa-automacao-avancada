package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

public class GooglePesquisaPage extends BasePage {

    private String url = "https://google.com.br";
    private By inputPesquisa = By.id("APjFqb");
    private By primeiroItenDropdown = By.cssSelector("ul[role='listbox'] > li:nth-child(1)");
    private By btnPesquisar = By.xpath("(//input[@name='btnK'])[2]");

    public void abrir() {
        driver.get(url);
    }

    public void preencherCampoPesquisa(String _texto) {
        driver.findElement(inputPesquisa).sendKeys(_texto);
    }

    public void fecharDrodownPesquisa() {
        waitElementVisible(primeiroItenDropdown, 5);
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    public void clicarBtnPesquisar() {
        driver.findElement(btnPesquisar).click();
    }

    
    
}

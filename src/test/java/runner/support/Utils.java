package runner.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils extends BasePage {
    public String getPositionText(String texto, String separacao, int posicao) {
        List<String> nomes = Arrays.asList(texto.split(separacao));
        String primeiroNome = nomes.get(posicao);
        return primeiroNome;
    }
    public void getNewTab(){
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));

    }
    public void click_LinkDetails(By element) {
        WebElement invoiceLink = driver.findElement(element);
        invoiceLink.click();
    }
//    public boolean obterValor(String texto) {
//        return driver.getPageSource().contains(texto);
//    }

    public String get_text(By element) {
        return driver.findElement(element).getText();
    }

    public void click(By element) {
        driver.findElement(element).click();
    }

    public String get_text_index(By element, int index) {
        return driver.findElements(element).get(index).getText();
    }
    public void clicknolink(By element) {
        WebElement invoiceLink = driver.findElement(element);
        invoiceLink.click();
    }
}




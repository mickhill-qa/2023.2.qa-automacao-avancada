package runner.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.base_class.BasePage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Actions extends BasePage {
    public void waitElementsVisible(By element, int time) {
        try {
            System.out.println("Aguardando o elemento " + element + " ficar visível");
            wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            System.out.println("Encontrou o elemento " + element);
        } catch (Exception erro) {
            System.out.println("Não encontrou o elemento " + element);
            System.out.println(erro);
        }
    }
    public void click(By element) {
        try {
            waitElementsVisible(element, 10);
            driver.findElement(element).click();
            System.out.println("Clicou no elemento " + element);
        } catch (Exception erro) {
            System.out.println("Não clicou no elemento " + element);
            System.out.println(erro);
        }
    }

    public void clickIndex(By element, int index) {
        try {
            waitElementsVisible(element, 10);
            driver.findElements(element).get(index).click();
            System.out.println("Clicou no elemento " + element + " com o Index " + index);
        } catch (Exception erro) {
            System.out.println("Não clicou no elemento " + element + " com o Index " + index);
            System.out.println(erro);
        }
    }

    public void click_link(By element) {
        WebElement invoiceLink = driver.findElement(element);
        invoiceLink.click();
    }

    public String getPositionTextStringExpecific(String texto, String separacao, int posicao, int posicaoString){
        List<String> nomes = Arrays.asList(texto.split(separacao));
        String primeiroNome = nomes.get(posicao).substring(posicaoString);
        return primeiroNome;
    }

    public String getPositionText(String texto, String separacao, int posicao){
        List<String> nomes = Arrays.asList(texto.split(separacao));
        String primeiroNome = nomes.get(posicao);
        return primeiroNome;
    }

    public void set(By element, String text){
        try {
            waitElementsVisible(element, 10);
            driver.findElement(element).sendKeys(text);
            System.out.println("Setou a informação no elemento " + element);
        } catch (Exception erro) {
            System.out.println("Não setou a informação no elemento " + element);
            System.out.println(erro);
        }
    }
    public Select select (By element){
        try {
            waitElementsVisible(element, 10);
            Select select = new Select(driver.findElement(element));
            System.out.println("Selecionou o elemento " + element);
            return select;
        } catch (Exception erro) {
            System.out.println("Não selecionou o elemento " + element);
            System.out.println(erro);
        }
        return null;
    }

    public String get_url(){
        String url = null;
        try {
            url = driver.getCurrentUrl();
            System.out.println("Buscou a URL " + url);
        } catch (Exception erro) {
            System.out.println("Não encontrou a URL" + url);
        }
        return url;
    }

    public void get(String text){
        try {
            driver.get(text);
            System.out.println("Buscou o " + text);
        } catch (Exception erro) {
            System.out.println("Não encontrou o " + text);
        }
    }

    public void getNewTab(){
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
    }

    public String get_text_index(By element, int index){
        String text = null;
        try {
            waitElementsVisible(element, 10);
            text = driver.findElements(element).get(index).getText();
            System.out.println("Visualizou a mensagem " + text);
        } catch (Exception erro) {
            System.out.println("Não visualizou a mensagem " + text);
        }
        return text;
    }

    public String get_text(By element){
        String text = null;
        try {
            waitElementsVisible(element, 10);
            text = driver.findElement(element).getText();
            System.out.println("Visualizou a mensagem " + text);
        } catch (Exception erro) {
            System.out.println("Não visualizou a mensagem " + text);
        }
        return text;
    }

    public void clear(By element) {
        try {
            waitElementsVisible(element, 10);
            driver.findElement(element).clear();
            System.out.println("Limpou a informação no elemento " + element);
        } catch (Exception erro) {
            System.out.println("Não limpou a informação no elemento " + element);
            System.out.println(erro);
        }
    }
}

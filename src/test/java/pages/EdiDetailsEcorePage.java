package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

import java.util.Arrays;
import java.util.List;

public class EdiDetailsEcorePage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private By inputUsername = By.name("username");
    private By inputPassword = By.name("password");
    private By btnLogin = By.id("btnLogin");
    private By invoiceLink = By.cssSelector("a[href='/invoice/0']");
    private By validPag = By.cssSelector("h2");
    private By hotelName = By.cssSelector("h4");
    private By invoiceNumber = By.cssSelector("h6[class='mt-2']");
    private By invoiceDate = By.cssSelector("section ul > li:nth-child(1)");
    private By dueDate = By.cssSelector("ul > li:nth-child(2)");
    private By bookingCode = By.xpath("//td[text()='0875']");
    private By room = By.xpath("//td[text()='Superior Double']");
    private By totalStayCount = By.xpath("//td[text()='1']");
    private By totalStayAmount = By.xpath("//td[text()='$150']");
    private By checkIn = By.xpath("//td[text()='14/01/2018']");
    private By checkOut = By.xpath("//td[text()='15/01/2018']");
    private By customerDetails = By.xpath("/html/body/section/div/div");
    private By billingDetails = By.cssSelector(".table > tbody:nth-child(2) > tr > td");

    public void setUrl() {
        driver.get(url);
    }

    public void setInputUsername() {
        driver.findElement(inputUsername).sendKeys("demouser");
    }

    public void setInputPassword() {
        driver.findElement(inputPassword).sendKeys("abc123");
    }

    public void clickbtnLogin() {
        driver.findElement(btnLogin).click();
    }

    public void clickInvoiceLink() {
        driver.findElement(invoiceLink).click();
    }

    public String pegarposicao(String texto, String separacao, int posicao) {
        List<String> nomes = Arrays.asList(texto.split(separacao));
        String primeiroNome = nomes.get(posicao);
        return primeiroNome;
    }

    public boolean obterValor(String texto) {
        return driver.getPageSource().contains(texto);
    }

    public String validPag() {
        String Texto = driver.findElement(validPag).getText();
        return Texto;
    }

    public String validaHotel() {
        String Texto = driver.findElement(hotelName).getText();
        return Texto;
    }

    public String invoiceNumber() {
        String Texto = driver.findElement(invoiceNumber).getText();
        return Texto;
    }

    public String invoceDate() {
        return pegarposicao(driver.findElement(invoiceDate).getText(), ": ", 1);
    }

    public String dueDate() {
        return pegarposicao(driver.findElement(dueDate).getText(), ": ", 1);

    }

    public String bookingCode() {
        String Texto = driver.findElement(bookingCode).getText();
        return Texto;
    }

    public String room() {
        String Texto = driver.findElement(room).getText();
        return Texto;

    }

    public String totalStayAmount() {
        String Texto = driver.findElement(totalStayAmount).getText();
        return Texto;
    }

    public String totalStayCount() {
        String Texto = driver.findElement(totalStayCount).getText();
        return Texto;
    }

    public String checkIn() {
        String Texto = driver.findElement(checkIn).getText();
        return Texto;
    }

    public String checkOut() {
        String Texto = driver.findElement(checkOut).getText();
        return Texto;
    }

    public String customerDetails() {
        String Texto = driver.findElement(customerDetails).getText().replace("\n", " ");
        return Texto;
    }

    public String depositNow() {
        String Texto = driver.findElements(billingDetails).get(0).getText();
        return Texto;
    }

    public String taxEvate() {
        String Texto = driver.findElements(billingDetails).get(1).getText();
        return Texto;
    }

    public String totalAmount() {
        String Texto = driver.findElements(billingDetails).get(2).getText();
        return Texto;
    }
}

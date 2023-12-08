package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;
import runner.support.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EdiDetailsEcorePage extends Utils {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
    private By inputUsername = By.name("username");
    private By inputPassword = By.name("password");
    private By btnLogin = By.id("btnLogin");
    private By novaAba = By.cssSelector("div.row > div.col.border > a");
    private By validPag = By.cssSelector("h2.mt-5");
    private By hotelName = By.cssSelector("h4.mt-5");
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
        ArrayList<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

    }

    public String validPag() {
        String Texto = get_text(validPag);
        return Texto;
    }

    public String validaHotel() {
        String Texto = get_text(hotelName);
        return Texto;
    }
    public String invoiceNumber() {
        String Texto = get_text(invoiceNumber);
        return Texto;
    }

    public String validaInvoiceDate() {
        return getPositionText(get_text(invoiceDate), ": ", 1);
    }

    public String validaDueDate() {
        return getPositionText(get_text(dueDate), ": ", 1);
    }

    public String bookingCode() {
        String Texto = get_text(bookingCode);
        return Texto;
    }

    public String room() {
        String Texto = get_text(room);
        return Texto;

    }

    public String totalStayAmount() {
        String Texto = get_text(totalStayAmount);
        return Texto;
    }

    public String totalStayCount() {
        String Texto = get_text(totalStayCount);
        return Texto;
    }

    public String checkIn() {
        String Texto = get_text(checkIn);
        return Texto;
    }

    public String checkOut() {
        String Texto = get_text(checkOut);
        return Texto;
    }

    public String customerDetails() {
        String Texto = get_text(customerDetails).replace("\n", " ");
        return Texto;
    }

    public String depositNow() {
        String Texto = get_text_index(billingDetails, 0);
        return Texto;
    }

    public String taxEvate() {
        String Texto = get_text_index(billingDetails,1);
        return Texto;
    }

    public String totalAmount() {
        String Texto = get_text_index(billingDetails,2);
        return Texto;
    }

}

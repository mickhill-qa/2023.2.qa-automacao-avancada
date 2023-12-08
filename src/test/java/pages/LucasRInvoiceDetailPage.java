package pages;

import runner.base_class.BasePage;
import org.openqa.selenium.By;


public class LucasRInvoiceDetailPage extends BasePage {

    private By getTituloInvoice = By.cssSelector("h2[class='mt-5']");
    private By getTextoHotel = By.cssSelector("h4[class='mt-5']");
    private By getTextInvoiceDate = By.xpath("//body[1]/section[1]/div[1]/ul[1]/li[1]");
    private By getTextDueDate = By.xpath("//body[1]/section[1]/div[1]/ul[1]/li[2]");
    private By getTextNumberInvoice = By.cssSelector(".mt-2");
    private By  getTextBooking = By.xpath("//tbody/tr[1]");
    private By  getTextRoom = By.xpath("//tbody/tr[2]");
    private By  getTextChekIn = By.xpath("//tbody/tr[5]");
    private By  getTextCheckOut = By.xpath("//tbody/tr[6]");
    private By  getTextCustomerDetails = By.cssSelector( "div[class='container'] div");
    private By getTextStayCount = By.cssSelector("tbody tr:nth-child(3) td:nth-child(2)");
    private By getTextStayAmount = By.cssSelector("tbody tr:nth-child(4) td:nth-child(2)");
    private By getTextDepositNow = By.cssSelector("body > section:nth-child(2) > div:nth-child(1) > table:nth-child(12) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1)");
    private By getTextTaxVat = By.cssSelector("body > section:nth-child(2) > div:nth-child(1) > table:nth-child(12) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)");
    private By getTextTotalAmount = By.cssSelector("body > section:nth-child(2) > div:nth-child(1) > table:nth-child(12) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3)");

    public String getTituloDetalheFatura() {
        waitElementVisible(getTituloInvoice, 5);
        return driver.findElement(getTituloInvoice).getText();
    }
    public String getNameHotel() {
        waitElementVisible(getTextoHotel, 5);
        return driver.findElement(getTextoHotel).getText();
    }
    public String getDateInvoice() {
        waitElementVisible(getTextInvoiceDate, 5);
        return driver.findElement(getTextInvoiceDate).getText();
    }
    public String getDueDate() {
        waitElementVisible(getTextDueDate, 5);
        return driver.findElement(getTextDueDate).getText();
    }
    public String getNumberInvoice() {
        waitElementVisible(getTextNumberInvoice, 5);
        return driver.findElement(getTextNumberInvoice).getText();
    }

    public String getNumberBooking() {
        waitElementVisible(getTextBooking, 5);
        return driver.findElement(getTextBooking).getText();
    }
    public String[] getCustomDetails() {
        waitElementVisible(getTextCustomerDetails, 5);
        return driver.findElement(getTextCustomerDetails).getText().split("\n");
    }
    public String getRoom() {
        waitElementVisible(getTextRoom, 5);
        return driver.findElement(getTextRoom).getText();
    }
    public String getChekIn() {
        waitElementVisible(getTextChekIn, 5);
        return driver.findElement(getTextChekIn).getText();
    }
    public String getCheckOut() {
        waitElementVisible(getTextCheckOut, 5);
        return driver.findElement(getTextCheckOut).getText();
    }
    public String getStayCount() {
        waitElementVisible(getTextStayCount, 5);
        return driver.findElement(getTextStayCount).getText();
    }
    public String getStayAmount() {
        waitElementVisible(getTextStayAmount, 5);
        return driver.findElement(getTextStayAmount).getText();
    }
    public String getDepositNow() {
        waitElementVisible(getTextDepositNow, 5);
        return driver.findElement(getTextDepositNow).getText();
    }
    public String getStayTaxVat() {
        waitElementVisible(getTextTaxVat, 5);
        return driver.findElement(getTextTaxVat).getText();
    }
    public String getStayTotalAmount() {
        waitElementVisible(getTextTotalAmount, 5);
        return driver.findElement(getTextTotalAmount).getText();
    }










}

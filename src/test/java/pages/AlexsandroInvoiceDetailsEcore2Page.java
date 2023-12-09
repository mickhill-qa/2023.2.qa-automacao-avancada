package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

import java.util.ArrayList;

public class AlexsandroInvoiceDetailsEcore2Page extends BasePage {

    private By textHotelName = By.cssSelector("h4.mt-5");
    private By textInvoiceDate = By.cssSelector("li > span.font-weight-bold > 14/01/2018");
    private By textDueDate = By.cssSelector("li > span.font-weight-bold > 15/01/2018");
    private By textInvoiceNumber = By.cssSelector("h6.mt-2");
    private By textBookingCode = By.cssSelector("h5.mt-5 > td > 0875");
    private By textCustomerDetails = By.cssSelector("h5.mt-5 > div");
    private By textRoom = By.cssSelector("h5.mt-5 > td > Superior Double");
    private By textCheckIn = By.cssSelector("h5.mt-5 > td > 14/01/2018");
    private By textCheckOut = By.cssSelector("h5.mt-5 > td > 15/01/2018");
    private By totalStayCount = By.cssSelector("h5.mt-5 > td > 1");
    private By totalStayAmount = By.cssSelector("h5.mt-5 > td > $150");
    private By depositNowt = By.cssSelector("h5.mt-5 > td > USD $20.90");
    private By taxVat = By.cssSelector("h5.mt-5 > td > USD $19");
    private By totalAmount = By.cssSelector("h5.mt-5 > td > USD $209");

    public void iamHere()
    {
        ArrayList<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public String getTextHotelName()
    {
        return driver.findElement(textHotelName).getText();
    }
    public String getTextInvoiceDate() { return driver.findElement(textInvoiceDate).getText(); }
    public String getTextDueDate() { return driver.findElement(textDueDate).getText(); }
    public String getTextInvoiceNumber() { return driver.findElement(textInvoiceNumber).getText(); }
    public String getTextBookingCode() { return driver.findElement(textBookingCode).getText(); }
    public String getTextCustomerDetails()  { return driver.findElement(textCustomerDetails).getText(); }
    public String getTextRoom() { return driver.findElement(textRoom).getText(); }
    public String getCheckIn() { return driver.findElement(textCheckIn).getText(); }
    public String getCheckOut() { return driver.findElement(textCheckOut).getText(); }
    public String getStayCount() { return driver.findElement(totalStayCount).getText(); }
    public String getStayAmount() { return driver.findElement(totalStayAmount).getText(); }
    public String getBillingDetails() { return driver.findElement(depositNowt).getText(); }
    public String getTaxVat() { return driver.findElement(taxVat).getText(); }
    public String getTotalAmount() { return driver.findElement(totalAmount).getText(); }
}

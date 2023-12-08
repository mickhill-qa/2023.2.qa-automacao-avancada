package pages;

import runner.base_class.BasePage;
import org.openqa.selenium.By;
import java.util.ArrayList;

public class MarcelaInvoiceDetailsEcorePage extends BasePage {
    private By textHotelName = By.cssSelector("h4.mt-5");
    private By invoiceDate = By.cssSelector("section ul > li:nth-child(1)");
    private By dueDate = By.cssSelector("ul > li:nth-child(2)");
    private By invoiceNumber = By.cssSelector("h6.mt-2");
    private By bookingCode = By.xpath("/html/body/section/div/table[1]/tbody/tr[1]/td[2]");
    private By room = By.xpath("/html/body/section/div/table[1]/tbody/tr[2]/td[2]");
    private By totalStayCount = By.xpath("/html/body/section/div/table[1]/tbody/tr[3]/td[2]");
    private By totalStayAmount = By.xpath("/html/body/section/div/table[1]/tbody/tr[4]/td[2]");
    private By checkIn = By.xpath("/html/body/section/div/table[1]/tbody/tr[5]/td[2]");
    private By checkOut = By.xpath("/html/body/section/div/table[1]/tbody/tr[6]/td[2]");
    private By customerDetails = By.xpath("/html/body/section/div/div");
    private By depositeNowt = By.xpath("/html/body/section/div/table[2]/tbody/tr/td[1]");
    private By taxVat = By.xpath("/html/body/section/div/table[2]/tbody/tr/td[2]");
    private By totalAmount = By.xpath("/html/body/section/div/table[2]/tbody/tr/td[3]");



    public void estouAqui()
    {
        ArrayList<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public String getTextHotelName()
    {
        return driver.findElement(textHotelName).getText();
    }

    public String getInvoiceDate()
    {
        return driver.findElement(invoiceDate).getText();
    }

    public String getDueDate()
    {
        return driver.findElement(dueDate).getText();
    }

    public String getInvoiceNumber()
    {
        return driver.findElement(invoiceNumber).getText();
    }

    public String getBookingCode()
    {
        return driver.findElement(bookingCode).getText();
    }

    public String getRoom()
    {
        return driver.findElement(room).getText();
    }

    public String getTotalStayCount()
    {
        return driver.findElement(totalStayCount).getText();
    }

    public String getTotalStayAmount()
    {
        return driver.findElement(totalStayAmount).getText();
    }

    public String getCheckIn()
    {
        return driver.findElement(checkIn).getText();
    }

    public String getCheckOut()
    {
        return driver.findElement(checkOut).getText();
    }

    public String getCustomerDetails()
    {
        return driver.findElement(customerDetails).getText();
    }

    public String getDepositNowt()
    {
        return driver.findElement(depositeNowt).getText();
    }

    public String getTaxVat()
    {
        return driver.findElement(taxVat).getText();
    }

    public String getTotalAmount()
    {
        return driver.findElement(totalAmount).getText();
    }

}

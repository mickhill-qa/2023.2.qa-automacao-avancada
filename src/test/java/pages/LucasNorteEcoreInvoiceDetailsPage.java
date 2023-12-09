package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;
import java.util.ArrayList;

public class LucasNorteEcoreInvoiceDetailsPage extends BasePage {

    private By textHotelName = By.cssSelector("h4.mt-5");
    private By dataInvoiceDate = By.cssSelector("section li:nth-child(1)");
    private By dataDueDate = By.cssSelector("section li:nth-child(2)");
    private By numInvoiceNumber = By.cssSelector("h6.mt-2");
    private By codBookingCode = By.cssSelector("tbody > tr > td:nth-child(2)");
    private By custCustomerDetails = By.cssSelector("section > div > div");
    private By roomRoom = By.cssSelector("tbody > tr:nth-child(2) > td:nth-child(2)");
    private By checkCheckIn = By.cssSelector("tbody > tr:nth-child(5) > td:nth-child(2)");
    private By checkCheckOut = By.cssSelector("tbody > tr:nth-child(6) > td:nth-child(2)");
    private By totalTotalStayCount = By.cssSelector("tbody > tr:nth-child(3) > td:nth-child(2)");
    private By totalTotalStayAmount = By.cssSelector("tbody > tr:nth-child(4) > td:nth-child(2)");
    private By depDepositNow = By.cssSelector("table:nth-child(12) > tbody > tr > td:nth-child(1)");
    private By taxTaxEVat = By.cssSelector("table:nth-child(12) > tbody > tr > td:nth-child(2)");
    private By totalTotalAmount = By.cssSelector("table:nth-child(12) > tbody > tr > td:nth-child(3)");


    public void paginaInvoiceDetails()
    {
        ArrayList<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public String getTextHotelName()
    {
        return driver.findElement(textHotelName).getText();
    }

    public String getDataInvoiceDate() {
        String _dataInvoice [] = driver.findElement(dataInvoiceDate).getText().split(" ");
        return _dataInvoice[2];
    }

    public String getDataDueDate() {
        String _dataDue [] = driver.findElement(dataDueDate).getText().split(" ");
        return _dataDue[2];
    }

    public String getNumInvoiceNumber() {
        return driver.findElement(numInvoiceNumber).getText();
    }

    public String getCodBookingCode() {
        return driver.findElement(codBookingCode).getText();
    }

    public String getCustCustomerDetails(){
        return driver.findElement(custCustomerDetails).getText();
    }

    public String getRoom() {
        return driver.findElement(roomRoom).getText();
    }

    public String getChekIn() {
        return driver.findElement(checkCheckIn).getText();
    }

    public String getCheckOut() {
        return driver.findElement(checkCheckOut).getText();
    }

    public String getTotalStayCount() {
        return driver.findElement(totalTotalStayCount).getText();
    }

    public String getTotalStayAmount() {
        return driver.findElement(totalTotalStayAmount).getText();
    }

    public String getdDepositNow() {
        return driver.findElement(depDepositNow).getText();
    }

    public String getTaxTaxEVat() {
        return driver.findElement(taxTaxEVat).getText();
    }

    public String getTotalAmount() {
        return driver.findElement(totalTotalAmount).getText();
    }

}

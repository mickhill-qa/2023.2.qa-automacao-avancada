package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

public class EdInvoiceDetailsPage extends BasePage {
    By hotelName = By.cssSelector("h4.mt-5");
    By invoiceDateLocator = By.xpath("//li[span[@class='font-weight-bold' and contains(text(), 'Invoice Date:')]]");
    By invoiceDueDateLocator = By.xpath("//li[span[@class='font-weight-bold' and contains(text(), 'Due Date:')]]");
    By invoiceNumberLocator = By.xpath("//h6[@class='mt-2' and contains(text(), 'Invoice #110 details')]");
    By bookingCodeLocator = By.xpath("//td[text()='0875']");
    By customerDetailsLocator = By.cssSelector("body > section > div > div");
    By roomLocator = By.xpath("//td[text()='Superior Double']");
    By checkInLocator = By.xpath("//td[text()='14/01/2018']");
    By checkOutLocator = By.xpath("//td[text()='15/01/2018']");
    By totalStayCountLocator = By.xpath("//td[text()='1']");
    By totalStayAmountLocator = By.xpath("//td[text()='$150']");
    By depositNowLocator = By.xpath("//td[text()='USD $20.90']");
    By taxAndVatLocator = By.xpath("//td[text()='USD $19']");
    By totalAmountLocator = By.xpath("//td[text()='USD $209']");


    public String getInvoiceDate() {
        WebElement invoiceDateElement = driver.findElement(invoiceDateLocator);
        String invoiceDateText = invoiceDateElement.getText();
        return invoiceDateText.split(":")[1].trim();
    }

    public String getDueDate(){
        WebElement invoiceDueDateElement = driver.findElement(invoiceDueDateLocator);
        String invoiceDueDateText = invoiceDueDateElement.getText();
        return invoiceDueDateText.split(":")[1].trim();

    }
    public void validateHotelName(String expectedHotelName){
        String actualHotelName = driver.findElement(hotelName).getText();
        Assert.assertEquals(expectedHotelName, actualHotelName);
    }

    public String getInvoiceNumber() {
        WebElement invoiceNumberElement = driver.findElement(invoiceNumberLocator);
        return invoiceNumberElement.getText();
    }

    public String getBookingCode(){
        WebElement actualBookingCode = driver.findElement(bookingCodeLocator);
        return actualBookingCode.getText();
    }
    public String getCustomerDetails() {
        WebElement actualCustomerDetails = driver.findElement(customerDetailsLocator);
        return actualCustomerDetails.getText();
    }
    public String getRoom(){
        WebElement actualRoom = driver.findElement(roomLocator);
        return actualRoom.getText();
    }
    public String getCheckIn(){
        WebElement actualCheckIn = driver.findElement(checkInLocator);
        return  actualCheckIn.getText();
    }
    public String getCheckOut(){
        WebElement actualCheckOut = driver.findElement(checkOutLocator);
        return actualCheckOut.getText();
    }
    public String getTotalStayCount(){
        WebElement actualTotalStay = driver.findElement(totalStayCountLocator);
        return actualTotalStay.getText();
    }
    public String getTotalStayAmount(){
        WebElement actualTotalStayAmount = driver.findElement(totalStayAmountLocator);
        return actualTotalStayAmount.getText();
    }
    public String getDepositNow(){
        WebElement actualDepositNow = driver.findElement(depositNowLocator);
        return actualDepositNow.getText();
    }
    public String getTax(){
        WebElement actualTax = driver.findElement(taxAndVatLocator);
        return actualTax.getText();
    }
    public String getTotalAmount(){
        WebElement actualTotalAmount = driver.findElement(totalAmountLocator);
        return actualTotalAmount.getText();
    }
}

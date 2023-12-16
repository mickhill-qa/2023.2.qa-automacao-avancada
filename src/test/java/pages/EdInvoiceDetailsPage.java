package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

public class EdInvoiceDetailsPage extends BasePage {
    By hotelName = By.cssSelector("h4.mt-5");
    By invoiceDateLocator = By.cssSelector("body > section > div > ul > li");
    By invoiceDueDateLocator = By.cssSelector("body > section > div > ul > li:nth-child(2)");
    By invoiceNumberLocator = By.cssSelector("h6");
    By bookingCodeLocator = By.cssSelector("tbody > tr > td:nth-child(2)");
    By customerDetailsLocator = By.cssSelector("body > section > div > div");
    By roomLocator = By.cssSelector("tbody > tr > td:nth-child(2)");
    By checkInLocator = By.cssSelector("tbody > tr > td:nth-child(2)");
    By checkOutLocator = By.cssSelector("tbody > tr > td:nth-child(2)");
    By totalStayCountLocator = By.cssSelector("tbody > tr > td:nth-child(2)");
    By totalStayAmountLocator = By.cssSelector("tbody > tr > td:nth-child(2)");
    By depositNowLocator = By.cssSelector("tbody > tr > td:nth-child(1)");
    By taxAndVatLocator = By.cssSelector("tbody > tr > td:nth-child(2)");
    By totalAmountLocator = By.cssSelector("tbody > tr > td:nth-child(3)");

// Some variables get the same css selection, but different parts of it are selected by the methods below.
    // They were created separately for maintenance purposes
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
        WebElement actualBookingCode = driver.findElements(bookingCodeLocator).get(0);
        return actualBookingCode.getText();
    }
    public String getCustomerDetails() {
        WebElement actualCustomerDetails = driver.findElement(customerDetailsLocator);
        return actualCustomerDetails.getText();
    }
    public String getRoom(){
        WebElement actualRoom = driver.findElements(roomLocator).get(1);
        return actualRoom.getText();
    }
    public String getCheckIn(){
        WebElement actualCheckIn = driver.findElements(checkInLocator).get(4);
        return  actualCheckIn.getText();
    }
    public String getCheckOut(){
        WebElement actualCheckOut = driver.findElements(checkOutLocator).get(5);
        return actualCheckOut.getText();
    }
    public String getTotalStayCount(){
        WebElement actualTotalStay = driver.findElements(totalStayCountLocator).get(2);
        return actualTotalStay.getText();
    }
    public String getTotalStayAmount(){
        WebElement actualTotalStayAmount = driver.findElements(totalStayAmountLocator).get(3);
        return actualTotalStayAmount.getText();
    }
    public String getDepositNow(){
        WebElement actualDepositNow = driver.findElements(depositNowLocator).get(6);
        return actualDepositNow.getText();
    }
    public String getTax(){
        WebElement actualTax = driver.findElements(taxAndVatLocator).get(6);
        return actualTax.getText();
    }
    public String getTotalAmount(){
        WebElement actualTotalAmount = driver.findElement(totalAmountLocator);
        return actualTotalAmount.getText();
    }
}

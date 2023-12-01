package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class RenatoInvoiceDetailsPage extends BasePage {

    private By hotelname = By.cssSelector("h4[class='mt-5']");
    private By invoiceDate = By.xpath("//div/ul/li[1]/text()");
    private By dueDate = By.xpath("//div/ul/li[2]/text()");
    private By invoiceNumber = By.cssSelector("h6[class='mt-2']");
    private By bookingCode = By.cssSelector(".table > tbody > tr:nth-child(1) > td:nth-child(2)");
    private By customerDetails = By.cssSelector("body > section > div > div");
    private By room = By.cssSelector(".table > tbody > tr:nth-child(2) > td:nth-child(2)");
    private By checkIn = By.cssSelector(".table > tbody > tr:nth-child(5) > td:nth-child(2)");
    private By checkOut = By.cssSelector(".table > tbody > tr:nth-child(6) > td:nth-child(2)");
    private By totalStayCount = By.cssSelector(".table > tbody > tr:nth-child(3) > td:nth-child(2)");
    private By totalStayAmount = By.cssSelector(".table > tbody > tr:nth-child(4) > td:nth-child(2)");
    private By depositNow = By.cssSelector("div > table > tbody:nth-child(2) > tr > td:nth-child(1)");
    private By taxVat = By.cssSelector("div > table > tbody:nth-child(2) > tr > td:nth-child(2)");
    private By totalAmount = By.cssSelector("div > table > tbody:nth-child(2) > tr > td:nth-child(3)");

    public String validateHotelName(){
        String _hotelName = driver.findElement(hotelname).getText();
        return _hotelName;
    }
    public String validateInvoiceDate(){
        String  _invoiceDate = driver.findElement(invoiceDate).getText();
        return _invoiceDate;
    }
    public String validateDueDate(){
        String  _dueDate = driver.findElement(dueDate).getText();
        return _dueDate;
    }
    public String validateInvoiceNumber(){
        String  _invoiceNumber = driver.findElement(invoiceNumber).getText();
        return _invoiceNumber;
    }
    public String validateBookingCode(){
        String  _bookingCode = driver.findElement(bookingCode).getText();
        return _bookingCode;
    }
    public String validateCustomerDetails(){
        String  _customerDetails = driver.findElement(customerDetails).getText();
        return _customerDetails;
    }
    public String validateRoom(){
        String  _room = driver.findElement(room).getText();
        return _room;
    }
    public String validateCheckIn(){
        String  _checkIn = driver.findElement(checkIn).getText();
        return _checkIn;
    }
    public String validateCheckOut(){
        String  _checkOut = driver.findElement(checkOut).getText();
        return _checkOut;
    }
    public String validateTotalStayCount(){
        String  _totalStayCount = driver.findElement(totalStayCount).getText();
        return _totalStayCount;
    }
    public String validateTotalStayAmount(){
        String  _totalStayAmount = driver.findElement(totalStayAmount).getText();
        return _totalStayAmount;
    }
    public String validateDepositNow(){
        String  _depositNow = driver.findElement(depositNow).getText();
        return _depositNow;
    }
    public String validateTaxVat(){
        String  _taxVat = driver.findElement(taxVat).getText();
        return _taxVat;
    }
    public String validateTotalAmount(){
        String  _totalAmount = driver.findElement(totalAmount).getText();
        return _totalAmount;
    }
}


package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class InvoiceDetailsPage extends BasePage {

    private By hotelName = By.cssSelector("h4[class='mt-5']");

    private By invoiceDate = By.xpath("/html/body/section/div/ul/li[1]/text()");
    private By dueDate = By.xpath("/html/body/section/div/ul/li[2]/text()");
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

}


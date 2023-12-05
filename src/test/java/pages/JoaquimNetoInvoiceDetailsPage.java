package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class JoaquimNetoInvoiceDetailsPage extends BasePage {
    public static String pegarhotelName;
    private String url = "automation-sandbox-python-mpywqjbdza-uc.a.run.app/invoice/0";

    private By hotelName = By.xpath("/html/body/section/div/h4");

    public String pegarhotelName(){
        waitElementVisible(hotelName);
        return driver.findElement(hotelName).getText();}

    private By invoiceDate = By.xpath("/html/body/section/div/ul/li[1]/text()");

    private By dueDate = By.xpath("/html/body/section/div/ul/li[2]/text()");

    private By invoiceNumber = By.xpath("/html/body/section/div/h6");


    public boolean estouAqui()
    {
        String urlAtual = driver.getCurrentUrl();
        if(urlAtual.contains(url))
            return true;
        else
            return false;
    }
}


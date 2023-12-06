package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;
import java.util.ArrayList;

public class MickHillInvoiceDetailsEcorePage extends BasePage
{
    private By textHotelName = By.cssSelector("h4.mt-5");

    public void estouAqui()
    {
        ArrayList<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public String getTextHotelName()
    {
        return driver.findElement(textHotelName).getText();
    }
}

package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import runner.support.BrowserFactory;

public class Hooks
{
    public static WebDriver driver;

    @Before
    public void antesDoTeste()
    {
        driver = BrowserFactory.getBrowser();
    }

    @After
    public void depoisDoTeste()
    {
        driver.quit();
        driver = null;
    }
}

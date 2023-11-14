package runner.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory
{
    public static WebDriver getBrowser()
    {
        //variaveis necessárias
        WebDriver navegador;
        ChromeOptions options;

        // reduzindo output do webdriver
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        //Webdriver do chrome
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();

        //Inicio
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-crash-reporter");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-in-process-stack-traces");
        options.addArguments("--disable-logging");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-notifications");
        options.addArguments("--log-level=3");
        options.addArguments("--output=/dev/null");

        navegador = new ChromeDriver(options);
        navegador.manage().window().maximize();
        return navegador;
    }
}

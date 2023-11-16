package runner.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory
{
    public static enum Bronser {
        CHROME,
        CHROME_HEADLESS
    }

    public static WebDriver getBrowser() {
        String ci = System.getenv().get("PIPELINE");
        if (ci != null && ci.equals("github_actions")) {
            return getBrowser(Bronser.CHROME_HEADLESS);
        } else {
            return getBrowser(Bronser.CHROME);
        }
    }

    public static WebDriver getBrowser(Bronser nav)
    {
        WebDriver navegador;
        ChromeOptions options;

        switch (nav) {
            case CHROME:
                System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                WebDriverManager.chromedriver().setup();
                options = getChromeOptions();
                navegador = new ChromeDriver(options);
                navegador.manage().window().maximize();
                break;
            case CHROME_HEADLESS:
                System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                WebDriverManager.chromedriver().setup();
                options = getChromeHeadlessOptions();
                navegador = new ChromeDriver(options);
                break;
            default:
                navegador = null;
                new Exception("Navegador nao suportado");
        }
        return navegador;
    }

    private static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-crash-reporter");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-in-process-stack-traces");
        options.addArguments("--disable-logging");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-notifications");
        options.addArguments("--log-level=3");
        options.addArguments("--output=/dev/null");
        return options;
    }

    private static ChromeOptions getChromeHeadlessOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-crash-reporter");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-in-process-stack-traces");
        options.addArguments("--disable-logging");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-notifications");
        options.addArguments("--log-level=3");
        options.addArguments("--output=/dev/null");
        return options;
    }
}

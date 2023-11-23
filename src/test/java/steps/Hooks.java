package steps;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import runner.base_class.BaseSteps;

public class Hooks extends BaseSteps {

    public static WebDriver driver;

    @Before
    public void antesDoTeste(Scenario _scenario) {
        scenario = _scenario;
    }

    @After
    public void depoisDoTeste() {
        if (scenario.isFailed())
            screenshot();
    }

    @BeforeAll
    public static void antesDeTudo() {
        openBrownser();
    }

    @AfterAll
    public static void depoisDeTudo() {
        closeBrownser();
    }
}

package steps;

import io.cucumber.java.*;
import runner.base_class.BaseSteps;

public class Hooks extends BaseSteps {
    @Before
    public void antesDoTeste(Scenario _scenario) {
        scenario = _scenario;
    }

    @Before("@resetBrowser")
    public void resetBrowser() {
        closeBrownser();
        openBrownser();
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

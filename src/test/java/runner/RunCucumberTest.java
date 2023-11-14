package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",	            // Path: features = "classpath:features"
        glue = "steps",					                        // Path: Steps
        monochrome = false,							            // Cores no Terminal default: false
        snippets = CucumberOptions.SnippetType.UNDERSCORE,		// METHODOS do Steps em CAMELCASE
        dryRun = false,								            // Validar Steps sem executar o teste
        plugin = {									            // Plugins Cucumber para possivel integracao com Jenkins
                "pretty",
                "html:target/cucumber/index.html",
                "json:target/cucumber/index.json"
        }
        //,tags = "@my_tag"

        /**
         * Executar testes no termial
         *
         *	$ mvn test
         *	$ mvn test -Dcucumber.options="--tags @tagScenario"
         *
         *	$ mvn clean
         *	$ mvn clean test
         * */
)

public class RunCucumberTest {
}

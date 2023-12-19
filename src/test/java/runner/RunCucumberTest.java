package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import com.rajatthareja.reportbuilder.ReportBuilder;
import com.rajatthareja.reportbuilder.Color;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        ,tags = "not @ecore_invoice_details and not @ecore_login"

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
    @AfterClass
    public static void AfterAllTest() {
        // Report-Builder
        List<Object> cucumberJsonReports = new ArrayList<>();
        ReportBuilder reportBuilder = new ReportBuilder();
        String dataReport = (new SimpleDateFormat("MMM dd, yyyy (EEE) | HH:mm:ss zzz")).format(new Date());
        cucumberJsonReports.add(new File("target/cucumber/index.json"));
        reportBuilder.setReportDirectory("target/cucumber/report-builder/");
        reportBuilder.setReportFileName("index");
        reportBuilder.setReportColor(Color.CYAN); // http://materializecss.com/color.html
        reportBuilder.setReportTitle("Automacao Avancada");
        reportBuilder.setAdditionalInfo("Date", dataReport);
        reportBuilder.build(cucumberJsonReports);
    }
}

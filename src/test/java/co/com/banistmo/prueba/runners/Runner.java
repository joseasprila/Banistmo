package co.com.banistmo.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/testCases.feature",
        //tags = "stories",
        glue = "co.com.banistmo.prueba.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class Runner {


}

package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.ast.Tag;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty","html:src/cucumber-reports"},
features= {"src/test/resources/skeleton/AdminAddPdt.feature"},monochrome=true)
public class RunCucumber {
	

}

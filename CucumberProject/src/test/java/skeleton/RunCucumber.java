package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports"},
features={"src/test/resources/skeleton/Addproduct.feature"},monochrome=true,dryRun=true)

public class RunCucumber {

}

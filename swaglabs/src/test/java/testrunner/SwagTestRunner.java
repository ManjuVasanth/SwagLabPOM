package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"feature"},
glue = {"steps"},
plugin = {"pretty","html:Report1"},
dryRun = false,
tags = "@P1"
		)

public class SwagTestRunner {

}

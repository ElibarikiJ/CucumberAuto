package com.basic.multiplescenarioSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        dryRun = true,
        features = {"src/test/resources/com/basic/multiplescenarionFF/"},
        glue = {"com.basic.multiplescenarioSD"},
        plugin = {"pretty", "html:target/cucumber-report1.html","json:target/cucumber-report1.json"}
)
public class RunMultipleScenarioTest { }

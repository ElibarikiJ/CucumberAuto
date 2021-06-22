package com.basic.parameterizationSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        dryRun = true,
        features = {"src/test/resources/com/basic/parameterizationFF/"},
        glue = {"com.basic.parameterizationSD"},
        plugin = {"pretty", "html:target/cucumber-report1.html","json:target/cucumber-report1.json"}
)
public class RunParameterizationTest { }

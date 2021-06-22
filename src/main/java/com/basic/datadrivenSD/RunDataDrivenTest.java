package com.basic.datadrivenSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        dryRun = true,
        features = {"src/test/resources/com/basic/datadrivenFF/"},
        glue = {"com.basic.datadrivenSD"},
        plugin = {"pretty", "html:target/cucumber-report4.html","json:target/cucumber-report4.json"}
)
public class RunDataDrivenTest { }

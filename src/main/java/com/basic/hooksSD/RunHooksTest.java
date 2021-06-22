package com.basic.hooksSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        dryRun = true,
        features = {"src/test/resources/com/basic/hooksFF/"},
        glue = {"com.basic.hooksSD"},
        plugin = {"pretty", "html:target/cucumber-report5.html","json:target/cucumber-report5.json"}
)
public class RunHooksTest { }

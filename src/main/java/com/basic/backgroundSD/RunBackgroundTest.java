package com.basic.backgroundSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        dryRun = true,
        features = {"src/test/resources/com/basic/backgroundFF/"},
        glue = {"com.basic.backgroundSD"},
        plugin = {"pretty", "html:target/cucumber-report3.html","json:target/cucumber-report3.json"}
)
public class RunBackgroundTest { }

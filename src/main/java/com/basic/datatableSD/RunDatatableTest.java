package com.basic.datatableSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        dryRun = true,
        features = {"src/test/resources/com/basic/datatableFF/"},
        glue = {"com.basic.datatableSD"},
        plugin = {"pretty", "html:target/cucumber-report2.html","json:target/cucumber-report2.json"}
)
public class RunDatatableTest { }

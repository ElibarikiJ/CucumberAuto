package com.basic.FirstFeatureFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        dryRun = true,
        plugin = {"pretty", "html:target/cucumber-report.html","json:target/cucumber-report.json"}
)
public class RunMyFirstFeatureTest { }
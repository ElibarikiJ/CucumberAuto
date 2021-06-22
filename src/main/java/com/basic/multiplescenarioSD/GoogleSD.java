package com.basic.multiplescenarioSD;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSD {

    WebDriver driver = null;

    @Before
    public void setupPage() {
        System.setProperty("webdriver.chrome.driver", "/home/barick/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("^User need to be on google page$")
    public void visitLogin() {
        driver.get("https://www.google.com");
    }

    @Then("^User enters user search string$")
    public void searchWithGoogle() {
        driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
        driver.findElement(By.className("gNO89b")).click();
    }

    @After
    public void clear() {
        driver.quit();
        driver = null;
    }
}

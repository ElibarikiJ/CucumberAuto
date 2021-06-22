package com.basic.multiplescenarioSD;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSD {
    WebDriver driver = null;

    @Before
    public void setupPage() {
        System.setProperty("webdriver.chrome.driver", "/home/barick/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("^User need to be on lsf page$")
    public void visitHome() {
        driver.get("https://sharepoint-lsf.web.app");
    }

    @Then("^User enters user email address$")
    public void userEnterEmailAddress() {
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("brkjohn.3@gmail.com");
    }

    @And("^User enters user password$")
    public void userEnterPassword() {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("brkjohn.123");
    }

    @After
    public void clear() {
        driver.quit();
        driver = null;
    }
}

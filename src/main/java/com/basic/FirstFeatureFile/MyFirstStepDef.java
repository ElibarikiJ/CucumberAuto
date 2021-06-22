package com.basic.FirstFeatureFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.Assert.assertEquals;

public class MyFirstStepDef {

    WebDriver driver;

    @Given("^User need to be on Facebook login page$")
    public void user_need_to_be_on_facebook_login_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/barick/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
    }

    @When("^User enters user first name$")
    public void user_enters_user_first_name() {
        driver.findElement(By.id("email")).sendKeys("elihno@gmail.com");
    }

    @Then("^User checks user first name is present$")
    public void user_checks_user_first_name_is_present() {
        String userNameActual = driver.findElement(By.id("email")).getAttribute("value");
        assertEquals("elihno@gmail.com", userNameActual);
    }
}

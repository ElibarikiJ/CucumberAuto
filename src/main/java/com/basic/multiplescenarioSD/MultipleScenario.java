package com.basic.multiplescenarioSD;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.Assert.assertEquals;

public class MultipleScenario {

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
    public void user_enters_user_first_name() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("elihno@gmail.com");
        Thread.sleep(1000);
    }

    @Then("^User checks user first name is present$")
    public void user_checks_user_first_name_is_present() throws InterruptedException {
        String userNameActual = driver.findElement(By.id("email")).getAttribute("value");
        assertEquals("elihno@gmail.com", userNameActual);
        Thread.sleep(1000);
    }

    @And("^user enters user surname$")
    public void user_enters_user_surname() {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
    }

    @But("^User mobile field should be blank$")
    public void user_mobile_field_should_be_blank() throws InterruptedException {
        String passwordActual = driver.findElement(By.xpath("//input[@id='password']")).getAttribute("value");
        assertEquals("12345678", passwordActual);
        Thread.sleep(1000);
    }

    @Then("^Close browser$")
    public void close_browser() {
        driver.quit();
        driver = null;
    }

}

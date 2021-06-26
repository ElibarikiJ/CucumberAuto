package com.basic.FirstFeatureFile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static junit.framework.Assert.assertEquals;

public class MyFirstStepDef {

    @Before()
    public void setUp() {
        Configuration.browser = "firefox";
    }

    @Given("^User need to be on Facebook login page$")
    public void user_need_to_be_on_facebook_login_page() {
        Selenide.open("https://www.facebook.com/");
    }

    @When("^User enters user first name$")
    public void user_enters_user_first_name() {
        Selenide.$(By.id("email")).sendKeys("elihno@gmail.com");
    }

    @Then("^User checks user first name is present$")
    public void user_checks_user_first_name_is_present() {
        Selenide.$(By.id("email")).shouldNotHave(Condition.text("elihno@gmail.com"));
    }
}

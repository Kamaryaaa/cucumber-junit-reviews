package com.cydeo.step_definitions;

import com.cydeo.pages.SeamlessLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_step_defs {


    SeamlessLoginPage seamlessLoginPage = new SeamlessLoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));


    }
    @When("the user enter valid username")
    public void the_user_enter_valid_username() {
        seamlessLoginPage.txt_username.sendKeys(ConfigurationReader.getProperty("seamlessly.username"));

    }

    @When("the user enter valid password")
    public void the_user_enter_valid_password() {
        seamlessLoginPage.txt_password.sendKeys(ConfigurationReader.getProperty("seamlessly.password"));

    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        seamlessLoginPage.btn_log_in.click();

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("File"));

    }



}

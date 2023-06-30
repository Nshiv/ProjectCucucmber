package com.examples.StepDefintions;

import io.cucumber.java.en.*;

public class Login_StepDefinition
{
    @Given("User on signup screen")
    public void user_on_signup_screen()
    {
        System.out.println("step : 1");
    }

    @When("User signup with {} and {}")
    public void user_signupWith_username_and_password(String username, String password)
    {
        System.out.println(username);
        System.out.println(password);
    }

    @Then("User should be redirected to dashbord successfully")
    public void user_redirection()
    {
        System.out.println("rediredted");
    }

    @And("Correct name should be display")
    public void correct_username_validation()
    {
        System.out.println("name will be diaply here");
    }

    @Given("User on updated dashboard")
    public void user_updated()
    {
        System.out.println("sCenario 2 : step1 ");
    }

    @When("User clicked on link1")
    public void link1_click()
    {
        System.out.println("Scenario 2: step : 2");
    }

    @Then("A new tab should be open with redirected link1")
    public void tab_open()
    {
        System.out.println("SCenario : 2 step:3");
    }

    @Given("User on redirected dashboard")
    public  void redirected_dashboard()
    {
        System.out.println("Scenario 3, step:1");
    }

    @When("User clicked on link2")
    public void link2_clicked()
    {
        System.out.println("Scenario: 3 , step: 2");
    }

    @Then("A new tab should be open with redirected link2")
    public void link2_redirected()
    {
        System.out.println("Scenario: 3 , step: 3");
    }

    @Given("User on default dashboard")
    public  void default_dashboard()
    {
        System.out.println("Scenario 4, step:1");
    }

    @When("User view default profile image on dashboard")
    public void profile_links()
    {
        System.out.println("Scenario: 4 , step: 2");
    }

    @Then("User's Name initials should be display")
    public void name_initials()
    {
        System.out.println("Scenario: 4 , step: 3");
    }

    @Given("Validate the browser status")
    public void check_browser()
    {
        System.out.println("Browser is not present");
    }
    @When("Launch the browser")
    public void launch_browser()
    {
        System.out.println("Bowser is launched");
    }
    @Then("check if browser is present")
    public void up_and_running_browser()
    {
        System.out.println("Browser is up and running");
    }

    @Given("User has android app")
    public void user_android()
    {
        System.out.println("Android app is present");
    }

    @When("User launched app")
    public void app_launch()
    {
        System.out.println("app Launched");
    }

    @Then("Feed screen displays just after splash")
    public void feed_spalsh()
    {
        System.out.println("Feed displays");
    }
}

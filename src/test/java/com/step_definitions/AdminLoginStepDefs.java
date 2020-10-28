package com.step_definitions;

import com.utilities.common.Environment;
import com.utilities.ui.BrowserUtils;
import com.utilities.ui.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdminLoginStepDefs extends BaseStep{
    @Given("I am on the admin login page")
    public void i_am_on_the_admin_login_page(){
        String url = Environment.getProperty("url");
        Driver.getDriver().get(url);
    }
    @Given("I login to application as a {word}")
    public void i_login_to_application_as_a(String user)throws Exception {
        pojoScenario.getObject("app");
        String email=null, password = null;
        switch (user.toLowerCase()){
            case"admin":
                email = Environment.getProperty("admin_email");
                password = Environment.getProperty("admin_password");
                break;
            case"user":
                email = Environment.getProperty("user_email");
                password = Environment.getProperty("user_password");
                break;
            default:
                throw new Exception("Wrong user Type " +user);
        }
        adminLoginPage.login(email,password);
        

    }
    @And("I deny perches the plan")
    public void iDinyPerchesThePlan() {

        BrowserUtils.waitForVisibility(adminLoginPage.moduleWindowsButton, 5);
        adminLoginPage.moduleWindowsButton.click();
    }

    @Then("I get the expected {string}")
    public void i_get_the_expected(String message) throws Exception {
        switch (message.toLowerCase()){
            case "buyproduct":
                Assert.assertTrue(adminLoginPage.moduleWindowsButton.isDisplayed());
                break;
            case "unauthorized":
                Assert.assertTrue(adminLoginPage.unauthorizedMessage.isDisplayed());
                break;
            default:
                throw new Exception("Message is NOT defined");
        }


    }




   /* @When("^I login to application as ([^\"]*)$")
    public void iLoginToApplicationAsRole(String role) throws Exception {
        adminLoginPage.login(email,password);
    }

   */
}

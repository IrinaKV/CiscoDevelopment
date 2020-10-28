package com.step_definitions;

import com.utilities.common.Environment;
import com.utilities.ui.BrowserUtils;
import com.utilities.ui.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TokenStep_defs extends BaseStep{

    @Given("I login on developer site")
    public void i_login_on_developer_site() {
        String url = Environment.getProperty("url_developers");
        Driver.getDriver().get(url);
        String email = null,password = null;
        email = Environment.getProperty("admin_email");
        password = Environment.getProperty("admin_password");
        loginPage.login(email,password);


    }

    @When("I click on on token button")
    public void i_click_on_on_token_button() {
        //Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        loginPage.tokenButton.click();
        BrowserUtils.waitForVisibility(loginPage.okButton,3);
        loginPage.okButton.click();
    }

    @Then("I get my token")
    public String i_get_my_token() {
        return BrowserUtils.copyFromBuffer();
    }


}

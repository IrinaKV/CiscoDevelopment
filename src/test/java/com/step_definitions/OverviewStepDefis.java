package com.step_definitions;

import com.utilities.ui.BrowserUtils;
import com.utilities.ui.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OverviewStepDefis extends BaseStep {
    @When("I click on {string} link")
    public void i_click_on_link(String link) {
        // on overview page we have links
        BrowserUtils.wait(1);
        switch (link.toLowerCase()){
            case "users":
                overviewPage.Users.click();
                break;
            case "workspaces":
                overviewPage.Workspaces.click();
                break;
            case "apps":
                overviewPage.Apps.click();
                break;
            case "account":
                overviewPage.Account.click();
                break;
            case "devices":
                overviewPage.Devices.click();
                break;
            case "organizationsettings":
                overviewPage.Organizationsettings.click();
                break;


        }
    }

    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String page) {
        BrowserUtils.wait(1);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(page));


    }



}

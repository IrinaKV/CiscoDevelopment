package com.step_definitions;

import com.utilities.common.Environment;
import com.utilities.ui.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks{

    @Before(order = 0)
    public void setUpScenario() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        RestAssured.baseURI = Environment.getProperty("base_url");
        }

    @After
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            // take screenshot using selenium
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // attach to report
            scenario.embed(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}

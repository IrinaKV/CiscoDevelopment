package com.pages.adminWebex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OverviewPage extends BasePage {
    @FindBy(xpath = "//h6[.='Webex Services']")
    public WebElement   webexServices;

    @FindBy(xpath = "(//button)[3]")
    public WebElement buttonWebexServices;

    @FindBy(xpath = "//h6[.='Hybrid Services']")
    public WebElement hybridServices;

    @FindBy(xpath = "(//button)[4]")
    public WebElement buttonHybridServices;

    @FindBy(xpath = "//h6[.='Devices']")
    public WebElement devices;

    @FindBy(xpath = "(//button)[5]")
    public WebElement buttonDevices;

    @FindBy(xpath = "//span[.=' Add Devices ']")
    public WebElement addDeviceButton;

    public Select webexServices(){

        return new Select(buttonWebexServices);
    }

}

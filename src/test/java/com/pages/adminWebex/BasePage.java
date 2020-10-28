package com.pages.adminWebex;

import com.utilities.ui.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.=' Users ']")
    public WebElement Users;

    @FindBy(xpath = "//span[.=' Workspaces ']")
    public WebElement Workspaces;

    @FindBy(xpath = "//span[.=' Devices ']")
    public WebElement Devices;

    @FindBy(xpath = "//span[.=' Apps ']")
    public WebElement Apps;

    @FindBy(xpath = "//span[.=' Account ']")
    public WebElement Account;

    @FindBy(xpath = "//span[contains(text(),'Organization')]")
    public WebElement Organizationsettings;



}



package com.pages.adminWebex;

import com.pages.developWebex.LoginPages;
import com.utilities.ui.BrowserUtils;
import com.utilities.ui.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage implements LoginPages {
    public AdminLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "email")
    public WebElement email ;

    @FindBy(xpath = "//span[.=' Sign In ']")
    public WebElement buttonSignIn1;

    @FindBy(id ="IDToken2")
    public WebElement password;

    @FindBy(id = "Button1")
    public WebElement buttonSignIn2;

    @FindBy(xpath = "//button[2]")
    public WebElement moduleWindowsButton;

    @FindBy(xpath = "//h3[.='Unauthorized']")
    public WebElement unauthorizedMessage;

    @Override
    public void login(String email,String password){

        this.email.sendKeys(email);
        this.buttonSignIn1.click();
        BrowserUtils.waitForVisibility(this.password, 2);
        this.password.sendKeys(password);
        this.buttonSignIn2.click();


    }
}

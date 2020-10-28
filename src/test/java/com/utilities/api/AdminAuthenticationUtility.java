package com.utilities.api;

import com.pages.developWebex.LoginPage;

import com.pages.developWebex.LoginPages;
import com.step_definitions.BaseStep;
import com.utilities.common.Environment;
import com.utilities.common.POJOScenario;
import com.utilities.ui.BrowserUtils;
import com.utilities.ui.Driver;

public class AdminAuthenticationUtility implements AuthenticationUtility{


    public AdminAuthenticationUtility(POJOScenario pojoScenario) throws Exception {
        String app = (String)pojoScenario.getObject("app");
        String email=null, password = null;


        switch (user.toLowerCase() + " " + app){
            case"admin admin":
                email = Environment.getProperty("admin_email");
                password = Environment.getProperty("admin_password");
                break;
            case"user admin":
                email = Environment.getProperty("user_email");
                password = Environment.getProperty("user_password");
                break;
            default:
                throw new Exception("Wrong user Type " +user);
        }
        //adminLoginPage.login(email,password);
    }



    @Override
    public String getBearerToken(){

        String url = Environment.getProperty("url_developers");
        Driver.getDriver().get(url);
        String email = null,password = null;
        email = Environment.getProperty("admin_email");
        password = Environment.getProperty("admin_password");
        loginPage.tokenButton.click();
        BrowserUtils.waitForVisibility(loginPage.okButton,3);
        loginPage.okButton.click();

        return BrowserUtils.copyFromBuffer();

    }

    @Override
    public boolean commonLogin(String user, String password, LoginPages loginPages) {


        loginPages.login(user, password);

        return false;
    }

    @Override
     public String getPassword(){
            return this.password;
     }


    @Override
     public String getUser(){
            return this.user;
     }


}

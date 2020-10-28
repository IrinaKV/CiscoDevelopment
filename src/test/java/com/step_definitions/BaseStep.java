package com.step_definitions;

import com.pages.adminWebex.*;
import com.pages.developWebex.LoginPage;
import com.utilities.api.AdminAuthenticationUtility;
import com.utilities.api.AuthenticationUtility;
import com.utilities.common.POJOScenario;
import com.utilities.ui.Driver;
import com.utilities.ui.Pages;
import io.cucumber.core.gherkin.Scenario;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class BaseStep{
    private static Scenario scenario;

   // protected Pages pages = new Pages();


    POJOScenario pojoScenario = new POJOScenario(scenario);
 protected AuthenticationUtility authenticationUtility = new AdminAuthenticationUtility(pojoScenario);
    AdminLoginPage adminLoginPage = new AdminLoginPage();
    OverviewPage overviewPage = new OverviewPage();
    UsersPage users = new UsersPage();
    WorkspacesPage workspaces = new WorkspacesPage();
    DevicesPage devices = new DevicesPage();
    AppsPage apps = new AppsPage();
    AccountPage account = new AccountPage();
    OrganizationsettingsPage organizationSettings = new OrganizationsettingsPage();

   // protected static Map<String, Object> user;


}

@adminLogin
Feature: Page navigation links
  Scenario Outline: Go to page <page>
    Given I am on the admin login page
    And I login to application as a <role>
    And I deny perches the plan
    When I click on "<link>"  link
    Then "<page>" page should be displayed
    Examples:
    |role |link       |page|
    |admin|Users      |users|
    |admin|Workspaces |workspaces|
    |admin|Devices    |devices|
    |admin|Apps       |apps  |
    |admin|Account    |account|
    |admin|Organizationsettings|settings|







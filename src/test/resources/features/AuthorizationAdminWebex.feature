@authorAdmin
Feature: Authorization on Admin Webex application
  Scenario Outline: I login as as <role> in the <app> for checking <message>
    Given I am on the admin login page
    When I login to application as a <role>
    Then I get the expected "<message>"
    Examples:
    |role|message|app|
    |user |unauthorized|admin|
    |admin|buyProduct  |admin|
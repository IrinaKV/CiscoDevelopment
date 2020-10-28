Feature: Show info about organization

 Scenario: Show info about organization
    Given I am on Cisco Webex app
    When I do request about organization
    Then I get list of my organizations
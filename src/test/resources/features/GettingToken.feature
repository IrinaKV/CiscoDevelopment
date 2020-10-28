@token
Feature: Getting token
  Scenario: Getting token
  Given: I am on the developer site
    And I login on developer site
    When I click on on token button
    Then I get my token

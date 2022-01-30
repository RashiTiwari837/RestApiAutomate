#StepbyStep
Feature: feature to test login functionality

  Scenario: Check login is successfull
    Given user is on login page
    When enters correct username and password
    And clicks on login button
    Then user should be navigated to home page

  
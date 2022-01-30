Feature: User should be able to login

  Scenario: User should login properly
    Given user is in login page
    When enters correct username and password
    And clicks on login
    Then they should be able to login

    

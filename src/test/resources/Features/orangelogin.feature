Feature: User should be able to login
@ignored
  Scenario Outline: User should login properly
    Given ouser is in login page
    When oenters correct  <username> and <password>
    And oclicks on login
    Then othey should be able to logins

    Examples: 
      | username  | password  |
      | admin     | admin123  |
      | admintest | incorrect |

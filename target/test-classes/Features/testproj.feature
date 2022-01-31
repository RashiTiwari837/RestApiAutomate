Feature: User should be able to login

  Scenario Outline: User should login properly
    Given user is in login page
    When enters correct <username> and <password>
    And clicks on login
    Then they should be able to login

    

    Examples: 
      | username  | password  |
      | Rashi     |12345  |
      | admintest |344|
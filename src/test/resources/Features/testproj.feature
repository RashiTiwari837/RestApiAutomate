Feature: User should be able to login
@ignored
  Scenario Outline: User should login properly
    Given user is in login page
    When enters correct <username> and <password> # action
    And clicks on login
    Then they should be able to login #Verify as per expectation

    

    Examples: 
      | username  | password|
      | Rashi     |12345|
      | admintest |344|
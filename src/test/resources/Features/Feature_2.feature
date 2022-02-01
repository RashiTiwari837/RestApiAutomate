Feature: to fill the form

Scenario: User should be able to fill form
Given User is in login page
When user enters loginid and password
|Rashi|12345|
And clicks on submit button
Then user should be able to login
Then user enters detail
|Iceland|tower6|tests@gmail.com|90|
Then user clicks on save
Then user closes the browser

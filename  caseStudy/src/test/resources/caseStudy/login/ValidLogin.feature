Feature: Is the Login of the user valid

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    And user enters <username> and <password>
    When user clicks on login button
    Then user is navigated to the home page
    Examples:
      | username | password |
      | Laurenz  | 12345    |
      | Clara    | 12345    |
Feature: Is the Girth of the Package valid?
  The Girth of the package should be under 350 cm


  Scenario Outline: Check if the girth of the package is valid
    Given browser is open
    And user is navigated to homepage
    When user enters length <length>
    And user enters broad <broad>
    And user enters height <height>
    And user clicks on register package
    Then user is navigated to the package-register page
    And no error regarding the girth should be shown
    Examples:
      | length | broad | height |
      | 10     | 10    | 10     |
      | 50     | 50    | 20     |
      | 100    | 100   | 40     |



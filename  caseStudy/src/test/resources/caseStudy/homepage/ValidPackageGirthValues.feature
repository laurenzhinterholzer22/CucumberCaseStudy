Feature: Is the Girth of the Package valid?
  The Girth of the package should be under 350 cm


  Scenario Outline: Check if the girth of the package is valid
    Given browser is open
    * user is navigated to homepage
    * user enters length <length>
    * user enters broad <broad>
    * user enters height <height>
    When user clicks on register package
    Then user is navigated to the package-register page
    But no error regarding the girth should be shown
    Examples:
      | length | broad | height |
      | 10     | 10    | 10     |
      | 50     | 50    | 20     |
      | 80    | 80   | 40     |



Feature: Is the Cost Calculation of the Package valid?
  If the senders and receivers location is in Austria or Germany the Shipping of the Package should cost:
  weight < 10: 9
  weight < 25: 19
  weight >= 25: 29
  If the sender or receivers location is in Switzerland the Shipping of the Package should cost:
  weight < 10: 18
  weight >= 10: 36

  Scenario Outline: Check if the cost calculation of the package is valid
    Given browser is open
    And user is navigated to homepage
    And user enters length <length>
    And user enters broad <broad>
    And user enters height <height>
    And user enters weight <weight>
    And user enters senders location <senders_location>
    And user enters receivers location <receivers_location>
    When user clicks on register package
    Then user is navigated to the package-register page
    And the price <price> of the shipping of the package should be shown
    Examples:
      | length | broad | height | weight | senders_location | receivers_location | price |
      | 10     | 10    | 10     | 5      | Austria          | Austria            | 9     |
      | 50     | 50    | 20     | 15     | Germany          | Austria            | 19    |
      | 100    | 100   | 40     | 30     | Austria          | Germany            | 29    |
      | 10     | 10    | 10     | 5      | Switzerland      | Switzerland        | 18    |
      | 10     | 10    | 10     | 20     | Germany          | Switzerland        | 36    |

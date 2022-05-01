Feature: Is the senders Location valid?
  The Packages can only be sent from Austria, Switzerland and Germany

  Scenario Outline: The senders Location is valid or not valid
    Given senders location is "<senders_location>"
    When I send the package
    Then I should be told "<answer>"

    Examples:
      | senders_location  | answer |
      | Austria           | Yes    |
      | Switzerland       | Yes    |
      | Germany           | Yes    |
      | Hungary           | No     |
      | anything else!    | No     |
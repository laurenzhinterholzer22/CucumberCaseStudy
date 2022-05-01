Feature: Is the senders Location valid?
  The Packages can only be sent from Austria, Switzerland and Germany

  Scenario: Austria is a valid Location
    Given senders location is Austria
    When I send the austrian package
    Then I should be told Yes

  Scenario: Hungary isn't  a valid Location
    Given senders location is Hungary
    When I send the hungarian package
    Then I should be told No
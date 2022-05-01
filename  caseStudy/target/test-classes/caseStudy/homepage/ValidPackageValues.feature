

Feature: Are the Values of the Package valid?

  Background: opens browser and navigates to the homepage
    Given browser is open
    And user is navigated to homepage


    Scenario Outline: Check if the length of the package is valid
      Given user enters length <length>
      When  clicks on register package
      Then user is navigated to the package-register page
      And no error regarding the length should be shown
      Examples:
        | length |
        | 10     |
        | 150    |
        | 100    |

    Scenario Outline: Check if the broad of the package is valid
      Given user enters broad <broad>
      When clicks on register package
      Then user is navigated to the package-register page
      And no error regarding the broad should be shown
      Examples:
        | broad |
        | 10     |
        | 120    |
        | 100    |

    Scenario Outline: Check if the height of the package is valid
      Given user enters height <height>
      When clicks on register package
      Then user is navigated to the package-register page
      And no error regarding the height should be shown
      Examples:
        | height  |
        | 10      |
        | 6       |
        | 70      |

    Scenario Outline: Check if the weight of the package is valid
      Given user enters weight <weight>
      When clicks on register package
      Then user is navigated to the package-register page
      And no error regarding the weight should be shown
      Examples:
        | weight |
        | 10     |
        | 30    |
        | 40    |

    Scenario Outline: Check if the Senders Location of the package is valid
      Given user enters senders location <senders_location>
      When clicks on register package
      Then user is navigated to the package-register page
      And no error regarding the senders location should be shown
      Examples:
        | senders_location  |
        | Austria           |
        | Germany           |
        | Switzerland       |


    Scenario Outline: Check if the Receivers Location of the package is valid
      Given user enters receivers location <receivers_location>
      When clicks on register package
      Then user is navigated to the package-register page
      And no error regarding the receivers location should be shown
      Examples:
        | receivers_location  |
        | Austria           |
        | Germany           |
        | Switzerland       |
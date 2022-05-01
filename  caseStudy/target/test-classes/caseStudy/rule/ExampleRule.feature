Feature: Discount of the packages between 01.07.2022 and 31.07.2022
  In July the Packages should get a discount of 2€ per Package

  Rule: Discount between 01.07.2022 and 31.07.2022

    Example: Discount in July
      Given today is 05.07.2020
      When user is registering a package
      Then user should get a discount of 2€

    Example: No Discount in August
      Given today is 05.08.2020
      When user is registering a package
      Then user should not get a discount


Feature: Validate you are able to add items to the cart
  Scenario: validate use case 010
    Given I am opening sauce page
    When I enter "standard_user" as username
    Then I enter "secret_sauce" as password
    And I click on login button

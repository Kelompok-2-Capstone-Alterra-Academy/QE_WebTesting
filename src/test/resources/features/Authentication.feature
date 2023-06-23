Feature: Authentication

  @Login
  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter email "mentor.satu@gmail.com"
    And I enter password "12345678"
    And I click login button
    Then I am on the home page





Feature: Delete


  Scenario: Mentor cancel delete video content before upload
    Given I am on the home page
    When I click on subject course content
    Then I am on the course page
    And I cancel delete content
    Then I success cancel delete content

  @Delete
  Scenario: Mentor delete content videos uploaded in courses
    Given I am on the home page
    When I click on subject course content
    Then I am on the course page
    And I delete content
    Then I success delete content
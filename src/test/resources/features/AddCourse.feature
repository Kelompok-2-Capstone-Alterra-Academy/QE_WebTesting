Feature: Add Course

  Scenario: Mentor add course
    Given I am on the homepage
    When I click on the Add Course button
    And I Fill in the Course Name field "Matematika"
    And I fill in the Live Session Schedule field "Kamis, Jumat 12.00 - 14.00"
    And I click tumbnail logo
    And I Choose the thumbnail
    And I Click on the Add Course button
    Then I success add course
Feature: Add Course

  Scenario: Mentor add course
    Given I am on the homepage
    When I click on the Add Course session
    And I fill in the Course Name field "Biologi"
    And I fill in the Live Session Schedule field "Kamis, Jumat 12.00 - 14.00"
    And I click tumbnail logo
    And I choose the thumbnail
    And I click on the Add Course button
    Then I success add course

  Scenario: Mentor cancel the add of a course
    Given I am on the homepage
    When I click on the Add Course session
    And I fill in the Course Name field "Fisika"
    And I fill in the Live Session Schedule field "Kamis, Jumat 12.00 - 14.00"
    And I click tumbnail logo
    And I choose the thumbnail
    And I click on the cancel button
    Then I success add course

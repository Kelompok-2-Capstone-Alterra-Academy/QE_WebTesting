Feature: Add Material

  @Material
  Scenario: Mentor add material to part of the course
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I click plus icon
    And I add new section course
    And I add new material section course
    Then I success add material section course

  Scenario: Mentor cancel save material to part of the course
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I click plus icon
    And I add new section course
    And I cancel rename new video section course
    Then I success cancel rename video section course

  Scenario: Mentors can add a description material
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I click plus icon
    And I add new section course
    And I add new video section course
    And I add new description video
    Then I success add video section course

  Scenario: Mentor add to material
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I click plus icon
    And I add new section course
    And I add new video section course
    And I add new description video
    And I add new video course
    Then I success add video section course

  Scenario: Mentor search for video from the either folder other with keyword
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I click plus icon
    And I add new section course
    And I add new video section course
    And I add new description video
    And I search for video from the either folder
    Then I success add video section course
Feature: Add Video


  Scenario: Mentor cancel save video names to part of the course
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I click plus icon
    And I add new section course
    And I cancel rename new video section course
    Then I success cancel rename video section course


  Scenario: Mentor can save video to part of the course
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new video section course
    Then I success add video section course


  Scenario: Mentors can add a description video
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new description video
    Then I success add video section course


  Scenario: The mentor searches for material from one of the folders with the correct folder name keywords
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I search for video from the either folder
    Then I success add video section course


  Scenario: Mentor add to video
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new video course
    Then I success add video section course





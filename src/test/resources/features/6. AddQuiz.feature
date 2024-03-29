Feature: Add Quiz


  Scenario: Mentor cancel save quiz to part of the course
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I cancel rename new quiz section course
    Then I success cancel rename quiz section course


  Scenario: Mentor can save quiz to part of the course
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new quiz section course
    Then I success add course quiz content


  Scenario: Mentors can add a description quiz
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new description quiz
    Then I success add course quiz content


  Scenario: The mentor searches for quiz from one of the folders with the correct folder name keywords
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I search for quiz from the either folder
    Then I success add course quiz content

  @Course
  Scenario: Mentor add to quiz
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new quiz course
    Then I success add course quiz content
Feature: Giving Grades


  Scenario: Mentors look for valid student names to be assessed
    Given I am on the home page
    When I click on subject course section
    Then I am on the course page
    And I search student names
    Then I success search student names


  Scenario: Mentor can provide assessments to students
    Given I am on the home page
    When I click on subject course section
    Then I am on the course page
    And I search student names
    And I provide assessments to students
    Then I success provide assessments to students

  @GivingGrades
  Scenario: The mentor downloads the answer file
    Given I am on the home page
    When I click on subject course section
    Then I am on the course page
    And I search student names
    And  I downloads the answer file
    Then I success downloads the answer file


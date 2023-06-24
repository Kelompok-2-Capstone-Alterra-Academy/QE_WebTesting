Feature: Customer

  Scenario: Mentors can see students on one of the courses
    Given I am in the home page
    When I click customer section
    Then I am on the customer page
    And I select a subject on choose course option
    Then I see students of the courses

  Scenario: Mentors can view students based on a certain order
    Given I am in the home page
    When I click customer section
    Then I am on the customer page
    And I select a subject on choose course option
    And I do sorting students
    Then I see students of the courses

  Scenario: Mentor can search for the student name to see student progress
    Given I am in the home page
    When I click customer section
    Then I am on the customer page
    And I select a subject on choose course option
    And I do sorting students
    And I search for the student name
    Then I see students of the courses
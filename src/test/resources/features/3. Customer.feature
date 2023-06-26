Feature: Customer


  Scenario: Mentor can see students on one of the courses
    Given I am on the home page
    When I click customer section
    Then I am on the customer page
    And I select a subject on choose course option
    Then I see students of the courses


  Scenario: Mentor can view students based on a certain order
    Given I am on the home page
    When I click customer section
    Then I am on the customer page
    And I select a subject on choose course option
    And I do sorting students
    Then I see students of the courses


  Scenario: Mentor can search for the student name to see student progress
    Given I am on the home page
    When I click customer section
    Then I am on the customer page
    And I select a subject on choose course option
    And I do sorting students
    And I search for the student name
    Then I see students of the courses


  Scenario: Mentor can contact students on one of the courses
    Given I am on the home page
    When I click customer section
    Then I am on the customer page
    And I select a subject on choose course option
    And I click contact one of students
    Then I see students of the courses


  Scenario: Mentor cancel remove students
    Given I am on the home page
    When I click customer section
    Then I am on the customer page
    And I select a subject on choose course option
    And I cancel remove students
    Then I see students of the courses

  @Customer
  Scenario: Mentor can remove students
    Given I am on the home page
    When I click customer section
    Then I am on the customer page
    And I select a subject on choose course option
    And I remove students
    Then I see students of the courses
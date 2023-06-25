Feature: Add Task

  Scenario: Mentor cancel creates a new assignment section
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I cancel rename new assignment section course
    Then I success cancel rename assignment section course

  Scenario: Mentor creates a new assignment section
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new assignment section course
    Then I success add assignment section course

  Scenario: Mentor can creates new description on the assignment
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new description assignment
    Then I success add assignment section course

  Scenario: Mentor can cancel schedule new assignment deadlines
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I cancel schedule for assignment
    Then I success add assignment section course

  Scenario: Mentor can schedule new assignment deadlines
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add schedule for assignment
    Then I success add assignment section course

  Scenario: Mentor can schedule new assignment deadlines next month
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add schedule for assignment deadlines next month
    Then I success add assignment section course

  Scenario: Mentor can search for assignment from the either folder other with keyword
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I search for assignment from the either folder
    Then I success add assignment section course

  Scenario: Mentor add new assignment
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new assignment course
    Then I success add assignment section course
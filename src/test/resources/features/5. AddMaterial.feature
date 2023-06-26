Feature: Add Material


  Scenario: Mentor cancel save material to part of the course
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I cancel rename new material section course
    Then I success cancel rename material section course


  Scenario: Mentor can save material to part of the course
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new material section course
    Then I success add course material content


  Scenario: Mentors can add a description material
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new description material
    Then I success add course material content


  Scenario: The mentor searches for material from one of the folders with the correct folder name keywords
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I search for material from the either folder
    Then I success add course material content


  Scenario: Mentor add to material
    Given I am on the home page
    When I click on the subject course section
    Then I am on the course page
    And I add new material course
    Then I success add course material content
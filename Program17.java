@TestBackground
Feature: Test Background feature in Cucumber

  Background: User is logged in application
    Given User is onto home page of application
    When I enter credentials in form of user n pswd
    Then I should be successfully logged in

  @Directory @smoke
  Scenario: Validate Directory Functionality
  When I click on Directory Tab
  And Search by Name or Designation
  Then I should be able to read employee details
  
  @JobGrades
  Scenario: Validate Job Grades Functionality
  When I move to Job Grades under Admin Tab
  Then I should be able to read Grade Info 
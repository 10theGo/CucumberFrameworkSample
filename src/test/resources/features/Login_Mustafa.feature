Feature: All user types should be able to login
@wip
  Scenario Outline: Login as "<userType>"
    Given  I am on the login page
    When I enter user name and password for "<userType>"
    And I click login button
    Then I should be able to login
    Examples:
      | userType |
      | driver   |

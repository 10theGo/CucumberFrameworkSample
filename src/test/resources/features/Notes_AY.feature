@notes
Feature: Creating Notes

  Background:
    Given the user is on the login page
    When the user enters valid "<username>" and "<password>"
    Then the user should be able to login to the app

  Scenario: Going to the Notes tab
    When the user clicks on the Notes tab
    And the Create button on the Notes page
    Then the user should land on Notes/New page



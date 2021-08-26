@notes
Feature: Creating Notes

  Background:
    Given the user is already logged in to the app

  Scenario: Going to the Notes tab
    When the user clicks on the Notes tab
    And the Create button on the Notes page
    Then the user should land on Notes/New page




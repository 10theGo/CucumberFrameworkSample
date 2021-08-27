@notes
Feature: Creating Notes

  Background:
    Given the user is already logged in to the app

#  Scenario: Going to the Notes tab
#    When the user clicks on the Notes tab
#    And the Create button on the Notes page
#    Then the user should land on Notes-New page

  Scenario: Choosing a tag
    Given the user clicks on the Notes tab
    And the Create button on the Notes page
    And the user should land on Notes-New page
    When the user clicks on the tags dropdown menu
    Then the user should be able to choose a tag from existing choices



#  Scenario: Typing a tag
#
#
#  Scenario: Taking notes
#
#
#  Scenario: Setting a schedule
#
#
#  Scenario: Saving the note




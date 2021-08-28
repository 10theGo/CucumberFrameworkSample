@wip_onurcan
Feature: Notes Functionality

  Background:
    Given the user_onurcan should be logged in with valid credentials
    And the user_onurcan click Notes tab
    And the user_onurcan should click Create button


  Scenario: Note editing box appears
    Then the user_onurcan should see the note editing box


  Scenario: the user can select / create tag
    When the user_onurcan clicks tags
    Then the user_onurcan can create tag
    And the user_onurcan can select tag

  Scenario: the user type any note.
    Then the user_onurcan type any note.

  Scenario Outline: user can select the date/type of note <schedule>
    When the user_onurcan clicks "<schedule>"
    Then the "<schedule>" should be selected

    Examples:
      | schedule  |
      | New       |
      | Today     |
      | This Week |
      | Later     |

  Scenario: the user can Save
    When the user_onurcan type any note.
    Then the user_onurcan can save





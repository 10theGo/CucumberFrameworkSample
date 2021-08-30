@wip_Shiva_note
Feature: Notes Functionality

  Background:
    Given the User is on the login page
    When the User should be able to Login with "salesmanager15@info.com" and "salesmanager" _shiva
    Then the User should be able to Login
    And the user click Notes module_shiva
    And the user should click Create button_shiva


 Scenario: User can enter to note page
   Then User able to see "New - Odoo" on Title_shiva


  Scenario: the user can select / create tag
    When the user clicks tags_shiva
    Then the user can create tag_shiva
    And the user can select tag_shiva

  Scenario: the user type any note.
    Then the user type any note_shiva


  Scenario: the user can Save
      Then the user can save_shiva

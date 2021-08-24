Feature: Note Functionality
  As a user I should be able to create notes

  Background:
    Given The user is on the login page
    And The user logs in as "salesmanager"
    And The user navigates to "Notes" tab_brhn
    And The user clicks on Create button_brhn

  Scenario: Create Note button & Note Editing Box
    Then Note Editing Box should be appear_brhn

  Scenario: Select Tag on Editing Box
    When The user selects 3. tag_brhn
    Then 3. tag should be selected_brhn

  Scenario: Create Tag on Editting Box
    When The user clicks on Tags Dropdown / Create&Edit field_brhn
    And The user writes a tag name and saves_brhn
    Then Tag name should be selected_brhn

  Scenario: Type Some Note on Note Panel Body
    When The user types some notes on Note Panel Body_brhn
    Then Typed notes should be on the panel body_brhn

  Scenario Outline: : Selecting date/type of note <date/type of note>
    When The User selects "<date/type of note>" as date type
    Then "<date/type of note>" should be selected
    Examples:
      | <date/type of note> |
      | New                 |
      | Today               |
      | This Week           |
      | Later               |
      | Notes               |

    Scenario: Saving the note
      When The user selects 3. tag_brhn
      And The user types some notes on Note Panel Body_brhn
      And The User selects "This Week" as date type
      And The user saves the note
      Then The note should be saved
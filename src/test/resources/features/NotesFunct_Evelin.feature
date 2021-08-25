
  Feature: Login functionality

    Background:
      Given the User_Evelin is on the login page
      And enter valid credentials "salesmanager15@info.com" and "salesmanager"
      And user enters to "#Inbox" page
      When user_Evelin clicks on Notes module
      And user_Evelin navigates to "Notes" page

      Scenario: User_Evelin navigates to Notes module
        Then user_Evelin sees "Create" button under Notes subtitle

      Scenario: User_Evelin can select/create tag
        When user_Evelin clicks on Create module
        Then user_Evelin navigates to Note "New - Odoo" page

      Scenario: User_Evelin can change colour of tags
        Given user_Evelin clicks on Create module
        When user_Evelin clicks on Tags box
        And user_Evelin clicks on color option
        Then color tag is displayed in Tags box
        When user_Evelin clicks on color displayed in tag box
        Then user_Evelin can select a color available

      Scenario: User_evelin can edit text in panel editor
        Given user_Evelin clicks on Create module
        And user_Evelin clicks on panel editor module
        When user_Evelin write some text
        Then "This is a text for checking editor text box" is displayed on screen




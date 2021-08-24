
  Feature: Login functionality

    Background:
      Given the User_Evelin is on the login page
      And enter valid credentials "salesmanager15@info.com" and "salesmanager"
      And user enters to "#Inbox" page
      When user_Evelin clicks on Notes module
      And user_Evelin navigates to "Notes" page

      Scenario: User_Evelin navigates to Notes module
      Then user_Evelin sees "Create" button under Notes subtitle


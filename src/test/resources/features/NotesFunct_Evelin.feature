
  Feature: Login functionality

    Background:
      Given the User_Evelin is on the login page
      And enter valid credentials "salesmanager15@info.com" and "salesmanager"
      And user enters to "#Inbox - Odoo" page
      When user_Evelin clicks on Notes module
      And user_Evelin navigates to "Notes - Odoo" page

      Scenario: User_Evelin navigates to Notes module
        Then user_Evelin sees "Create" button under Notes subtitle

      Scenario: User_Evelin can select/create tag
        When user_Evelin clicks on Create module
        Then user_Evelin navigates to Note "New - Odoo" page



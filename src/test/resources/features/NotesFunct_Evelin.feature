
  Feature: Login functionality

    Scenario:
      Given the User_Evelin is on the login page
      And enter valid credentials "salesmanager15@info.com" and "salesmanager"
      And user enters to "#Inbox" page
      When user_Evelin clicks on "Notes" module
      Then user_Evelin navigate to {string} page
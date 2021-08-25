Feature: Logout Functionality
  As a user, I should be able to logout

  Scenario Outline: Log out from user menu as "<userType>"
    Given The user is on the login page
    And The user logs in as "<userType>"
    Then The user should be on the Inbox page
    When The user clicks on user menu
    And The user clicks on logout
    Then The user should be successfully logout
    Examples:
      | userType         |
      | salesmanager     |
      | posmanager       |
      | inventorymanager |
      | expensesmanager  |
      | manufuser        |
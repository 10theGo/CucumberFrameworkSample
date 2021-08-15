Feature: Login func

  @login
  Scenario Outline: Login with valid credentials as "<userType>"
    Given The user is on the login page
    When The user logs in as "<userType>"
    Then The user should be on the "Inbox" page
    Examples:
      | userType         |
      | salesmanager     |
      | posmanager       |
      | inventorymanager |
      | expensesmanager  |
      | manufuser        |
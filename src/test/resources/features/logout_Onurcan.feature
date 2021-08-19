Feature: Log out


  Scenario Outline: <userType> should be log out
    Given the user should be logged in with valid "<username>" and "<password>"
    When the User clicks logout button
    Then the User should be logged out

    Examples:
      | userType               | username                   | password         |
      | Sales Manager          | salesmanager15@info.com    | salesmanager     |
      | Point of Sales Manager | posmanager10@info.com      | posmanager       |
      | Inventory Manager      | imm10@info.com             | inventorymanager |
      | Expenses Manager       | expensesmanager10@info.com | expensesmanager  |
      | Manufacturing User     | manuf_user10@info.com      | manufuser        |



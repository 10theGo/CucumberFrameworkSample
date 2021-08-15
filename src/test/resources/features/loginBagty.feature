@login @smoke

Feature: log in

  Background:
    Given the user is on the login page


  Scenario Outline: all types of users can log in with valid credentials
    When the <userType> enters valid "<username>" and "<password>"
    Then the user should be able to login
    Examples:
      | userType               | username                   | password         |
      | Sales Manager          | salesmanager15@info.com    | salesmanager     |
      | Point of Sales Manager | posmanager10@info.com      | posmanager       |
      | Inventory Manager      | imm10@info.com             | inventorymanager |
      | Expenses Manager       | expensesmanager10@info.com | expensesmanager  |
      | Manufacturing User     | manuf_user10@info.com      | manufuser        |


  Scenario Outline: none of the user types can log in with invalid credentials
    When the <userType> enters invalid or empty "<username>" or "<password>"
    Then the user should not be able to login
    Examples:
      | userType               | username                      | password            |
      | Sales Manager          | salesmanager15@info.com       | NOTsalesmanager     |
      | Point of Sales Manager | posmanager10@info.com         | NOTposmanager       |
      | Inventory Manager      | imm10@info.com                | NOTinventorymanager |
      | Expenses Manager       | expensesmanager10@info.com    | NOTexpensesmanager  |
      | Manufacturing User     | manuf_user10@info.com         | NOTmanufuser        |
      | Sales Manager          | NOTsalesmanager15@info.com    | salesmanager        |
      | Point of Sales Manager | NOTposmanager10@info.com      | posmanager          |
      | Inventory Manager      | NOTimm10@info.com             | inventorymanager    |
      | Expenses Manager       | NOTexpensesmanager10@info.com | expensesmanager     |
      | Manufacturing User     | NOTmanuf_user10@info.com      | manufuser           |
      | Sales Manager          | salesmanager15@info.com       |                     |
      | Point of Sales Manager | posmanager10@info.com         |                     |
      | Inventory Manager      | imm10@info.com                |                     |
      | Expenses Manager       | expensesmanager10@info.com    |                     |
      | Manufacturing User     | manuf_user10@info.com         |                     |
      | Sales Manager          |                               | salesmanager        |
      | Point of Sales Manager |                               | posmanager          |
      | Inventory Manager      |                               | inventorymanager    |
      | Expenses Manager       |                               | expensesmanager     |
      | Manufacturing User     |                               | manufuser           |

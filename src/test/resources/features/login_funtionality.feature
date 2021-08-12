Feature: Login as an authorized user

  Background:
    Given the user is on the login page

  @loginWithValidCredentials
  Scenario Outline: : User login with valid credentials
    When user enters valid "<validUsername>" and "<validPassword>"
    Then user enters to "Inbox" page

  Examples:

  |validUsername              |validPassword   |
  |salesmanager15@info.com    |salesmanager    |
  |salesmanager5@info.com     |                |
  |pos manager10@info.com     |posmanager      |
  |expensesmanager10@info.com |expensesmanager |
  |inn10@info.com             |inventorymanager|
  |manu_user10@info.com       |manufuser       |

  @invalidUsernameOrPassword
  Scenario: User login with invalid
    When user enters invalid username "<invalidUsername>" or password "<invalidPassword>"
    Then user sees a "login" error message

  Examples:

  |invalidUsername            |invalidPassword |
  |salesmanager1@info.com     |salesmanager    |
  |salesmanager5@info.com     |alesman         |
  |pos_manager10@info.com     |posmanag        |
  |posmanager10@info.com      |posmanager      |
  |expensesmanager10@info.com |expensesmanager |
  |expensesmanager10@inf.com  |expensesmanager |
  |inn10@info.com             |inventory_anager|
  |manu_user_10@info.com      |manufuser       |
  |manu_user10@info.com       |manuf/user      |

  @emptyLoginInputBox
  Scenario: User leaves any login input box blanked
    When any login input box is empty "" ""
    Then user sees a login error message


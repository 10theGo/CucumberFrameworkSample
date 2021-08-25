@login
Feature:login functionality

  Background:
       Given the User is on the login page

@validAccount
  Scenario Outline: Login with different valid accounts
    When  the User enters the valid information "<username>" "<password>"
    Then the User should be able to Login
    Examples:
      | username                   | password         |
      | salesmanager15@info.com    | salesmanager     |
      | posmanager10@info.com      | posmanager       |
      | imm10@info.com             | inventorymanager |
      | expensesmanager10@info.com | expensesmanager  |
      | manuf_user10@info.com      | manufuser        |

@InvalidAccount
  Scenario Outline: user can not login with different invalid acoount
    When the User enters the invalid information "<username>" or "<password>"
    Then the User should not be able to Login

    Examples:
      | username                   | password         |
      | salemanager@info.com       | salesmanager     |
      | posmanager@info.com        | posmanager       |
      | imm@info.com               | inventorymanager |
      | expensesmanager10@info.com | expensemanager   |
      | manuf_user10@info.com      | mnufuser         |

@BlanketBox
  Scenario Outline: user can not login with blanket box
    When the User enters the invalid information "<username>" or "<password>"
    Then the User should not be able to Login
    Examples:

      | username                   | password     |
      |                            | salesmanager |
      | posmanager10@info.com      |              |
      | expensesmanager10@info.com |              |
      |                            | manufuser    |

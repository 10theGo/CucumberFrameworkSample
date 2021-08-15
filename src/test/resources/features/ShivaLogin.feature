@login
Feature: Users should be able to login with valid credential

  Background:
       Given the user is on the login page


  Scenario Outline: Login with different valid accounts
    When  the user enters the valid information "<username>" "<password>"
    Then the user should be able to Login
    Examples:
      | username                   | password         |
      | salesmanager15@info.com    | salesmanager     |
      | posmanager10@info.com      | posmanager       |
      | imm10@info.com             | inventorymanager |
      | expensesmanager10@info.com | expensesmanager  |
      | manuf_user10@info.com      | manufuser        |


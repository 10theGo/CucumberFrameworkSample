Feature: Login

  Background:
    Given the user should be on the login page

  Scenario Outline: The user should be logged in with valid credentials
    When  the user enter valid "<username>" and "<password>"
    Then the user should be able to log in

    Examples:
      | username                   | password         |
      | salesmanager15@info.com    | salesmanager     |
      | posmanager10@info.com      | posmanager       |
      | imm10@info.com             | inventorymanager |
      | expensesmanager10@info.com | expensesmanager  |
      | manuf_user10@info.com      | manufuser        |

  Scenario Outline: the user should be logged in with valid credentials
    When the user enter valid "<username>" and "<password>"
    Then the user should be able to log in

    Examples:
      | username                   | password         |
      | salesmanager15@info.com    | salesmanager     |
      | posmanager10@info.com      | posmanager       |
      | imm10@info.com             | inventorymanager |
      | expensesmanager10@info.com | expensesmanager  |
      | manuf_user10@info.com      | manufuser        |


  Scenario Outline: The user should not be able to log in with invalid credentials
    When the user enters invalid  "<username>" or "<password>"
    Then the user should not be able to log in
    Examples:
      | username                     | password          |
      #invalid username
      | Sssalesmanager15@info.com    | salesmanager      |
      | pooosmanager10@info.com      | posmanager        |
      | kimm10@info.com              | inventorymanager  |
      | EEexpensesmanager10@info.com | expensesmanager   |
      | MMmanuf_user10@info.com      | manufuser         |
      #invalid password
      | salesmanager15@info.com      | lesmanager        |
      | posmanager10@info.com        | poposmanager      |
      | imm10@info.com               | iinventorymanager |
      | expensesmanager10@info.com   | Expensesmanager   |
      | manuf_user10@info.com        | danufuser         |

  Scenario Outline: The user should not be able to log in with empty input
    When the user enters empty "<username>" or "<password>"
    Then the user should not be able to login and see "Please fill out this field" message

    Examples:
      | username                | password   |
      | Salesmanager15@info.com |            |
      |                         | posmanager |
      |                         |            |

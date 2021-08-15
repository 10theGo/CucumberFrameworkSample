
Feature: Users should be able to login with valid credential

  @login
  Scenario Outline: Login with different accounts
    Given  the user logged in as "<userType>"
    When  the user enters the "<username>" "<password>"
    Then the user should be able to Login
    Examples:
      | userType         | username                   | password
      | salesmanager     | salesmanager15@info.com    | salesmanager
      | posmanager       | posmanager10@info.com      | posmanager
      | inventorymanager | imm10@info.com             | inventorymanager
      | expensesmanager  | expensesmanager10@info.com | expensesmanager
      | manufuser        | manuf_user10@info.com      | manufuser


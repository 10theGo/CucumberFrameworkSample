@yakup
Feature: Login with valid credentials
  Scenario Outline: Login
    Given the user is on the login page
    When the user enter "<username>" and "<password>"
    Then the user should be able to logged in
    Examples:
    |username|password|
    |salesmanager15@info.com|salesmanager|
    |posmanager10@info.com|posmanager|
    |imm10@info.com|inventorymanager|
    |expensesmanager10@info.com|expenses manager|
    |manuf_user10@info.com   |manufuser       |


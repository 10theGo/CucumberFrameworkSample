
Feature: Login with Valid Credentials

  Background:
    Given the user is on the login page
  @basicSteps
  Scenario Outline: Entering valid credentials for "<usertype>"
    When the user enters valid "<username>" and "<password>"
    Then the "<usertype>" should be able to login to the app
    Examples:
      | usertype              | username                   | password         |
      | sales manager         | salesmanager15@info.com    | salesmanager     |
      | point of salesmanager | posmanager10@info.com      | posmanager       |
      | inventory manager     | imm10@info.com             | inventorymanager |
      | expenses manager      | expensesmanager10@info.com | expensesmanager  |
      | manufacture user      | manuf_user10@info.com      | manufuser        |


Feature: Login functionality

  @login
  Scenario Outline: Login with valid credentials as "<userType>"
    Given The user is on the login page
    When The user logs in as "<userType>"
    Then The user should be on the Inbox page
    Examples:
      | userType         |
      | salesmanager     |
      | posmanager       |
      | inventorymanager |
      | expensesmanager  |
      | manufuser        |

  @login
  Scenario Outline: Login attempt with "<username>" username and "<password>" password
    Given The user is on the login page
    When The user enters "<username>" username and "<password>" password
    Then The user should be on the Login page
    And Wrong login-password message should be displayed

    Examples:
      | username | password |
      | valid    | invalid  |
      | invalid  | valid    |
      | invalid  | invalid  |

  @login
  Scenario Outline: Login attempt with "<username>" username and "<password>" password
    Given The user is on the login page
    When The user enters "<username>" username and "<password>" password
    Then Please fill out this field message should be displayed for "<username>" or "<password>"
    Examples:
      | username | password |
      | empty    | valid    |
      | valid    | empty    |
      | empty    | empty    |
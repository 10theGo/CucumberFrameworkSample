Feature: LogOut Functionality

  @Logout_Shiva
  Scenario Outline: LogOut

    Given the user enters the valid information "<username>" "<password>"
    When the user clicks on avatar or name
    And user clicks on Logout button
    Then the User is on the Login page


    Examples:
      | username                   | password         |
      | salesmanager15@info.com    | salesmanager     |
      | posmanager10@info.com      | posmanager       |
      | imm10@info.com             | inventorymanager |
      | expensesmanager10@info.com | expensesmanager  |
      | manuf_user10@info.com      | manufuser        |

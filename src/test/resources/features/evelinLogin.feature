Feature: Login as an authorized user


  Background:
    Given the user is on the login page



  @loginWithValidCredentials
  Scenario Outline: : User login with valid credentials
    When user enters valid "<validUsername>" and "<validPassword>"
    Then user enters to "#Inbox" page

    Examples:
      |validUsername               |validPassword   |
      |salesmanager15@info.com     |salesmanager    |
      |salesmanager105@info.com    |salesmanager    |
      |posmanager10@info.com       |posmanager      |
      |posmanager155@info.com      |posmanager      |
      |expensesmanager10@info.com  |expensesmanager |
      |expensesmanager110@info.com |expensesmanager |
      |imm10@info.com              |inventorymanager|
      |imm160@info.com             |inventorymanager|
      |manuf_user10@info.com       |       |
      |manuf_user110@info.com      |manufuser       |
  @wip
  @invalidUsernameOrPassword
  Scenario Outline: User login with invalid
    When user enters invalid username "<username>" or password "<password>"
    Then user sees "Wrong login/password" error message

    Examples:

      |username                   |password |
      |salesmanager1@info.com     |salesmanager    |
      |salesmanager5@info.com     |alesman         |
      |pos_manager10@info.com     |posmanager        |
      |posmanager10@info.com      |posman8ager     |
      |expensesmanager@info.com   |expensesmanager |
      |expensesmanager10@inf.com  |exit            |
      |inn10@info.com             |inventory.anager|
      |Great sentence             |blablabla      |
      |manu_user_10@info.com      |manufuser       |
      |manu_user10@info.com       |manuf/user      |
#
#  @emptyLoginInputBox
#  Scenario: User leaves any login input box blanked
#    When any login input box is empty "" ""
#    Then user sees a login error message
#

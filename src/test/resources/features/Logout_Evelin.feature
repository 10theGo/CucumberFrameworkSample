
Feature: Logout from aplication

@login
@wip
  Scenario: user display user dropdawn  menu
    Given the user is on the Login page
    And enter valid credentials "salesmanager15@info.com" and "salesmanager"
    When user enters to "#Inbox" page
      And click on "dropdawn" button
#    And clicks "<typeButton>" button
    Then a drop down many is displayed
    And user clicks on "logout" button
    Then users navigate to "Login | Best solution for startups" page

#    Examples:
#    |typeButton|
#    |avatar    |
#    |name      |

